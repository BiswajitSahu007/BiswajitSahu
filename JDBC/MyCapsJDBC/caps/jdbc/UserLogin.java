package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;



public class UserLogin {
	public static void main(String[] args) {
		Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		try {
			//Load the driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded...........");

			//Get Database Connection via Driver
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter username and Password");//more secure and we give input in the run time
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();

			conn=DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("connection established......");


			//Issue Sql Query via connection

			String query="SELECT * from users_info where userid= ? and password=?";
			pstmt=conn.prepareStatement(query);

			System.out.println("enter userid:");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter password:");
			pstmt.setString(2, sc.nextLine());


			rs=pstmt.executeQuery();
			System.out.println("Query issued.....");


			//Process the results returned

			if(rs.next()) {
				System.out.println("userid: "+rs.getInt(1));
				System.out.println("UserName: "+rs.getString(2));
				System.out.println("Email: "+rs.getString(3));
				System.out.println("password: "+rs.getString(4));

			}else {
				System.err.println("Something went wrong!!!");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}



		//Close all the JDBC objects

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
