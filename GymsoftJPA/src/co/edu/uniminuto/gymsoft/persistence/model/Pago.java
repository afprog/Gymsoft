package co.edu.uniminuto.gymsoft.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pagos database table.
 * 
 */
@Entity
@Table(name="pagos")
@NamedQuery(name="Pago.findAll", query="SELECT p FROM Pago p")
public class Pago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pago_id;

	@Column(name="estado_pago")
	private String estadoPago;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private int valor;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	public Pago() {
	}

	public int getPago_id() {
		return this.pago_id;
	}

	public void setPago_id(int pago_id) {
		this.pago_id = pago_id;
	}

	public String getEstadoPago() {
		return this.estadoPago;
	}

	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}