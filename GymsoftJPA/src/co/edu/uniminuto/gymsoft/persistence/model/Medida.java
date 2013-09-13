package co.edu.uniminuto.gymsoft.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the medidas database table.
 * 
 */
@Entity
@Table(name="medidas")
@NamedQuery(name="Medida.findAll", query="SELECT m FROM Medida m")
public class Medida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idMedidas;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private double medida;

	private String tipo;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	public Medida() {
	}

	public int getIdMedidas() {
		return this.idMedidas;
	}

	public void setIdMedidas(int idMedidas) {
		this.idMedidas = idMedidas;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getMedida() {
		return this.medida;
	}

	public void setMedida(double medida) {
		this.medida = medida;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}