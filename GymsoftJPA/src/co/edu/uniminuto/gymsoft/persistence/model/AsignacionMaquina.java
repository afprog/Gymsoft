package co.edu.uniminuto.gymsoft.persistence.model;

import java.io.Serializable;
import javax.persistence.*;


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