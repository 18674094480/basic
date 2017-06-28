package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Jframe extends JFrame{

	private void showFrame(){
		JFrame jf = new JFrame("新安江");
		Container ct = jf.getContentPane();
		JLabel label = new JLabel("这是一个JFrame窗体",JLabel.CENTER);
		URL url = Jframe.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);
		label.setIcon(icon);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		ct.add(label);
		jf.setSize(1600,1200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		new Jframe().showFrame();
	}
}
