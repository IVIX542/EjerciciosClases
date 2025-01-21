package persona;

/*
 * 
 * @author ivanLopez
 * 
 * */

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
	public static void esMayorQue(Persona persona2) {
		
		Persona persona1 = new Persona("María", "Fernández", "García", "87654321B", "Barcelona", 28);
		
		if(persona1.edad > persona2.edad) {
			System.out.println(persona1.nombre + " es mayor que " + persona2.nombre);
		} else {
			System.out.println(persona1.nombre + " es menor que " + persona2.nombre);
		}
		
	}
	
	public static void esTocayoDe(Persona persona2) {
		
		Persona persona1 = new Persona("María", "Fernández", "García", "87654321B", "Barcelona", 28);
		
		if(persona1.nombre.equals(persona2.nombre)) {
			
			System.out.println(persona1.nombre + " con " + persona1.edad + " años se llama igual que " + persona2.nombre + " con " + persona2.edad + " años.");
			
		} else {
			System.out.println(persona1.nombre + " con " + persona1.edad + " años no se llama igual que " + persona2.nombre + " con " + persona2.edad + " años.");
		}
		
	}
	
	public static void esFamiliarDe(Persona persona2) {
		
		Persona persona1 = new Persona("María", "Fernández", "García", "87654321B", "Barcelona", 28);
		
		if(persona1.apellido1.equals(persona2.apellido1)) {
			
			System.out.println(persona1.nombre + " y " + persona2.nombre + " son de la familia " + persona1.apellido1);
			
		} else if(persona1.apellido2.equals(persona2.apellido2)) {
			
			System.out.println(persona1.nombre + " y " + persona2.nombre + " son de la familia " + persona1.apellido2);
			
		}
		
	}
	
	
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
		
		//Creación de objetos Persona
		Persona persona1 = new Persona("Carlos", "González", "López", "12345678A", "Madrid", 35);
		Persona persona2 = new Persona("Lucía", "Martínez", "Sánchez", "98765432C", "Valencia", 16);
		Persona persona3 = new Persona("María", "Ruiz", "Hernández", "56473829D", "Sevilla", 22);
		Persona persona4 = new Persona("Luis", "Fernández", "Muñoz", "19283746E", "Zaragoza", 40);
		Persona persona5 = new Persona("Sofía", "Navarro", "García", "38475629F", "Bilbao", 30);
		
		
		//Muestra de los atributos de persona1
		System.out.println(persona1.nombre + " " + persona1.apellido1 + " " + persona1.apellido2 + ", con DNI " + persona1.dni + " vive en " + persona1.provincia + " y tiene " + persona1.edad + " años.");
		
		//Llamada a los métodos
		esMayorQue(persona1);
		esMayorQue(persona2);
		
		esTocayoDe(persona3);
		
		esFamiliarDe(persona4);
		esFamiliarDe(persona5);
		
	}

}
