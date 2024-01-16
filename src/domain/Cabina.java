package domain;

import java.util.ArrayList;
import java.util.List;

public class Cabina {

	// ATRIBUTOS
	private Long id;
	private MedioPago medioPago;
	private List<Registro> registros;

	// CONSTRUCTORES
	public Cabina() {
		this.registros = new ArrayList<Registro>();

	}

	public Cabina(Long id, MedioPago medioPago) {
		this();
		this.id = id;
		this.medioPago = medioPago;
	}

	// GETTERS Y SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MedioPago getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	public void addRegistros(Registro registro) {
		this.registros.add(registro);
	}

	@Override
	public String toString() {
		return "Cabina [id=" + id + ", medioPago=" + medioPago + ", registros=" + registros + "]";
	}
}
