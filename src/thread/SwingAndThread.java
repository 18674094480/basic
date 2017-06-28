package thread;

import java.awt.Container;
import java.io.File;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SwingAndThread extends JFrame {
	private JLabel jb = new JLabel();
	private static Thread t;
	int count = 0;
	private Container container = getContentPane();

	public SwingAndThread(){
		setBounds(300, 200, 250, 100);
		container.setLayout(null);
//		File file = new File("1.jpg");
//		if(file.exists()){
//			System.out.println();
//		}
		URL url = SwingAndThread.class.getResource("1.jpg");
		Icon icon = new ImageIcon(url);
		jb.setIcon(icon);
		jb.setHorizontalAlignment(SwingConstants.LEFT);
		jb.setBounds(10,10,200,50);
		jb.setOpaque(true);
		t =new Thread(new Runnable(){

			public void run() {
				while(count<=200){
					jb.setBounds(count,10,200,50);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count+=4;
					if(count == 200){
						count = 10;
					}
				}
			}
			
		});
		t.start();
		container.add(jb);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] a){
		new SwingAndThread();
	}
	
}
