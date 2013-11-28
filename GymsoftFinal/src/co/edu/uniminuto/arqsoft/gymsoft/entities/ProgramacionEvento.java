package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the programacion_evento database table.
 * 
 */
@Entity
@Table(name="programacion_evento")
@NamedQuery(name="ProgramacionEvento.findAll", query="SELECT p FROM ProgramacionEvento p")
public class ProgramacionEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROGRAMACION_EVENTO_IDPROGRAMACION_EVENTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROGRAMACION_EVENTO_IDPROGRAMACION_EVENTO_GENERATOR")
	private int idProgramacion_Evento;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String lugarFisico;

	//bi-directional many-to-one association to Actividad
	@ManyToOne
	private Actividad actividad;

	//bi-directional many-to-one association to Sede
	@ManyToOne
	private Sede sede;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	public ProgramacionEvento() {
	}

	public int getIdProgramacion_Evento() {
		return this.idProgramacion_Evento;
	}

	public void setIdProgramacion_Evento(int idProgramacion_Evento) {
		this.idProgramacion_Evento = idProgramacion_Evento;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLugarFisico() {
		return this.lugarFisico;
	}

	public void setLugarFisico(String lugarFisico) {
		this.lugarFisico = lugarFisico;
	}

	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public Sede getSede() {
		return this.sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}