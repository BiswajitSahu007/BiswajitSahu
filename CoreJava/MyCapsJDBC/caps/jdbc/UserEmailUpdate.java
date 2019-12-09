package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);

		try {
			//load the driver
			Driver driver =new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded...");

			//get DB connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter userid and password");
			String userid=sc.nextLine();
			String userpass=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,userid , userpass);
			System.out.println("connection established...");

			//issue sql query
			String query="update users_info set email=? where userid=? and password=?";
			pstmt=conn.prepareStatement(query);

			System.out.println("enter userid:");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the new email:");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter password to update:");
			pstmt.setString(3, sc.nextLine());

			int count =pstmt.executeUpdate();
			System.out.println("query issued...");
			if(count>0) {
				System.out.println("email updated");
				System.out.println(count +" rows updated");
			}else {
				System.err.println("something went wrong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//close all the JDBC objects
		finally {
			try {
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if (pstmt!=null) {
					pstmt.close();
				}
			} catch (Exception e2) {

				// TODO: handle exception
			}
		}
		sc.close();
	}

}
