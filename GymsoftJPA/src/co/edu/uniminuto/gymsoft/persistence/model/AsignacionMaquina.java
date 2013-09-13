package co.edu.uniminuto.gymsoft.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the asignacion_maquina database table.
 * 
 */
@Entity
@Table(name="asignacion_maquina")
@NamedQuery(name="AsignacionMaquina.findAll", query="SELECT a FROM AsignacionMaquina a")
public class AsignacionMaquina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idasignacion_maquina")
	private int idasignacionMaquina;

	@Temporal(TemporalType.DATE)
	private Date horafin;

	@Temporal(TemporalType.DATE)
	private Date horaini;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	//bi-directional many-to-one association to Maquina
	@ManyToOne
	private Maquina maquina;

	public AsignacionMaquina() {
	}

	public int getIdasignacionMaquina() {
		return this.idasignacionMaquina;
	}

	public void setIdasignacionMaquina(int idasignacionMaquina) {
		this.idasignacionMaquina = idasignacionMaquina;
	}

	public Date getHorafin() {
		return this.horafin;
	}

	public void setHorafin(Date horafin) {
		this.horafin = horafin;
	}

	public Date getHoraini() {
		return this.horaini;
	}

	public void setHoraini(Date horaini) {
		this.horaini = horaini;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Maquina getMaquina() {
		return this.maquina;
	}

	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}

}