package persona;

public class Persona {
	
	//Atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private String provincia;
	private int edad;
	
	//Constructor
	public Persona(String nombre, String apellido1, String apellido2, String dni, String provincia, int edad) {
			
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.provincia = provincia;
		this.edad = edad;
			
	}
	
	//Métodos
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Getters
	public String getNombre(){
		return nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public String getApellido2(){
		return apellido2;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public static void main(String[] args) {
		
		//Creación de objeto Persona
		Persona persona1 = new Persona("Carlos", "González", "López", "12345678A", "Madrid", 35);
		
		//Muestra de los atributos de persona1
		System.out.println(persona1.nombre + " " + persona1.apellido1 + " " + persona1.apellido2 + ", con DNI " + persona1.dni + " vive en " + persona1.provincia + " y tiene " + persona1.edad + " años.");
		
	}

}
