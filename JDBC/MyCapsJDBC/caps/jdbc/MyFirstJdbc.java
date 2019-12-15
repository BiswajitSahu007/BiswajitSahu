package com.caps.jdbc;
//phone-sim example
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class MyFirstJdbc {

public static void main(String[] args) {
	java.sql.Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
//TODO Auto-generated method stub

try {
//Load the driver
Driver driver=new com.mysql.jdbc.Driver();
DriverManager.registerDriver(driver);//register driver
System.out.println("Driver loaded");
////get database connection via driver
String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6"+ "?user=root&password=root";//address
conn=DriverManager.getConnection(dbUrl);
System.out.println("Connection is established...");
//issue sql queries via connection
String query="SELECT * from users_info";
stmt=conn.createStatement();
stmt.executeQuery(query);
rs=stmt.executeQuery(query);
System.out.println("Query issued...");
//process the results returned by sql queries
while(rs.next())
{
System.out.println("UserId:"+rs.getInt("userid"));
System.out.println("UserName:"+rs.getString("username"));
System.out.println("Email:"+rs.getString("email") );
System.out.println("****************************************************");
}




} catch (SQLException e) {

e.printStackTrace();
}
finally{


try {
if(conn!=null)
{
conn.close();
}
}
catch (SQLException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

try {
if(stmt!=null)
{
conn.close();
}} catch (SQLException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
}
//close the jdbc objects

}
}





