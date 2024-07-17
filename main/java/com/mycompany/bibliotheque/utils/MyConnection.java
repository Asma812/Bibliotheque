/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotheque.utils;
import java.sql.*;
/**
 *
 * @author user
 */
public class MyConnection {
   	public static void main(String[] args) {

	try {
		Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "root", "Classroom123");
	Statement stmt=con.createStatement();
	System.out.println("inserting records");
		String sql="Insert into Abonnés values(1, Jenine, Paul)";
		stmt.executeUpdate(sql);
	}catch (Exception e) {
		System.out.println(e);
	}
	} 
}
