package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Renewal {
	static Connection conn;
	static Statement sql;
	static PreparedStatement rsql;
	static ResultSet res;
	
	public Connection getConnection(){
		try {
			Class.forName("*****.jdbc.*****");
			conn = DriverManager.getConnection("","username","password");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] a){
		Renewal r = new Renewal();
		conn = r.getConnection();
		try {
			rsql = conn.prepareStatement("inset into 表名 values( ?,?)");
			rsql.setInt(1, 2);          //1是从左到又第一个？，2是这个问号的值
			rsql.setString(2, "王上");
			rsql.executeUpdate();
			
			rsql = conn.prepareStatement("update 表名 set 列名=? where ...");
			rsql.setString(1, "王上");
			rsql.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
