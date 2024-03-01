package domain;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Cabina {

	// ATRIBUTOS:
	private Long idPeaje;
	private MedioPago medioPago;
	private List<Registro> registros;

	// CONSTRUCTOR
	// Mejora recomendada: Seria importante adicionar un atributo llamado estado,
	// para indicar si la cabina esta operativa o no (como en la vida real)
	// Adicionalmente, crear la cabina con el metodo de pago Efectivo por default,
	// ya que se debe garantizar al menos un metodo de pago, pero adicionalmente,
	// generar un condicional, para cambiar el metodo de pago al momento de
	// instanciar la clase, deshabilitando el medio de pago por default. No es algo
	// prudente manejar la instancia del medio de pago desde el test.
	// Adicionalmente, si se adicionan mas formas de pago, el codigo soportara
	// escalabilidad y re factorizacion
	public Cabina() {
		this.registros = new ArrayList<>();
		this.idPeaje = generarIdRandom();
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

	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
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
		long redondeoValor = randomLong % 1000;
		return redondeoValor;
	}

	public Double cobrar(Vehiculo vehiculo) {
		Registro registro = new Registro(vehiculo, EstacionPeaje.getHoraRandom(), 0D);
		Double valorCobrado = registro.cobrar();
		registros.add(registro);
		return valorCobrado;
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
