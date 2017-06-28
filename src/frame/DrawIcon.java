package frame;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DrawIcon implements Icon{
	private int height;
	private int width;
	
	public DrawIcon(int height,int width){
		this.height = height;
		this.width = width;
	}
	public int getIconHeight() {
		return this.height;
	}

	
	public int getIconWidth() {
		return this.width;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.fillRect(x, y, width, height);
		
	}
	public static void main(String args[]){
		JFrame jf = new JFrame("这是一个图形界面");
		Container container = jf.getContentPane();
		DrawIcon icon = new DrawIcon(15,15);
		JLabel label = new JLabel("测试",icon,SwingConstants.CENTER);
		label.setOpaque(true);
		jf.add(label);
		jf.setSize(600,400);
		jf.setVisible(true);
	}

}
