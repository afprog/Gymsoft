package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the objetivo database table.
 * 
 */
@Entity
@NamedQuery(name="Objetivo.findAll", query="SELECT o FROM Objetivo o")
public class Objetivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OBJETIVO_IDOBJETIVO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OBJETIVO_IDOBJETIVO_GENERATOR")
	private int idObjetivo;

	private String descripcion;

	//bi-directional many-to-one association to PlanDeportista
	@OneToMany(mappedBy="objetivo")
	private List<PlanDeportista> planDeportistas;

	public Objetivo() {
	}

	public int getIdObjetivo() {
		return this.idObjetivo;
	}

	public void setIdObjetivo(int idObjetivo) {
		this.idObjetivo = idObjetivo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<PlanDeportista> getPlanDeportistas() {
		return this.planDeportistas;
	}

	public void setPlanDeportistas(List<PlanDeportista> planDeportistas) {
		this.planDeportistas = planDeportistas;
	}

	public PlanDeportista addPlanDeportista(PlanDeportista planDeportista) {
		getPlanDeportistas().add(planDeportista);
		planDeportista.setObjetivo(this);

		return planDeportista;
	}

	public PlanDeportista removePlanDeportista(PlanDeportista planDeportista) {
		getPlanDeportistas().remove(planDeportista);
		planDeportista.setObjetivo(null);

		return planDeportista;
	}

}