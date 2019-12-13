package com.capgemini.phonesimulatorapplication.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import com.capgemini.phonesitmulatorapplication.bean.ContactBean;

public class ContactDaoImpl  implements ContactDao{
	FileReader reader;
	Properties prop;
	ContactBean con;
	public ContactDaoImpl() {
		try {
			reader= new FileReader("contact.properties");
			prop= new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	public boolean insertContact(ContactBean con) {

		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insert"))){

			pstmt.setString(1, con.getName());
			pstmt.setInt(2, con.getNumber());
			pstmt.setString(3, con.getGroup());

			int r=pstmt.executeUpdate();
			if(r>0) {
				return true;
			} else {
				return false;
			}

		} catch(Exception e) {
			System.out.println("duplicate name not allowed");
		}

		return false;
	}

	public boolean deleteContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("delete"))){

			pstmt.setString(1,name);

			int r=pstmt.executeUpdate();
			if(r>0) {
				return true;
			} else {
				return false;
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateContact(String name,String number) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("modify"))){
			pstmt.setString(1,number);
			pstmt.setString(2,name);
			int r=pstmt.executeUpdate();
			if(r>0) {
				return true;
			} else {
				return false;
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<ContactBean> viewAllContacts() {
		List<ContactBean> l1= new ArrayList<ContactBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement()){
			ResultSet rs=stmt.executeQuery(prop.getProperty("viewall"));
			while(rs.next()) {
				ContactBean con=new ContactBean();
				con.setName(rs.getString(1));
				con.setNumber(rs.getInt(2));
				con.setGroup(rs.getString(3));
				l1.add(con);
			} 
			return l1;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ContactBean viewContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("view"))){
			pstmt.setString(1,name);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()) {
				ContactBean con=new ContactBean();
				con.setNumber(rs.getInt("number"));
				con.setGroup(rs.getString("group"));
				return con;
			} else {
				return null;
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}