package localidad;

/*
 * 
 * @author ivanLopez
 * 
 * */

public class Localidad {
	
	private String nombre;
	private String provincia;
	private int numHabitantes;
	private int distanciaACapital;
	private int superficie;
	private int rentaPerCapita;
	
	//Constructor
	public Localidad(String nombre, String provincia, int numHabitantes, int distanciaACapital, int superficie, int rentaPerCapita) {
		this.nombre = nombre;
		this.provincia = provincia;
		this.numHabitantes = numHabitantes;
		this.distanciaACapital = distanciaACapital;
		this.superficie = superficie;
		this.rentaPerCapita = rentaPerCapita;
	}
	
	//Métodos
	
	public static void tieneMasPoblacion(Localidad localidad2) {
		
		Localidad localidad1 = new Localidad("Pinto", "Madrid", 56003, 20, 62, 100000);

		if (localidad1.numHabitantes > localidad2.numHabitantes) {
			System.out.println(localidad1.nombre + " tiene más población que " + localidad2.nombre);
		} else {
			System.out.println(localidad1.nombre + " tiene menos población que " + localidad2.nombre);
		}
		
	}
	
	public static int densidadDePoblacion(Localidad localidad1) {
		
		int densidad = localidad1.numHabitantes / localidad1.superficie;
		
		return densidad;
	
	}
	
	public static int rentaPotencial(Localidad localidad1) {
		
		int rentaTeorica = localidad1.numHabitantes * localidad1.rentaPerCapita;
		
		return rentaTeorica;
		
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}
	
	public void setDistanciaACapital(int distanciaACapital) {
		this.distanciaACapital = distanciaACapital;
	}
	
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	public void setRentaPerCapita(int rentaPerCapita) {
		this.rentaPerCapita = rentaPerCapita;
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public int getNumHabitantes() {
		return numHabitantes;
	}
	
	public int getDistanciaACapital() {
		return distanciaACapital;
	}
	
	public int getSuperficie() {
		return superficie;
	}
	
	public int getRentaPerCapita() {
		return rentaPerCapita;
	}

	public static void main(String[] args) {
		
		Localidad localidad2 = new Localidad("Valdemoro", "Madrid", 83507, 26, 64, 10000);
		Localidad localidad3 = new Localidad("Aranjuez", "Madrid", 62292, 47, 201, 100000);
		Localidad localidad4 = new Localidad("Madarcos", "Madrid", 70, 87, 8, 1000);
		
		System.out.println(localidad2.nombre + " está en " + localidad2.provincia + ", tiene " + localidad2.numHabitantes + " habitantes. Está a " + localidad2.distanciaACapital + " km de la capital, y tiene " + localidad2.superficie + " km cuadrados.");
		
		tieneMasPoblacion(localidad2);
		tieneMasPoblacion(localidad3);
		tieneMasPoblacion(localidad4);
		
		System.out.println(localidad2.nombre + " tiene una densidad de población de " + densidadDePoblacion(localidad2) + " hablitantes por km cuadrado.");
		
		System.out.println("La renta teórica posible de " + localidad2.nombre + " es de " + rentaPotencial(localidad2) + "€");
		
		
	}

}
