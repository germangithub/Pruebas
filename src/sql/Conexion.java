package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	final static String host = "jdbc:mysql://asymmetrystudio.com";
	final static String user = "asymmetr_web";
	final static String password = "53491221";
	final static String base = "asymmetr_pruebas";
	static Connection con;
		
	public Conexion(){
				
		try {
		
			con = DriverManager.getConnection( host , user , password );
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}
		
	}
		
}
