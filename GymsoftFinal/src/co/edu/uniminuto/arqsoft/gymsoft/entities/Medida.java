package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the medida database table.
 * 
 */
@Entity
@NamedQuery(name="Medida.findAll", query="SELECT m FROM Medida m")
public class Medida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MEDIDA_IDMEDIDA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MEDIDA_IDMEDIDA_GENERATOR")
	private int idMedida;

	private double brazos;

	private double cintura;

	private double peso;

	private double piernas;

	private double presionSanguinea;

	private int ritmoCardiaco;

	//bi-directional many-to-one association to HistoricoMedida
	@OneToMany(mappedBy="medida")
	private List<HistoricoMedida> historicoMedidas;

	public Medida() {
	}

	public int getIdMedida() {
		return this.idMedida;
	}

	public void setIdMedida(int idMedida) {
		this.idMedida = idMedida;
	}

	public double getBrazos() {
		return this.brazos;
	}

	public void setBrazos(double brazos) {
		this.brazos = brazos;
	}

	public double getCintura() {
		return this.cintura;
	}

	public void setCintura(double cintura) {
		this.cintura = cintura;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPiernas() {
		return this.piernas;
	}

	public void setPiernas(double piernas) {
		this.piernas = piernas;
	}

	public double getPresionSanguinea() {
		return this.presionSanguinea;
	}

	public void setPresionSanguinea(double presionSanguinea) {
		this.presionSanguinea = presionSanguinea;
	}

	public int getRitmoCardiaco() {
		return this.ritmoCardiaco;
	}

	public void setRitmoCardiaco(int ritmoCardiaco) {
		this.ritmoCardiaco = ritmoCardiaco;
	}

	public List<HistoricoMedida> getHistoricoMedidas() {
		return this.historicoMedidas;
	}

	public void setHistoricoMedidas(List<HistoricoMedida> historicoMedidas) {
		this.historicoMedidas = historicoMedidas;
	}

	public HistoricoMedida addHistoricoMedida(HistoricoMedida historicoMedida) {
		getHistoricoMedidas().add(historicoMedida);
		historicoMedida.setMedida(this);

		return historicoMedida;
	}

	public HistoricoMedida removeHistoricoMedida(HistoricoMedida historicoMedida) {
		getHistoricoMedidas().remove(historicoMedida);
		historicoMedida.setMedida(null);

		return historicoMedida;
	}

}