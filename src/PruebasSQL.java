import java.sql.SQLException;

import sql.Consulta;

public class PruebasSQL {
	
	
	public static void main(String[] args) throws SQLException {
			
		Consulta estaconsulta = new Consulta();
		
		estaconsulta.consultarPersona();
		
	}

}
