package com.jdbcconnectionpostgre;


import java.sql.*;

	public class DataBaseConnection {
		static final String url = "jdbc:postgresql://localhost:5432/postgres";
		static final String user = "postgres";
		static final String pass = "Dhaya004@";
		
		static Connection con=null;
		
		private DataBaseConnection() {
			
		}
	//........................................
		public static Connection getDataBaseConnection() {
			try {
				if(con==null) {
					con=DriverManager.getConnection(url,user,pass);
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return con;
		}
	}

