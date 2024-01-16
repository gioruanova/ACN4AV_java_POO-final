package domain;

public class Sube extends MedioPago {

	// ATRIBUTOS
	private Integer diasDemora;

	public Sube(Integer diasDemora) {
		super("SUBE");
		this.diasDemora = diasDemora;
	}

	// GETTERS Y SETTERS
	public void setDiasDemora(Integer diasDemora) {
		this.diasDemora = diasDemora;
	}

	@Override
	public Double getDescuento() {
		return 10.0;
	}

	@Override
	public Integer getDiasDemora() {
		return diasDemora;
	}

	@Override
	public String toString() {
		return "Sube [diasDemora=" + diasDemora + ", toString()=" + super.toString() + "]";
	}

}
