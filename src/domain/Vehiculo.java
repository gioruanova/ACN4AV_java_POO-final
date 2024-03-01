package domain;

public class Vehiculo {

	// ATRIBUTOS:
	private String patente;
	private CategoriaVehiculo categoriaVehiculo;
	private Cabina cabina;

	// CONSTRUCTORES:
	public Vehiculo() {
	}

	public Vehiculo(String patente, CategoriaVehiculo categoriaVehiculo, Cabina cabina) {
		if (patente.length() != 8 || !patente.matches("\\w+")) {
			throw new IllegalArgumentException("La patente debe tener exactamente 8 caracteres alfanuméricos.");
		}
		this.patente = patente;
		this.categoriaVehiculo = categoriaVehiculo;
		this.cabina = cabina;
	}

	// Getters & Setters
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

	public Cabina getCabina() {
		return cabina;
	}

	public void setCabina(Cabina cabina) {
		this.cabina = cabina;
	}

	public boolean cabinaAsignada() {
		return cabina != null;
	}

	// METODO TOSTRING DEFAULT
	@Override
	public String toString() {
		return "Patente: " + this.getPatente() + ", categoria vehículo: " + this.getCategoriaVehiculo();
	}

}
