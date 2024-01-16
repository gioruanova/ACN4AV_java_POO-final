package domain;

public class Registro {

	// ATRIBUTOS
	private Vehiculo vehiculo;
	private Integer hora;

	// CONSTRUCTORES
	public Registro(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		this.hora = EstacionPeaje.dameHoraActualConRandom();
	}

	// GETTERS Y SETTERS
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Integer getHora() {
		return hora;
	}

	@Override
	public String toString() {
		return "Registro [vehiculo=" + vehiculo + ", hora=" + hora + "]";
	}

}
