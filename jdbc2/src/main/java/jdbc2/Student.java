package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student1","root","root");
		Statement s=c.createStatement();
		
//		s.execute("create database Student1");
//		System.out.println("created");
		
//		s.execute("create table std1_det(id int primary key,name varchar(50))");
//		System.out.println("Table created");
		s.execute("insert into std1_det values(1,'chidu')");
		System.out.println("value inserted");
	}

}
