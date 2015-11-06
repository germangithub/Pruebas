package objetos;

public class Persona {

	public String nombre;
	public String dni;
	
	public Persona(String nombre , String dni){
		
		this.nombre = nombre;
		this.dni = dni;
		
	}
	
	public String getNombre(){return nombre;}
	public String getDni(){return dni;}
	
}
