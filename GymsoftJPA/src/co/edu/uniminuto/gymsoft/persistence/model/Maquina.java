package co.edu.uniminuto.gymsoft.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the maquina database table.
 * 
 */
@Entity
@NamedQuery(name="Maquina.findAll", query="SELECT m FROM Maquina m")
public class Maquina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idMaquina;

	private String nombre;

	//bi-directional many-to-one association to AsignacionMaquina
	@OneToMany(mappedBy="maquina")
	private List<AsignacionMaquina> asignacionMaquinas;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	private Categoria categoria;

	public Maquina() {
	}

	public int getIdMaquina() {
		return this.idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<AsignacionMaquina> getAsignacionMaquinas() {
		return this.asignacionMaquinas;
	}

	public void setAsignacionMaquinas(List<AsignacionMaquina> asignacionMaquinas) {
		this.asignacionMaquinas = asignacionMaquinas;
	}

	public AsignacionMaquina addAsignacionMaquina(AsignacionMaquina asignacionMaquina) {
		getAsignacionMaquinas().add(asignacionMaquina);
		asignacionMaquina.setMaquina(this);

		return asignacionMaquina;
	}

	public AsignacionMaquina removeAsignacionMaquina(AsignacionMaquina asignacionMaquina) {
		getAsignacionMaquinas().remove(asignacionMaquina);
		asignacionMaquina.setMaquina(null);

		return asignacionMaquina;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}