package domain;

public class Pase extends MedioPago {

	
	// ATRIBUTOS:
	private static final Integer DIAS_DE_DEMORA = 4;
	private Integer diasDemora;


	// CONSTRUCTORES:
	public Pase() {
		super("PASE");
		this.diasDemora = DIAS_DE_DEMORA;
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
		return "Pase [" + diasDemora + " dias de demora en pago.]";
	}

}
