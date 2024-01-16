package domain;

public class Vehiculo {

	// ATRIBUTOS
	private String patente;
	private CategoriaVehiculo categoriaVehiculo;

	// CONSTRUCTORES
	public Vehiculo(String patente, CategoriaVehiculo categoriaVehiculo) {
		this.patente = patente;
		this.categoriaVehiculo = categoriaVehiculo;
	}

	// GETTERS Y SETTERS
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public CategoriaVehiculo getCategoriaVehiculo() {
		return categoriaVehiculo;
	}

	public void setCategoriaVehiculo(CategoriaVehiculo categoriaVehiculo) {
		this.categoriaVehiculo = categoriaVehiculo;
	}

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", categoriaVehiculo=" + categoriaVehiculo + "]";
	}

}
