package jdbc1.sample;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sample2 {
	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306");
		System.out.println(connection);
		Statement statement=connection.createStatement();
//statemnt.execute("create table pavithragouda(id integer primary key,name varchar(45 not null)");
		statement.execute("create database manjula");
	connection.close();
	System.out.println("values inserted");
	
		
	}
}
