package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the historico_medidas database table.
 * 
 */
@Entity
@Table(name="historico_medidas")
@NamedQuery(name="HistoricoMedida.findAll", query="SELECT h FROM HistoricoMedida h")
public class HistoricoMedida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HISTORICO_MEDIDAS_IDHISTORICO_MEDIDAS_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HISTORICO_MEDIDAS_IDHISTORICO_MEDIDAS_GENERATOR")
	private int idHistorico_Medidas;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	//bi-directional many-to-one association to Medida
	@ManyToOne
	private Medida medida;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	public HistoricoMedida() {
	}

	public int getIdHistorico_Medidas() {
		return this.idHistorico_Medidas;
	}

	public void setIdHistorico_Medidas(int idHistorico_Medidas) {
		this.idHistorico_Medidas = idHistorico_Medidas;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Medida getMedida() {
		return this.medida;
	}

	public void setMedida(Medida medida) {
		this.medida = medida;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}