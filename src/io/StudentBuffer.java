package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentBuffer {

	public static void main(String a[]){
		File file = new File("word.txt");
		String contens[] = {"好久不见,","最近好吗,","常联系."};
		if(file.exists()){
			String path = file.getAbsolutePath();
			file.delete();
			System.out.println("文件已删除"+path);
		}else{
			try {
				FileWriter writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer);
				for(int k =0;k<contens.length;k++){
					bw.write(contens[k]);
//					bw.newLine();
				}
				bw.flush();
				writer.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String s = null;
				while((s = br.readLine())!=null){
					System.out.println(s);
				}
				br.close();
 			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
