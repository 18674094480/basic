package jdbc;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prep {

	static Connection conn;
	static Statement sql;
	static PreparedStatement rsql;
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
		Prep p = new Prep();
		
			conn = p.getConnection();
		try {
			rsql = conn.prepareStatement("select * from ... where id = ?");
			rsql.setInt(1, 2);                 //1是从左到又第一个？，2是这个问号的值
			res = rsql.executeQuery();
			
			while(res.next()){
				String id = res.getString(1);//这里也可以换成res.getString("列明")
				String name = res.getString(2);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
