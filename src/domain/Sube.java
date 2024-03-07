package domain;

public class Sube extends MedioPago {

	
	// ATRIBUTOS:
	private static final Integer DIAS_DE_DEMORA = 2;
	private Integer diasDemora;


	// CONSTRUCTORES:
	public Sube() {
		super("SUBE");
		this.diasDemora = DIAS_DE_DEMORA;
	}


	// GETTERS & SETTERS
	public void setDiasDemora(Integer diasDemora) {
		this.diasDemora = diasDemora;
	}

	@Override
	public Double getDescuento() {
		return 10D;
	}

	@Override
	public Integer getDiasDeMora() {
		return this.diasDemora;
	}

	// METODO TOSTRING DEFAULT
	@Override
	public String toString() {
		return "Sube [" + diasDemora + " dias de demora]";
	}

}
