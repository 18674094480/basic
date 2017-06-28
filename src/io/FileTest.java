package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String a[]){
		File file = new File("word.text");
		if(file.exists()){
			String path = file.getAbsolutePath();
			file.delete();
			System.out.println("文件已删除"+path);
		}else{
			try {
				file.createNewFile();
				
				FileWriter outputStream = new FileWriter(file);
				String string = "我有一直小毛驴，我从来都不骑";
				outputStream.write(string);
				outputStream.close();
				
				String name = file.getName();
				long length = file.length();
				boolean hidden = file.isHidden();
				
				FileReader inputStream = new FileReader(file);
				char byt[] = new char[1024];
				int len = inputStream.read(byt);
				String string2 = new String(byt, 0, len);
				inputStream.close();
				
				System.out.println("文件已经创建"+","+name+","+length+","+hidden);
				System.out.println(string2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
