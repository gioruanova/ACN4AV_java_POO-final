package domain;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Cabina {

	// ATRIBUTOS:
	private Long idPeaje;
	private MedioPago medioPago;
	private List<Registro> registros;

	public Cabina() {
		this.registros = new ArrayList<>();
		this.idPeaje = generarIdRandom();
	}

	public Cabina(Long idPeaje, MedioPago medioPago, List<Registro> registros) {
		this.idPeaje = idPeaje;
		this.medioPago = medioPago;
		this.registros = registros;
	}

	// GETTERS & SETTERS
	public Long getIdPeaje() {
		return idPeaje;
	}

	public void setIdPeaje(Long idPeaje) {
		this.idPeaje = idPeaje;
	}

	public MedioPago getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(MedioPago medioDePago) {
		this.medioPago = medioDePago;
	}

	public List<Registro> getRegistro() {
		return registros;
	}

	public void setRegistro(List<Registro> registros) {
		this.registros = registros;
	}

	// METODOS
	private Long generarIdRandom() {
		Random random = new Random();
		long randomLong = Math.abs(random.nextLong());
		long threeDigitRandom = randomLong % 1000; // Extracting last 3 digits
		return threeDigitRandom;
	}

	public Double cobrar(Vehiculo vehiculo) {
		Registro registro = new Registro(vehiculo, EstacionPeaje.getHoraRandom(), 0D);
		Double importe = registro.cobrar();
		registros.add(registro);
		return importe;
	}

	public void imprimirTotal(Vehiculo vehiculo) {
		System.out.println("Recibo: \n" + "Id Agente: " + idPeaje + "\nPatente :" + vehiculo.getPatente()
				+ "\nCategoría: " + vehiculo.getCategoriaVehiculo().name() + "\nTarifa: $" + cobrar(vehiculo)
				+ "\nMetodo: " + getMedioPago());
		System.out.println();

	}

	// METODO TOSTRING DEFAULT
	@Override
	public String toString() {
		return "Cabina ID: " + this.getIdPeaje();
	}
}
