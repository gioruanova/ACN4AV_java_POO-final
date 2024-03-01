package domain;

public class Sube extends MedioPago {

	// ATRIBUTOS:
	private Integer diasDemora;

	// CONSTRUCTORES:
	public Sube() {
		super("SUBE");
	}

	public Sube(String descripcion) {
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
		return "Sube [demora " + diasDemora + " dias]";
	}

}
