package internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTcp {
	private ServerSocket server;
	private BufferedReader reader;
	private Socket socket;
	private PrintWriter write;
	void getServer(){
		try {
			server = new ServerSocket(8998);
			System.out.println("服务器套接字已经创建成功");
			while(true){
				System.out.println("等待客户端连接");
				socket = server.accept();
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				getClientMessage();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void getClientMessage() {

		try {
			System.out.println("获得客户机："+reader.readLine());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			if(reader!=null){
				reader.close();
			}
			
			write = new PrintWriter(socket.getOutputStream());
			write.println("服务器收到");
//			if(write!=null){
				write.close();
//			}
			if(socket!=null){
//				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] a){
		MyTcp tcp = new MyTcp();
		tcp.getServer();
	}
}
