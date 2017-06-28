package frame;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class MyJDialog extends JDialog{

	public MyJDialog(Jframe jf){
		super(jf,"这是一个对话框!",true);
		Container ct = getContentPane();
		ct.setSize(800,600);
		ct.add(new JLabel("第一个对话框！"));
		setSize(400,300);
		setBounds(120, 120, 100, 100);
	}
}
