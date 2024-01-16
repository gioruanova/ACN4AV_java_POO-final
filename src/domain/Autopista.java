package domain;

import java.util.ArrayList;
import java.util.List;

public class Autopista {
	
	// ATRIBUTOS
	private List<EstacionPeaje> estaciones;

	
	// CONSTRUCTORES
	public Autopista() {
		this.estaciones = new ArrayList<EstacionPeaje>();
	}


	// GETTERS Y SETTERS
	public List<EstacionPeaje> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(List<EstacionPeaje> estaciones) {
		this.estaciones = estaciones;
	}

	public void addEstacion(EstacionPeaje estacion) {
		this.estaciones.add(estacion);
	}


	@Override
	public String toString() {
		return "Autopista [estaciones=" + estaciones + "]";
	}
}
