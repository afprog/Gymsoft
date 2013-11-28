package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ejercicio database table.
 * 
 */
@Entity
@NamedQuery(name="Ejercicio.findAll", query="SELECT e FROM Ejercicio e")
public class Ejercicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EJERCICIO_IDEJERCICIO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EJERCICIO_IDEJERCICIO_GENERATOR")
	private int idEjercicio;

	private String descripcion;

	private String explicacion;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	private Categoria categoria;

	//bi-directional many-to-one association to Rutina
	@ManyToOne
	private Rutina rutina;

	//bi-directional many-to-one association to Maquina
	@OneToMany(mappedBy="ejercicio")
	private List<Maquina> maquinas;

	//bi-directional many-to-one association to ZonaCorporal
	@OneToMany(mappedBy="ejercicio")
	private List<ZonaCorporal> zonaCorporals;

	public Ejercicio() {
	}

	public int getIdEjercicio() {
		return this.idEjercicio;
	}

	public void setIdEjercicio(int idEjercicio) {
		this.idEjercicio = idEjercicio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExplicacion() {
		return this.explicacion;
	}

	public void setExplicacion(String explicacion) {
		this.explicacion = explicacion;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Rutina getRutina() {
		return this.rutina;
	}

	public void setRutina(Rutina rutina) {
		this.rutina = rutina;
	}

	public List<Maquina> getMaquinas() {
		return this.maquinas;
	}

	public void setMaquinas(List<Maquina> maquinas) {
		this.maquinas = maquinas;
	}

	public Maquina addMaquina(Maquina maquina) {
		getMaquinas().add(maquina);
		maquina.setEjercicio(this);

		return maquina;
	}

	public Maquina removeMaquina(Maquina maquina) {
		getMaquinas().remove(maquina);
		maquina.setEjercicio(null);

		return maquina;
	}

	public List<ZonaCorporal> getZonaCorporals() {
		return this.zonaCorporals;
	}

	public void setZonaCorporals(List<ZonaCorporal> zonaCorporals) {
		this.zonaCorporals = zonaCorporals;
	}

	public ZonaCorporal addZonaCorporal(ZonaCorporal zonaCorporal) {
		getZonaCorporals().add(zonaCorporal);
		zonaCorporal.setEjercicio(this);

		return zonaCorporal;
	}

	public ZonaCorporal removeZonaCorporal(ZonaCorporal zonaCorporal) {
		getZonaCorporals().remove(zonaCorporal);
		zonaCorporal.setEjercicio(null);

		return zonaCorporal;
	}

}