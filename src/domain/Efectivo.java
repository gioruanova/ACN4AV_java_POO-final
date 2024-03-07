package domain;

public class Efectivo extends MedioPago {

	// ATRIBUTOS:
	private Integer diasDemora;

	// CONSTRUCTORES:
	public Efectivo() {
		super("EFECTIVO");
		this.diasDemora = 0;
	}

	@Override
	public Double getDescuento() {
		return 10D;
	}

	@Override
	public Integer getDiasDeMora() {
		return this.diasDemora;
	}

	public void setDiasDemora(Integer diasDemora) {
		this.diasDemora = diasDemora;
	}

	// METODO TOSTRING DEFAULT
	@Override
	public String toString() {
		return "Efectivo [Pago inmediato]";
	}

}
