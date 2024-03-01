package domain;

public abstract class MedioPago {

	// ATRIBUTOS:
	private String descripcion;

	// CONSTRUCTORES:
	public MedioPago(String descripcion) {
		this.descripcion = descripcion;
	}

	public abstract Double getDescuento();

	public abstract Integer getDiasDeMora();

	// METODO TOSTRING DEFAULT
	@Override
	public String toString() {
		return "MedioDePago{" + "description='" + descripcion + '\'' + '}';
	}
}
