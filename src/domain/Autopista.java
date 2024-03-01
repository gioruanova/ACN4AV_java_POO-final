package domain;

import java.util.ArrayList;
import java.util.List;

public class Autopista {

	// ATRIBUTOS:
	private final String nombreAutopista;
	private List<EstacionPeaje> estaciones;

	// CONSTRUCTORES:
	public Autopista(String nombreAutopista) {
		this.nombreAutopista = nombreAutopista;
		this.estaciones = new ArrayList<>();
	}

	public Autopista(List<EstacionPeaje> estaciones) {
		this.nombreAutopista = "Sin nombre";
		this.estaciones = estaciones;
	}

	// GETTERS & SETTERS
	public String getNombreAutopista() {
		return nombreAutopista;
	}

	public List<EstacionPeaje> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(List<EstacionPeaje> estaciones) {
		this.estaciones = estaciones;
	}

	public void addEstacion(EstacionPeaje estacion) {
		this.estaciones.add(estacion);
	}

	// METODO TOSTRING DEFAULT
	@Override
	public String toString() {
		return "Autopista[" + "Nombre Autopista: " + nombreAutopista + " - " + "Estaciones: " + estaciones + ']';
	}
}
