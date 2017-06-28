package jdbc;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Train {
	static Connection conn;
	static Statement sql;
//	static PreparedStatement rsql;
	static ResultSet res;
	
	public Connection getConnection(){
		try {
			Class.forName("*****.jdbc.");
			conn = DriverManager.getConnection("","username","password");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] a){
		Train train = new Train();
		
			conn = train.getConnection();
		try {
			sql = conn.createStatement();  //实例化Statement对象
			res = sql.executeQuery("select * from ...");
			
			while(res.next()){
				String id = res.getString(1);//这里也可以换成res.getString("列明")
				String name = res.getString(2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
