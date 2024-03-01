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

	// CALCULAR PROMEDIO DEMORA EN PAGO
	public void mostrarPromedioDemoras(EstacionPeaje peajeUno) {
		if (peajeUno.promedioMora() != 0) {
			System.out.println("Días promedio en demora de pago: " + peajeUno.promedioMora() + " días");
		} else {
			System.out.println("Sin demoras en el pago registradas");
			
		}
	}
	
	
	// IDS CABINAS QUE ACEPTAN EFECTIVO
    public void idsCabinasEfectivo(EstacionPeaje peajeUno) {
        List<Long> idsCabinaEfectivo = peajeUno.idsCabinaEfectivo();
        System.out.println("ID agente/cabina pago efectivo: " + idsCabinaEfectivo);
    }

	// METODO TOSTRING DEFAULT
	@Override
	public String toString() {
		return "Autopista[" + "Nombre Autopista: " + nombreAutopista + " - " + "Estaciones: " + estaciones + ']';
	}
}
