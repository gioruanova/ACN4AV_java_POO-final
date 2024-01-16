package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EstacionPeaje {


	// ATRIBUTOS
	private Long id;
	private String descripcion;
	private List<Cabina> cabinas;

	private static Random random;

	// CONSTRUCTORES
	public EstacionPeaje() {
		this.cabinas = new ArrayList<Cabina>();
	}

	public EstacionPeaje(Long id, String descripcion) {
		this();
		this.id = id;
		this.descripcion = descripcion;
	}

	// GETTERS Y SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Cabina> getCabinas() {
		return cabinas;
	}

	public void setCabinas(List<Cabina> cabinas) {
		this.cabinas = cabinas;
	}

	public void addCabina(Cabina cabina) {
		this.cabinas.add(cabina);
	}

	// METODO ESTATICO
	public static Integer dameHoraActualConMath() {
		return (int) (Math.random() * 24);
	}

	public static Integer dameHoraActualConRandom() {
		if (random == null) {
			random = new Random();
		}
		return random.nextInt(24);
	}

	@Override
	public String toString() {
		return "EstacionPeaje [id=" + id + ", descripcion=" + descripcion + ", cabinas=" + cabinas + "]";
	}
}
