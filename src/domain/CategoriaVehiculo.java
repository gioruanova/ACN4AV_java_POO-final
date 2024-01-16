package domain;

public enum CategoriaVehiculo {
	AUTO(100.0), MOTO(50.0), CAMION(200.0);

	private Double tarifa;

	private CategoriaVehiculo(Double tarifa) {
		this.tarifa = tarifa;
	}

	public Double getTarifa() {
		return tarifa;
	}
}
