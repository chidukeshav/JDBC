package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
	Statement s=c.createStatement();
	//s.execute("create database Employee");
	//System.out.println("Data base created");
	//s.execute("create table emp_det(id int primary key,name varchar(50))");
	//System.out.println("Table created");
	//Insert
	//s.execute("insert into emp_det values(101,'Dhinkar')");
//	s.execute("insert into emp_det values(102,'Sharathuu')");
//	s.execute("insert into emp_det values(103,'Chinnu')");
//	s.execute("insert into emp_det values(104,'mithun')");
//	s.execute("insert into emp_det values(105,'kishor')");
//	System.out.println("value inserted");
	
	//Update
//	s.execute("update emp_det set name='Raju' where id=104");
//	System.out.println("Value updated");
	
	//Delete
	s.execute("delete from emp_det where id=104");
	System.out.println("Values deleted");
	c.close();
}
}