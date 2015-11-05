import sql.Conexion;

public class PruebasSQL {
	
	static Conexion conexion = new Conexion();
	
	public static void main(String[] args) {
			
		conexion.getNombres();
		
	}

}
