package domain;

public class Pase extends MedioPago {

	// ATRIBUTOS:
	private Integer diasDemora;

	// CONSTRUCTORES:
	public Pase() {
		super("PASE");
	}

	public Pase(String descripcion) {
		super("PASE");
		this.diasDemora = diasDemora;
	}

	@Override
	public Double getDescuento() {
		int dias = (diasDemora != null) ? diasDemora.intValue() : 0;
		double descuentoValor = 0D;
		if (dias > 0 && dias <= 5) {
			descuentoValor = 0.05;
		} else if (dias > 5 && dias <= 10) {
			descuentoValor = 0.1;
		}
		return descuentoValor;
	}

	public void setDiasDemora(Integer diasDemora) {
		this.diasDemora = diasDemora;
	}

	@Override
	public Integer getDiasDeMora() {
		return diasDemora;
	}

	// METODO TOSTRING DEFAULT
	@Override
	public String toString() {
		return "Pase [demora " + diasDemora + " dias]";
	}

}
