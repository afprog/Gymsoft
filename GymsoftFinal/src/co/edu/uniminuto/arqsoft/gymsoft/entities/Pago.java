package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pago database table.
 * 
 */
@Entity
@NamedQuery(name="Pago.findAll", query="SELECT p FROM Pago p")
public class Pago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PAGO_IDPAGO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAGO_IDPAGO_GENERATOR")
	private int idPago;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private double valor;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	public Pago() {
	}

	public int getIdPago() {
		return this.idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}