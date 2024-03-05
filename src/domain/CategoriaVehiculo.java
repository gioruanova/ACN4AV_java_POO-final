package domain;

public enum CategoriaVehiculo {
	AUTO(22.0), CAMION(35.0), MOTO(8.5);

	private Double tarifa;

	CategoriaVehiculo(Double tarifa) {
		this.tarifa = tarifa;
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	// METODO TOSTRING DEFAULT
	@Override
	public String toString() {
		return "CategoriaVehiculo{" + "tarifa=" + tarifa + '}';
	}
}
