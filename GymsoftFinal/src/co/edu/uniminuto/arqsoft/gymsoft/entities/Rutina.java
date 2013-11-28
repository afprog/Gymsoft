package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the rutina database table.
 * 
 */
@Entity
@NamedQuery(name="Rutina.findAll", query="SELECT r FROM Rutina r")
public class Rutina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RUTINA_IDRUTINA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RUTINA_IDRUTINA_GENERATOR")
	private int idRutina;

	private String descripcion;

	@Column(name="`duraci√≥n`")
	private String duraci√_n;

	private String regularidad;

	private String series;

	//bi-directional many-to-one association to Ejercicio
	@OneToMany(mappedBy="rutina")
	private List<Ejercicio> ejercicios;

	//bi-directional many-to-one association to PlanDeportista
	@OneToMany(mappedBy="rutina")
	private List<PlanDeportista> planDeportistas;

	public Rutina() {
	}

	public int getIdRutina() {
		return this.idRutina;
	}

	public void setIdRutina(int idRutina) {
		this.idRutina = idRutina;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDuraci√_n() {
		return this.duraci√_n;
	}

	public void setDuraci√_n(String duraci√_n) {
		this.duraci√_n = duraci√_n;
	}

	public String getRegularidad() {
		return this.regularidad;
	}

	public void setRegularidad(String regularidad) {
		this.regularidad = regularidad;
	}

	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public List<Ejercicio> getEjercicios() {
		return this.ejercicios;
	}

	public void setEjercicios(List<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}

	public Ejercicio addEjercicio(Ejercicio ejercicio) {
		getEjercicios().add(ejercicio);
		ejercicio.setRutina(this);

		return ejercicio;
	}

	public Ejercicio removeEjercicio(Ejercicio ejercicio) {
		getEjercicios().remove(ejercicio);
		ejercicio.setRutina(null);

		return ejercicio;
	}

	public List<PlanDeportista> getPlanDeportistas() {
		return this.planDeportistas;
	}

	public void setPlanDeportistas(List<PlanDeportista> planDeportistas) {
		this.planDeportistas = planDeportistas;
	}

	public PlanDeportista addPlanDeportista(PlanDeportista planDeportista) {
		getPlanDeportistas().add(planDeportista);
		planDeportista.setRutina(this);

		return planDeportista;
	}

	public PlanDeportista removePlanDeportista(PlanDeportista planDeportista) {
		getPlanDeportistas().remove(planDeportista);
		planDeportista.setRutina(null);

		return planDeportista;
	}

}