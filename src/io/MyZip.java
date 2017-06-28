package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZip {

	private void zip(String zipFileName,File inputFile){
		try {
//			FileOutputStream outputStream = new FileOutputStream(inputFile);
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(inputFile));
			
			zip(out, inputFile, "");
			System.out.println("压缩中");
//			outputStream.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void zip(ZipOutputStream out,File f,String base) throws Exception{
		if(f.isDirectory()){
			File fl[] = f.listFiles();
			out.putNextEntry(new ZipEntry(base+"/"));
			base = base.length()==0 ?"":base+"/";
			for(int i = 0;i<fl.length;i++){
				zip(out, fl[i], base+fl[i]);
			}
		}else{
			out.putNextEntry(new ZipEntry(base));
			FileInputStream in = new FileInputStream(f);
			int b;
			System.out.println(base);
			while((b = in.read())!= -1){
				out.write(b);
			}
			in.close();
		}
	}
	
	public static void main(String a[]){
		MyZip zip = new MyZip();
		zip.zip("newFile.zip", new File("newFile"));
		System.out.println("压缩完成");
	}
}
