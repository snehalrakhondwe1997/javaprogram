package com.snehal;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {
	 private static   String driver  = "com.mysql.cj.jdbc.Driver";
		private static String Url ="jdbc:mysql://localhost:3306/airline_reservation";
		private static String Un="root";
		private static String Up ="root";
		
		public static Connection getConn() {
			Connection con = null;
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(Url,Un,Up);
				if(con!=null)
					System.out.println("Connected");
				else 
					System.out.println("Not connected");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return con;
		}

	}



