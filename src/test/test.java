package test;

import java.awt.Frame;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.net.URLDecoder;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

import org.apache.commons.httpclient.HttpClient;
























import net.sf.json.JSONObject;

public class test {
int i =0;
	public static void main(String[] args) {
		
		/*
		try {
			String s = URLDecoder.decode("{\"resultcode\": \"1\",\"message\": \"成都市\"}","utf-8");
			System.out.println(s);
		
			JSONObject jsonObj = JSONObject.fromObject(s);
			String a = jsonObj.getString("resultcode");
			String b = jsonObj.optString("message");
			System.out.println(a);
			System.out.println(b);
			
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("sb");
		}*//*
		HttpClient client = new HttpClient();
		double   f   =   111231.5;  
		BigDecimal   b   =   new   BigDecimal(f);  
		double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();  
		System.out.println(f1);*/
//		int[] arr = new int[]{8,2,1,0,3};
//		int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
//		String a = "";
//		for(int i :index){
//			a += arr[i];
//		}
		/*Date date = null;
		String d = "20160704";
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		try {
			date = format.parse(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		
//		int a = 100;
//		int b =Math.abs(a);
//		if(0 >= b){
//			
//		}
//		System.out.print(b);
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			String url = "jdbc:mysql://localhost:3306:training";
//			Connection cn = DriverManager.getConnection(url, "root", "root");
//			String sql = "call query_q";
//			CallableStatement cst = cn.prepareCall(sql);
//			cst.execute();
//			cst.close();
//			cn.close();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String a = "1-5";
//		int b = a.indexOf("-");
//		Date date = new Date();
		/*NewJFrame frame = new NewJFrame();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setBounds(0, 0, 500, 500);
		int i = JOptionPane.showConfirmDialog(frame, "文件已修改，是否保存？", "是否保存", JOptionPane.YES_NO_CANCEL_OPTION);
		switch(i){
		case 0:
			System.out.println("yes");
			System.exit(0);
		case JOptionPane.NO_OPTION:
			System.out.println("no");
			System.exit(0);
		}*/
		char s4 = '你';
		Integer s1 = 2;
		double s2 = Double.valueOf("3");
		double s3 = s1%s2;
//		int s1 = 1;
//		int s2 = 2;
//		Double s3 = Double.valueOf(s1/s2);
		System.out.print(s3);
		Map<String,String> map = new HashMap<String,String>();
		map.put("hb", "a");
		map.put("hac", "a");
		map.put("haa", "a");
		for(String a:map.keySet()){
			System.out.println(a);
		}
		int q ='a';
		String a = "a";
		
//		String a ="a";
		a.length();
		Random randRed = new Random();
		Random randBlue = new Random();
//		randRed.nextInt(34);
//		randBlue.nextInt(17);
		/*int a[] = new int[6];
		for(int i = 0 ; i<6 ; i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int num = 1+randRed.nextInt(33);
			a[i] = num;
		}
		Arrays.sort(a);
		for(int i = 0 ; i<a.length ; i++){
			System.out.print((String.valueOf(a[i]).length() == 1 ? "0"+String.valueOf(a[i]):String.valueOf(a[i]))+"  ");
		}
		String blue = String.valueOf(1+randBlue.nextInt(16));
		System.out.println(blue.length() == 1 ? "0"+blue:blue);*/
		
		Thread thread1;
		Thread thread2;
		thread1 = new Thread(new Runnable() {
			
			public void run() {
				test test1 = new test();
				test1.loc();
			}
		});
		thread1.start();
		thread2 = new Thread(new Runnable() {
			
			public void run() {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				test test1 = new test();
				test1.loc();
			}
		});
		thread2.start();
	}
	
	public void loc(){
//		synchronized (lock){
			while(true){
				int i = 1;
			}
//			for(int i =0;i<5 ;i++){
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.print("1");
//			}
//			synchronized (lock1){
//				for(int i =0;i<5 ;i++){
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.print("2");
//				}
//			}
//		}
			
	}
}
