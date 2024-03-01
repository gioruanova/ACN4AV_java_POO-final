package domain;

public enum CategoriaVehiculo {
	AUTO(10.0), MOTO(5.0), CAMION(20.0);

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
