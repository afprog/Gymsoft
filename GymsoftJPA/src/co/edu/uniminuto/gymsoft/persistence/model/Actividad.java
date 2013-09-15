package co.edu.uniminuto.gymsoft.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
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
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idActividad;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	@Column(name="lugar_fisico")
	private String lugarFisico;

	private String tipo;

	//bi-directional many-to-one association to Sede
	@ManyToOne
	@JoinColumn(name="Sedes_idSedes")
	private Sede sede;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="actividad")
	private List<Usuario> usuarios;

	public Actividad() {
	}

	public int getIdActividad() {
		return this.idActividad;
	}

	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
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

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Sede getSede() {
		return this.sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setActividad(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setActividad(null);

		return usuario;
	}

}