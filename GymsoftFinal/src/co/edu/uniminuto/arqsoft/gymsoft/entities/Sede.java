package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sede database table.
 * 
 */
@Entity
@NamedQuery(name="Sede.findAll", query="SELECT s FROM Sede s")
public class Sede implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEDE_IDSEDE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEDE_IDSEDE_GENERATOR")
	private int idSede;

	private String direccion;

	private String foto;

	private String nombre;

	//bi-directional many-to-one association to ProgramacionEvento
	@OneToMany(mappedBy="sede")
	private List<ProgramacionEvento> programacionEventos;

	public Sede() {
	}

	public int getIdSede() {
		return this.idSede;
	}

	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ProgramacionEvento> getProgramacionEventos() {
		return this.programacionEventos;
	}

	public void setProgramacionEventos(List<ProgramacionEvento> programacionEventos) {
		this.programacionEventos = programacionEventos;
	}

	public ProgramacionEvento addProgramacionEvento(ProgramacionEvento programacionEvento) {
		getProgramacionEventos().add(programacionEvento);
		programacionEvento.setSede(this);

		return programacionEvento;
	}

	public ProgramacionEvento removeProgramacionEvento(ProgramacionEvento programacionEvento) {
		getProgramacionEventos().remove(programacionEvento);
		programacionEvento.setSede(null);

		return programacionEvento;
	}

}