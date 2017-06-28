package thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JoinTest extends JFrame{

	private Thread thread1;
	private Thread thread2;
	final JProgressBar bar1 = new JProgressBar();
	final JProgressBar bar2 = new JProgressBar();
	
	public JoinTest(){
		Container container = getContentPane();
		container.add(bar1,BorderLayout.NORTH);
		container.add(bar2,BorderLayout.SOUTH);
		bar1.setStringPainted(true);
		bar2.setStringPainted(true);
		
		thread1 =new Thread(new Runnable(){

			public void run() {
				int count =0;
				while(true){
					bar1.setValue(++count);
					try {
						Thread.sleep(100);
//						thread2.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(count == 100){
						break;
					}
				}
			}
			
		});
		thread1.start();
		thread2 =new Thread(new Runnable(){

			public void run() {
				int count =0;
				while(true){
					bar2.setValue(++count);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(count == 100){
						break;
					}
				}
			}
			
		});
		thread2.start();
	}
	
	public static void main(String[] a){
		Set<String> b = new HashSet<String>();
		b.add(null);
		b.add(null);
		JoinTest t = new JoinTest();
		t.setSize(100,100);
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
