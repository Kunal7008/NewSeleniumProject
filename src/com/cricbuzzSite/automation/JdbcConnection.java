package com.cricbuzzSite.automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
String dburl="jdbc:mysql://localhost:3306/movies";
String username="root";
String password="kunal";
String query="select * from data";
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(dburl, username, password);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next()) {
	int wmpid=rs.getInt("ID");
	System.out.println(wmpid);
	String name=rs.getString("firstname");
	System.out.println(name);
}

	}

}
