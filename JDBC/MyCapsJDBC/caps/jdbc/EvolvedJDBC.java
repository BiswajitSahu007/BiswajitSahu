package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class EvolvedJDBC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		System.out.println("enter the  DB user and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		String query="select * from users_info";
		try(Connection conn=DriverManager.getConnection(dbUrl, user, password);
				java.sql.Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(query)) {
			while(rs.next()) {
				System.out.println("userid:" +rs.getInt(1));
				System.out.println("username:"+rs.getString("username"));
				System.out.println("Email:"+rs.getString(3));
				System.out.println("********************");
			}
			sc.close();
			
		} catch (Exception e) {

		}
	}

}
