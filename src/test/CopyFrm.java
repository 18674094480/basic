package test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;


public class CopyFrm extends javax.swing.JFrame {
	private JTextField text;
	private JButton jButton2;
	private JButton jButtonGo;
	private JButton jButton;
	private JTextField text2;
	private   JFileChooser jfc = new JFileChooser();

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CopyFrm inst = new CopyFrm();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public CopyFrm() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u5c0f\u732a\u8ffd\u5954\u9a70");
			{
				text = new JTextField();
				getContentPane().add(text);
				text.setBounds(31, 35, 179, 22);
			}
			{
				text2 = new JTextField();
				getContentPane().add(text2);
				text2.setBounds(33, 106, 177, 22);
			}
			{
				jButton = new JButton();
				getContentPane().add(jButton);
				jButton.setText("\u9009\u62e9\u6587\u4ef6");
				jButton.setBounds(255, 35, 111, 22);
				jButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonActionPerformed(evt);
					}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("\u9009\u62e9\u76ee\u7684\u5730");
				jButton2.setBounds(255, 106, 111, 22);
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			{
				jButtonGo = new JButton();
				getContentPane().add(jButtonGo);
				jButtonGo.setText("\u5f00\u59cb\u590d\u5236");
				jButtonGo.setBounds(125, 166, 116, 22);
				jButtonGo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonGoActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(386, 318);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButtonActionPerformed(ActionEvent evt) {
       
		
		//�ļ������������
		FileNameExtensionFilter filter =
			new FileNameExtensionFilter("�����ļ�|.txt","txt");
		
		//���ù��������ļ�ѡ����������
		jfc.setFileFilter(filter);
		
		//��ȡҪ�򿪵��ļ�����
		int result = jfc.showOpenDialog(this);
		if(result==JFileChooser.APPROVE_OPTION){//ͬ����ļ�
			File selecteFile = jfc.getSelectedFile();
			text.setText(selecteFile.getAbsolutePath());
		}
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
      		
		int result = jfc.showSaveDialog(this);
		if(result==JFileChooser.APPROVE_OPTION){//ͬ����ļ�
			File selecteFile = jfc.getSelectedFile();
			text2.setText(selecteFile.getAbsolutePath());
		}
	}
	
	private void jButtonGoActionPerformed(ActionEvent evt) {
		File file = new File(text.getText());
		copyFile(file);
		File file3 = new File(text2.getText());
		if(file3.exists()){
			JOptionPane.showMessageDialog(this,"���Ƴɹ�");
		}
	}

	private void copyFile(File file) {
		try {
			File file2 = new File(text2.getText());
			FileReader fr = new	FileReader(file);
			BufferedReader b1=new BufferedReader(fr);
			FileWriter fw = new FileWriter(file2,true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String s=null;
			while((s=b1.readLine())!=null){
				bw.newLine();
				bw.write(s);
				
			}
			bw.flush();
			bw.close();
			fr.close();
			b1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
