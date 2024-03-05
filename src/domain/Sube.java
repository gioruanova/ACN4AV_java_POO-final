package domain;

public class Sube extends MedioPago {

	// ATRIBUTOS:
	private Integer diasDemora = 2;

	// CONSTRUCTORES:
	public Sube() {
		super("SUBE");
	}

	public Sube(String descripcion, Integer diasDemora) {
		super("SUBE");
		this.diasDemora = diasDemora;
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
