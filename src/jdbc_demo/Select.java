package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(dburl,username, password);
		
		System.out.println("Successfully connected to Database");
		
		//Run a query on the DB

		String query = "select * from movies";
		
		//Send query to the DB
		
		Statement stmt = con.createStatement();
		//execute the query
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Title : " + rs.getString("title")+"/t");
			System.out.println("genre : " + rs.getString("genre")+"/t");
			System.out.println("director : " + rs.getString("director")+"/t");
			System.out.println("release_year : " + rs.getString("release_year")+"/t");
		}
		con.close();
		
	}

}
