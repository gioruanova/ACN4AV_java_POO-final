package domain;

public class Efectivo extends MedioPago {

	// CONSTRUCTORES
	public Efectivo() {
		super("EFECTIVO");
	}

	@Override
	public Double getDescuento() {
		return 0.0;
	}

	@Override
	public Integer getDiasDemora() {
		return 0;
	}

	@Override
	public String toString() {
		return "Efectivo [toString()=" + super.toString() + "]";
	}

}
