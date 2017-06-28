package jtable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class TableFrame_2 extends JFrame{

	public TableFrame_2(){
		super();
		setTitle("不可滚动的表格");
		setBounds(200,200,480,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("A");
		columnNames.add("B");
		columnNames.add("C");
		Vector<Vector<String>> tableValues = new Vector<Vector<String>>();
		
		for(int i = 1;i<6;i++){
			Vector<String> rowV = new Vector<String>();
			rowV.add("A"+i);
			rowV.add("B"+i);
			rowV.add("C"+i);
			tableValues.add(rowV);
		}
		
		JTable table = new JTable(tableValues,columnNames);
		
		DefaultTableCellRenderer rander = new DefaultTableCellRenderer();
		rander.setHorizontalAlignment(SwingConstants.CENTER);	
		table.setDefaultRenderer(Object.class, rander);             //设置行列居中
		table.setRowHeight(2,30);                                   //设置第二列的行高  
		table.setRowHeight(30);                                     //设置所有的行高
		table.setSelectionBackground(Color.BLUE);
//		table.setSelectionForeground(Color.BLUE);
		table.setAutoResizeMode(4);                             //调整列宽的设置
		table.setSelectionMode(1);                              //只能选中一行       
		
//		getContentPane().add(table,BorderLayout.CENTER);
		JTableHeader header = table.getTableHeader();
		header.setReorderingAllowed(false);                //设置列不能调整位置，默认是可以
//		getContentPane().add(header,BorderLayout.NORTH);
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane,BorderLayout.CENTER);
	}
	
	public static void main(String[] a){
		TableFrame_2 frame_2 = new TableFrame_2();
		frame_2.setVisible(true);
	}
}
