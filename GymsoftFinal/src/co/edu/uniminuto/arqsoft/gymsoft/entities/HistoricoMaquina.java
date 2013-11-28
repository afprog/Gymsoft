package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the historico_maquina database table.
 * 
 */
@Entity
@Table(name="historico_maquina")
@NamedQuery(name="HistoricoMaquina.findAll", query="SELECT h FROM HistoricoMaquina h")
public class HistoricoMaquina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HISTORICO_MAQUINA_IDHISTORICO_MAQUINA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HISTORICO_MAQUINA_IDHISTORICO_MAQUINA_GENERATOR")
	private int idHistorico_Maquina;

	private double calorias;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private double ritmoCardiaco;

	private double tiempo;

	private double velocidad;

	//bi-directional many-to-one association to Maquina
	@ManyToOne
	private Maquina maquina;

	public HistoricoMaquina() {
	}

	public int getIdHistorico_Maquina() {
		return this.idHistorico_Maquina;
	}

	public void setIdHistorico_Maquina(int idHistorico_Maquina) {
		this.idHistorico_Maquina = idHistorico_Maquina;
	}

	public double getCalorias() {
		return this.calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getRitmoCardiaco() {
		return this.ritmoCardiaco;
	}

	public void setRitmoCardiaco(double ritmoCardiaco) {
		this.ritmoCardiaco = ritmoCardiaco;
	}

	public double getTiempo() {
		return this.tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public double getVelocidad() {
		return this.velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public Maquina getMaquina() {
		return this.maquina;
	}

	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}

}