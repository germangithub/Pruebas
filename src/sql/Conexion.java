package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	final static String host = "jdbc:mysql://asymmetrystudio.com/";
	final static String user = "asymmetr_web";
	final static String password = "53491221";
	public Connection con;
	
	public Conexion(String base){
		
		String hostbase = host + base;
		
		try {
						
		    con = DriverManager.getConnection( hostbase , user , password);
		    
		} catch (SQLException e) {
			
			e.printStackTrace();
					
		}
	
	}
		
}
