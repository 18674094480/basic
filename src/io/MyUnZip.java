package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


public class MyUnZip {

	public static void main(String a[]){
		try {
			ZipInputStream zin = new ZipInputStream(new FileInputStream("D:\\eclipse\\workspace\\test\\newFile.zip"));
			//实例化对象，指明要解压的文件
			ZipEntry entry = zin.getNextEntry();
			while(((entry = zin.getNextEntry()) != null) && !entry.isDirectory()){
				File file = new File("D:\\eclipse\\workspace\\test\\"+entry.getName());
				System.out.println(file);
				if(!file.exists()){
					file.mkdirs();
					file.createNewFile();
				}
				zin.closeEntry();
				System.out.println(entry.getName()+"解压成功");
			}
			zin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
