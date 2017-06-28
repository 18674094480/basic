package thread;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SleepMethodTest extends JFrame{
	private static Color[] color = {Color.black,Color.blue,Color.GREEN,Color.orange,Color.yellow
			,Color.red,Color.pink,Color.LIGHT_GRAY};
	private static final Random rand = new Random();
	private static Color getC(){
		return color[rand.nextInt(color.length)];
	}
	
	public SleepMethodTest(){
		Thread t = new Thread(new Runnable(){
			public void run(){
				int x = 0;
				int y = 50;
				while(true){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Graphics graphics =getGraphics();
					graphics.setColor(getC());
					graphics.drawLine(x, y, 300, y++);
					if(y==80){
						y=50;
					}
				}
			}
		});
		t.start();
	}
	
	public static void main(String[] a){
		SleepMethodTest frame = new SleepMethodTest();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
