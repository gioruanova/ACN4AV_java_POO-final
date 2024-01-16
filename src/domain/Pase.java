package domain;

public class Pase extends MedioPago {

	// ATRIBUTOS
	private Integer diasDemora;

	// CONSTRUCTORES
	public Pase(Integer diasDemora) {
		super("PASE");
		this.diasDemora = diasDemora;
	}

	// GETTERS Y SETTERS
	public void setDiasDemora(Integer diasDemora) {
		this.diasDemora = diasDemora;
	}

	@Override
	public Double getDescuento() {
		Double valor = 0.0;
		if (diasDemora < 5) {
			valor = 15.0;
		} else {
			valor = 12.0;
		}
		return valor;
	}

	@Override
	public Integer getDiasDemora() {
		return diasDemora;
	}

	@Override
	public String toString() {
		return "Pase [diasDemora=" + diasDemora + ", toString()=" + super.toString() + "]";
	}

}
