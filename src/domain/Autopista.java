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

	// METODOS
	// Calcular promedio demora en pago
	public void mostrarPromedioDemoras(EstacionPeaje peajeUno) {
		if (peajeUno.promedioDemora() != 0) {
			System.out.println("Promedio dias en pago: " + peajeUno.promedioDemora() + " dias");
		} else {
			System.out.println("Sin demora");

		}
	}

	// Listado de ID's de cabinas que aceptan pago en efectivo
	// Mejora recomendada: Generar este metodo dinamico para utilizarlo con
	// diferentes
	// medios de pago,
	// incluso para mostrar todos los id's y re utilizar el codigo para mostrar un
	// listado de cabinas total
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
