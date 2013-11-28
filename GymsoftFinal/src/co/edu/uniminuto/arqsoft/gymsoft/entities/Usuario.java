package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

	private String apellidos;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaNacimiento;

	private String genero;

	private String nombres;

	//bi-directional many-to-one association to AsociacionMaquinaUsuario
	@OneToMany(mappedBy="usuario")
	private List<AsociacionMaquinaUsuario> asociacionMaquinaUsuarios;

	//bi-directional many-to-one association to HistoricoMedida
	@OneToMany(mappedBy="usuario")
	private List<HistoricoMedida> historicoMedidas;

	//bi-directional many-to-one association to Pago
	@OneToMany(mappedBy="usuario")
	private List<Pago> pagos;

	//bi-directional many-to-one association to PlanDeportista
	@OneToMany(mappedBy="usuario")
	private List<PlanDeportista> planDeportistas;

	//bi-directional many-to-one association to ProgramacionEvento
	@OneToMany(mappedBy="usuario")
	private List<ProgramacionEvento> programacionEventos;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public List<AsociacionMaquinaUsuario> getAsociacionMaquinaUsuarios() {
		return this.asociacionMaquinaUsuarios;
	}

	public void setAsociacionMaquinaUsuarios(List<AsociacionMaquinaUsuario> asociacionMaquinaUsuarios) {
		this.asociacionMaquinaUsuarios = asociacionMaquinaUsuarios;
	}

	public AsociacionMaquinaUsuario addAsociacionMaquinaUsuario(AsociacionMaquinaUsuario asociacionMaquinaUsuario) {
		getAsociacionMaquinaUsuarios().add(asociacionMaquinaUsuario);
		asociacionMaquinaUsuario.setUsuario(this);

		return asociacionMaquinaUsuario;
	}

	public AsociacionMaquinaUsuario removeAsociacionMaquinaUsuario(AsociacionMaquinaUsuario asociacionMaquinaUsuario) {
		getAsociacionMaquinaUsuarios().remove(asociacionMaquinaUsuario);
		asociacionMaquinaUsuario.setUsuario(null);

		return asociacionMaquinaUsuario;
	}

	public List<HistoricoMedida> getHistoricoMedidas() {
		return this.historicoMedidas;
	}

	public void setHistoricoMedidas(List<HistoricoMedida> historicoMedidas) {
		this.historicoMedidas = historicoMedidas;
	}

	public HistoricoMedida addHistoricoMedida(HistoricoMedida historicoMedida) {
		getHistoricoMedidas().add(historicoMedida);
		historicoMedida.setUsuario(this);

		return historicoMedida;
	}

	public HistoricoMedida removeHistoricoMedida(HistoricoMedida historicoMedida) {
		getHistoricoMedidas().remove(historicoMedida);
		historicoMedida.setUsuario(null);

		return historicoMedida;
	}

	public List<Pago> getPagos() {
		return this.pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}

	public Pago addPago(Pago pago) {
		getPagos().add(pago);
		pago.setUsuario(this);

		return pago;
	}

	public Pago removePago(Pago pago) {
		getPagos().remove(pago);
		pago.setUsuario(null);

		return pago;
	}

	public List<PlanDeportista> getPlanDeportistas() {
		return this.planDeportistas;
	}

	public void setPlanDeportistas(List<PlanDeportista> planDeportistas) {
		this.planDeportistas = planDeportistas;
	}

	public PlanDeportista addPlanDeportista(PlanDeportista planDeportista) {
		getPlanDeportistas().add(planDeportista);
		planDeportista.setUsuario(this);

		return planDeportista;
	}

	public PlanDeportista removePlanDeportista(PlanDeportista planDeportista) {
		getPlanDeportistas().remove(planDeportista);
		planDeportista.setUsuario(null);

		return planDeportista;
	}

	public List<ProgramacionEvento> getProgramacionEventos() {
		return this.programacionEventos;
	}

	public void setProgramacionEventos(List<ProgramacionEvento> programacionEventos) {
		this.programacionEventos = programacionEventos;
	}

	public ProgramacionEvento addProgramacionEvento(ProgramacionEvento programacionEvento) {
		getProgramacionEventos().add(programacionEvento);
		programacionEvento.setUsuario(this);

		return programacionEvento;
	}

	public ProgramacionEvento removeProgramacionEvento(ProgramacionEvento programacionEvento) {
		getProgramacionEventos().remove(programacionEvento);
		programacionEvento.setUsuario(null);

		return programacionEvento;
	}

}