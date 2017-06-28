package internet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Receive extends JFrame implements Runnable,ActionListener{

	int port = 9898;
	InetAddress group = null;
	MulticastSocket socket = null;
	JButton ince = new JButton("开始接受");
	JButton stop = new JButton("停止接受");
	JTextArea inceAr = new JTextArea(10,10);
	JTextArea inced = new JTextArea(10,10);
	Thread thread;
	boolean b = false;
	
	public Receive(){
		super("广播数据报");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		thread = new Thread(this);
		ince.addActionListener(this);
		stop.addActionListener(this);
		
		inceAr.setForeground(Color.blue);
		
		JPanel north = new JPanel();
		north.add(ince);
		north.add(stop);
		add(north,BorderLayout.NORTH);
		
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(1,2));
		center.add(inceAr);
		center.add(inced);
		add(center,BorderLayout.CENTER);
		validate();                           //刷新
		
		try {
			group = InetAddress.getByName("192.168.1.104");
			socket = new MulticastSocket(port);
			socket.joinGroup(group);
		} catch (Exception e) {
			e.printStackTrace();
		}
		setBounds(100,50,360,380);
		setVisible(true);
		
	}
	
	public void run() {
		while(true){
			byte data[] = new byte[1024];
			DatagramPacket packet = new DatagramPacket(data,data.length,group,port);
			try {
				socket.receive(packet);
				String message = new String(packet.getData(),0,packet.getLength());
//				System.out.println(message);
				inceAr.setText("");;
				inceAr.append("正在接受的内容是：\n"+message);
				inced.append(message+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(b==true){
				break;
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ince){
			if(!thread.isAlive()){
				ince.setBackground(Color.red);
				stop.setBackground(Color.yellow);
				thread = new Thread(this);
			}
			thread.start();
			b = false;
		}
		if(e.getSource() == stop){
			ince.setBackground(Color.yellow);
			stop.setBackground(Color.red);
			b = true;
		}
		
	}
	
	public static void main(String[] a){
		Receive receive = new Receive();
		receive.setSize(460,200);
	}

}
