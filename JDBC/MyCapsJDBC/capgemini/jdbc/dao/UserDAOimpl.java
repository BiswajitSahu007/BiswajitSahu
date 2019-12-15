package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;

public class UserDAOimpl implements UserDAO{

	FileReader reader;
	Properties prop;
	UserBean user;

	public UserDAOimpl() {
		try {
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("driver loaded with the help of constructor");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<UserBean> getAllUsers() {
		List<UserBean> list=new ArrayList<UserBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while (rs.next()) {
				user=new UserBean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				//for adding data into the List we go for collection methods
				list.add(user);
			}
			return list;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserBean userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(int userid, String password) {
		
		  try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
		    		prop.getProperty("dbPassword"));
		    PreparedStatement stmt=conn.prepareStatement(prop.getProperty("updatequery"))		
		    			
		    		){
		    	Scanner sc=new Scanner(System.in);
		    	stmt.setInt(2, userid);
		    	stmt.setString(3, password);
		    	System.out.println("Enter the new E-mail Id: ");
		    	stmt.setString(1, sc.nextLine());
		    	
		    	int result=stmt.executeUpdate();
		    	if(result>0) {
		    		return true;
		    	}
		    	else {
		    		return false;
		    	}
		    	
		    }
			catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
					
			
			return false;
		}
	

	@Override
	public boolean deleteUser(int userid, String password) {
	    try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
	    		prop.getProperty("dbPassword"));
	    PreparedStatement stmt=conn.prepareStatement(prop.getProperty("deletequery"))		
	    			
	    		){
	    	
	    	stmt.setInt(1, userid);
	    	stmt.setString(2, password);
	    	
	    	int result=stmt.executeUpdate();
	    	if(result>0) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    	
	    }
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
				
		
		return false;
	}

	@Override
	public boolean insertUser(UserBean user) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertQuery"))){

			pstmt.setInt(1, user.getUserid());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPassword());

			int count =pstmt.executeUpdate();

			if(count>0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}




}
