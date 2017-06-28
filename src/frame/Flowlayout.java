package frame;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Flowlayout extends JFrame{

	public Flowlayout(){
		setTitle("流布局");
		Container ct = getContentPane();
		setLayout(new FlowLayout(1,10,10));
		for(int i=0;i<10;i++){
			ct.add(new Button("button"+i));
		}
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String args[]){
		new Flowlayout();
	}
}
