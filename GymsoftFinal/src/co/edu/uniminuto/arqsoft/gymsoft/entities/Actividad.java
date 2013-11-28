package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the actividad database table.
 * 
 */
@Entity
@NamedQuery(name="Actividad.findAll", query="SELECT a FROM Actividad a")
public class Actividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACTIVIDAD_IDACTIVIDAD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACTIVIDAD_IDACTIVIDAD_GENERATOR")
	private int idActividad;

	private String tipo;

	//bi-directional many-to-one association to ProgramacionEvento
	@OneToMany(mappedBy="actividad")
	private List<ProgramacionEvento> programacionEventos;

	public Actividad() {
	}

	public int getIdActividad() {
		return this.idActividad;
	}

	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<ProgramacionEvento> getProgramacionEventos() {
		return this.programacionEventos;
	}

	public void setProgramacionEventos(List<ProgramacionEvento> programacionEventos) {
		this.programacionEventos = programacionEventos;
	}

	public ProgramacionEvento addProgramacionEvento(ProgramacionEvento programacionEvento) {
		getProgramacionEventos().add(programacionEvento);
		programacionEvento.setActividad(this);

		return programacionEvento;
	}

	public ProgramacionEvento removeProgramacionEvento(ProgramacionEvento programacionEvento) {
		getProgramacionEventos().remove(programacionEvento);
		programacionEvento.setActividad(null);

		return programacionEvento;
	}

}