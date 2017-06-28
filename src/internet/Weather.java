package internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Weather extends Thread{
	String weather = "节目预报：八点有大型晚会，请收听";
	int port = 9898;
	InetAddress iaddress = null;
	MulticastSocket mlSocket = null;
	
	public Weather(){
		try {
			iaddress = InetAddress.getByName("192.168.1.104");
			mlSocket = new MulticastSocket(port);        //实例化多点套接字
			mlSocket.setTimeToLive(1);                   //制定发送范围是多点网络
			mlSocket.joinGroup(iaddress);                //加入组
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run(){
		while(true){
			DatagramPacket packet = null;
			byte data[] = weather.getBytes();
			packet = new DatagramPacket(data,data.length,iaddress,port);   //将数据打包
//			System.out.println(new String(data));                          //将广播信息输出
			try {
				mlSocket.send(packet);
				sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] a){
		Weather we = new Weather();
		we.start();
	}

}
