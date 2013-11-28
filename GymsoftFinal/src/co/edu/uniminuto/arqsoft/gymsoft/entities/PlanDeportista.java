package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the plan_deportista database table.
 * 
 */
@Entity
@Table(name="plan_deportista")
@NamedQuery(name="PlanDeportista.findAll", query="SELECT p FROM PlanDeportista p")
public class PlanDeportista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PLAN_DEPORTISTA_IDPLAN_DEPORTISTA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PLAN_DEPORTISTA_IDPLAN_DEPORTISTA_GENERATOR")
	private int idPlan_Deportista;

	//bi-directional many-to-one association to Objetivo
	@ManyToOne
	private Objetivo objetivo;

	//bi-directional many-to-one association to Rutina
	@ManyToOne
	private Rutina rutina;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	public PlanDeportista() {
	}

	public int getIdPlan_Deportista() {
		return this.idPlan_Deportista;
	}

	public void setIdPlan_Deportista(int idPlan_Deportista) {
		this.idPlan_Deportista = idPlan_Deportista;
	}

	public Objetivo getObjetivo() {
		return this.objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	public Rutina getRutina() {
		return this.rutina;
	}

	public void setRutina(Rutina rutina) {
		this.rutina = rutina;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}