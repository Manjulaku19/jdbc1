package jdbc1.sample;
import java.sql.*;
public class sample {
	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		PreparedStatement p= c.prepareStatement("create database jspider");
		boolean e= p.execute();
		System.out.println(e);
		c.close();
	}

}
