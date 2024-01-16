package domain;

public abstract class MedioPago {

	// ATRIBUTOS
	private String descripcion;

	// CONSTRUCTORES
	public MedioPago(String descripcion) {
		this.descripcion = descripcion;
	}

	// GETTERS Y SETTERS
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// METODO ABSTRACTO
	public abstract Double getDescuento();

	public abstract Integer getDiasDemora();

	@Override
	public String toString() {
		return "MedioPago [descripcion=" + descripcion + "]";
	}
}
