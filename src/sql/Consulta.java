package sql;

import java.sql.*;
import sql.Conexion;
import objetos.Persona;

public class Consulta {
	
	Conexion conexion = new Conexion("asymmetr_pruebas");
	
	public void consultarPersona() throws SQLException{
		
		Statement s = conexion.con.createStatement();
		ResultSet rs = s.executeQuery("Select * from Personas");
				
		while (rs.next()){
		   			
			
			System.out.println(rs.getObject("Dni") + " --------> " + rs.getObject("Nombre"));
		
		}
		
		rs.close();
		
	}
	
}
