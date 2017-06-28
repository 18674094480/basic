package internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * 
 * @author admin
 *(1)如果觉得使用netstat -ano显示出来的太多不方便查找，就输入“netstat -ano | findstr "端口号"”来进行筛选 
 *(2)再通过tasklist | findstr PID（3017）命令查询占用端口进程名称。
 *(3)杀死进程方法：  方法一：直接通过查询出占用端口进程名称，到任务管理器结束进程；  方法二：通过taskkill /pid 3017来杀死进程
 */
public class MyClient {
//	private Socket socket;
	public static void main(String[] a){
		try {
			Socket socket = new Socket("192.168.1.104",8998);
			PrintWriter writer = null;
			writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);//true是覆盖之前文件里面已经有的类容
//			共同点：两者都不刷新页面，只在原来的页面写数据.最终都是重写了抽象类Writer里面的write方法. 
//			print方法可以将各种类型的数据转换成字符串的形式输出。重载的write方法只能输出字符、字符数组、字符串等与字符相关的数据。
			writer.write("维生素此等");
			writer.close();
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(reader.readLine());
//			
			reader.close();
//			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
