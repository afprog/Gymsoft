package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the maquina database table.
 * 
 */
@Entity
@NamedQuery(name="Maquina.findAll", query="SELECT m FROM Maquina m")
public class Maquina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MAQUINA_IDMAQUINA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MAQUINA_IDMAQUINA_GENERATOR")
	private int idMaquina;

	private String nombre;

	//bi-directional many-to-one association to AsociacionMaquinaUsuario
	@OneToMany(mappedBy="maquina")
	private List<AsociacionMaquinaUsuario> asociacionMaquinaUsuarios;

	//bi-directional many-to-one association to HistoricoMaquina
	@OneToMany(mappedBy="maquina")
	private List<HistoricoMaquina> historicoMaquinas;

	//bi-directional many-to-one association to Ejercicio
	@ManyToOne
	private Ejercicio ejercicio;

	public Maquina() {
	}

	public int getIdMaquina() {
		return this.idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<AsociacionMaquinaUsuario> getAsociacionMaquinaUsuarios() {
		return this.asociacionMaquinaUsuarios;
	}

	public void setAsociacionMaquinaUsuarios(List<AsociacionMaquinaUsuario> asociacionMaquinaUsuarios) {
		this.asociacionMaquinaUsuarios = asociacionMaquinaUsuarios;
	}

	public AsociacionMaquinaUsuario addAsociacionMaquinaUsuario(AsociacionMaquinaUsuario asociacionMaquinaUsuario) {
		getAsociacionMaquinaUsuarios().add(asociacionMaquinaUsuario);
		asociacionMaquinaUsuario.setMaquina(this);

		return asociacionMaquinaUsuario;
	}

	public AsociacionMaquinaUsuario removeAsociacionMaquinaUsuario(AsociacionMaquinaUsuario asociacionMaquinaUsuario) {
		getAsociacionMaquinaUsuarios().remove(asociacionMaquinaUsuario);
		asociacionMaquinaUsuario.setMaquina(null);

		return asociacionMaquinaUsuario;
	}

	public List<HistoricoMaquina> getHistoricoMaquinas() {
		return this.historicoMaquinas;
	}

	public void setHistoricoMaquinas(List<HistoricoMaquina> historicoMaquinas) {
		this.historicoMaquinas = historicoMaquinas;
	}

	public HistoricoMaquina addHistoricoMaquina(HistoricoMaquina historicoMaquina) {
		getHistoricoMaquinas().add(historicoMaquina);
		historicoMaquina.setMaquina(this);

		return historicoMaquina;
	}

	public HistoricoMaquina removeHistoricoMaquina(HistoricoMaquina historicoMaquina) {
		getHistoricoMaquinas().remove(historicoMaquina);
		historicoMaquina.setMaquina(null);

		return historicoMaquina;
	}

	public Ejercicio getEjercicio() {
		return this.ejercicio;
	}

	public void setEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}

}