package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		try {
			//load the driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver has been loaded...");

			//get the DB connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter username and Password");//more secure and we give input in the run time
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();

			conn=DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("connection established......");

			//issue sql query 
			String query="INSERT into users_info values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);

			System.out.println("enter userid:");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter username:");
			pstmt.setString(2, sc.nextLine());
			System.out.println("enter email:");
			pstmt.setString(3, sc.nextLine());
			System.out.println("enter password:");
			pstmt.setString(4, sc.nextLine());

			//process the results returned

			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("user inserted...");
			}else {
				System.err.println("SOMETHING WENT WRONG...");
			}


		} catch (SQLException e) {
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
	}
}
