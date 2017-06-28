package frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NewJFrame extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticXPLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JMenuBar jMenuBar1;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JMenuItem mnSave;
	private ButtonGroup buttonGroup1;
	private JRadioButtonMenuItem jRadioButtonMenuItem2;
	private JRadioButtonMenuItem jRadioButtonMenuItem1;
	private JMenu jMenuWord;
	private JMenuItem mnExit;
	private JMenuItem mnOpen;
	private JMenuItem mnNew;
	private JMenu jMenu4;
	private JMenu jMenu3;
	private JMenu jMenu2;
	private JMenu jMenu1;
	private JFileChooser jfc = new JFileChooser();

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setTitle("\u5c0f\u732a\u8ffd\u5954\u9a70");
			getContentPane().add(getJScrollPane1(), BorderLayout.CENTER);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("\u6587\u4ef6(F)");
					jMenu1.setMnemonic('F');
					{
						mnNew = new JMenuItem();
						jMenu1.add(mnNew);
						mnNew.setText("\u65b0\u5efa(N)");
						mnNew.setMnemonic('N');
//						mnNew.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icons/new.png")));
						mnNew.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								mnNewActionPerformed(evt);
							}
						});
					}
					{
						mnOpen = new JMenuItem();
						jMenu1.add(mnOpen);
						mnOpen.setText("\u6253\u5f00(O)");
						mnOpen.setMnemonic('O');
//						mnOpen.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icons/open.png")));
						mnOpen.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								mnOpenActionPerformed(evt);
							}
						});
					}
					{
						mnSave = new JMenuItem();
						jMenu1.add(mnSave);
						mnSave.setText("\u4fdd\u5b58(S)");
						mnSave.setMnemonic('S');
//						mnSave.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icons/save.png")));
						mnSave.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								mnSaveActionPerformed(evt);
							}
						});
					}
					{
						mnExit = new JMenuItem();
						jMenu1.add(mnExit);
						mnExit.setText("\u9000\u51fa(E)");
						mnExit.setMnemonic('E');
//						mnExit.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icons/exit.png")));
						mnExit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								mnExitActionPerformed(evt);
							}
						});
					}
				}
				{
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("\u7f16\u8f91(E)");
				}
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("\u683c\u5f0f(O)");
					{
						jMenuWord = new JMenu();
						jMenu3.add(jMenuWord);
						jMenuWord.setText("\u5b57\u4f53(W)");
						{
							jRadioButtonMenuItem1 = new JRadioButtonMenuItem();
							jMenuWord.add(jRadioButtonMenuItem1);
							jRadioButtonMenuItem1.setText("\u5927\u4f53");
							jRadioButtonMenuItem1.setBorderPainted(false);
							jRadioButtonMenuItem1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jRadioButtonMenuItem1ActionPerformed(evt);
								}
							});
							getButtonGroup1().add(jRadioButtonMenuItem1);
						}
						{
							jRadioButtonMenuItem2 = new JRadioButtonMenuItem();
							jMenuWord.add(jRadioButtonMenuItem2);
							jRadioButtonMenuItem2.setText("\u5c0f\u4f53");
							jRadioButtonMenuItem2.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jRadioButtonMenuItem2ActionPerformed(evt);
								}
							});
							getButtonGroup1().add(jRadioButtonMenuItem2);
						}
					}
				}
				{
					jMenu4 = new JMenu();
					jMenuBar1.add(jMenu4);
					jMenu4.setText("\u5e2e\u52a9(H)");
				}
			}
			pack();
			this.setSize(502, 364);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getButtonGroup1() {
		if(buttonGroup1 == null) {
			buttonGroup1 = new ButtonGroup();
		}
		return buttonGroup1;
	}
	
	//�˳�
	private void mnExitActionPerformed(ActionEvent evt) {
		int a = JOptionPane.showConfirmDialog(this,"ȷ��Ҫ�˳���","Exit",JOptionPane.OK_CANCEL_OPTION);
		if(a==JOptionPane.OK_OPTION){
			System.exit(0);
		}
	}
	
	private JScrollPane getJScrollPane1() {
		if(jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTextArea1());
		}
		return jScrollPane1;
	}
	
	private JTextArea getJTextArea1() {
		if(jTextArea1 == null) {
			jTextArea1 = new JTextArea();
		}
		return jTextArea1;
	}
	
	private void jRadioButtonMenuItem1ActionPerformed(ActionEvent evt) {
		Font old = jTextArea1.getFont();
		Font newWord = new Font(old.getName(),old.getStyle(),old.getSize()+10);
		jTextArea1.setFont(newWord);
	}
	
	private void jRadioButtonMenuItem2ActionPerformed(ActionEvent evt) {
		Font old = jTextArea1.getFont();
		Font newWord = new Font(old.getName(),old.getStyle(),old.getSize()-10);
		jTextArea1.setFont(newWord);
	}
	
	private void mnNewActionPerformed(ActionEvent evt) {
        this.setTitle("�ޱ���");
		jTextArea1.setText("");
	}
	
	//��
	private void mnOpenActionPerformed(ActionEvent evt) {
		
		
		//�ļ������������
		FileNameExtensionFilter filter =
			new FileNameExtensionFilter("�����ļ�|.txt|.java|.sql|.jmp","txt","java","sql","jmp");
		
		//���ù��������ļ�ѡ����������
		jfc.setFileFilter(filter);
		
		//��ȡҪ�򿪵��ļ�����
		int result = jfc.showOpenDialog(this);
		if(result==JFileChooser.APPROVE_OPTION){//ͬ����ļ�
			File selecteFile = jfc.getSelectedFile();
			this.setTitle(selecteFile.getName());
			try {
				File file = new File(selecteFile.getAbsolutePath());
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String s = null;
				while((s=br.readLine())!=null){
					jTextArea1.setText(s);
				}
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//����
	private void mnSaveActionPerformed(ActionEvent evt) {

		int result = jfc.showSaveDialog(this);
		if(result==JFileChooser.APPROVE_OPTION){//ͬ����ļ�
			File selecteFile = jfc.getSelectedFile();
//			.setText(selecteFile.getAbsolutePath());
			try {
				File file2 = new File(selecteFile.getAbsolutePath());
				FileWriter fw = new FileWriter(file2);
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.newLine();
				bw.write(jTextArea1.getText());

				bw.flush();
				bw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
