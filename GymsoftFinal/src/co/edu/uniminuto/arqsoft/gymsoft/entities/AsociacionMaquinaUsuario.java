package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the asociacion_maquina_usuario database table.
 * 
 */
@Entity
@Table(name="asociacion_maquina_usuario")
@NamedQuery(name="AsociacionMaquinaUsuario.findAll", query="SELECT a FROM AsociacionMaquinaUsuario a")
public class AsociacionMaquinaUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ASOCIACION_MAQUINA_USUARIO_ASOCIACIONMAUINAUSUARIOID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ASOCIACION_MAQUINA_USUARIO_ASOCIACIONMAUINAUSUARIOID_GENERATOR")
	private int asociacionMauinaUsuarioId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="final")
	private Date final_;

	@Temporal(TemporalType.TIMESTAMP)
	private Date inicio;

	//bi-directional many-to-one association to Maquina
	@ManyToOne
	@JoinColumn(name="maquina_id")
	private Maquina maquina;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario_Id")
	private Usuario usuario;

	public AsociacionMaquinaUsuario() {
	}

	public int getAsociacionMauinaUsuarioId() {
		return this.asociacionMauinaUsuarioId;
	}

	public void setAsociacionMauinaUsuarioId(int asociacionMauinaUsuarioId) {
		this.asociacionMauinaUsuarioId = asociacionMauinaUsuarioId;
	}

	public Date getFinal_() {
		return this.final_;
	}

	public void setFinal_(Date final_) {
		this.final_ = final_;
	}

	public Date getInicio() {
		return this.inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Maquina getMaquina() {
		return this.maquina;
	}

	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}