package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	final static String host = "192.168.1.99";
	final static String user = "asymmetry";
	final static String password = "53491221";
		
	public Conexion(){
		
		try {
		
			Connection con = DriverManager.getConnection( host , user , password );
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}
				
	}
	
	public String getNombres(String nombre){
		
				
		
		return nombre;

	
	}



}
