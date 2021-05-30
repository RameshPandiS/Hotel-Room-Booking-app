package in.ramesh.service;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnection {
		private Connection c = null;
	   public DbConnection() {
	      
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/HOTELS",
	            "postgres", "Ramesh@123");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }
	}

