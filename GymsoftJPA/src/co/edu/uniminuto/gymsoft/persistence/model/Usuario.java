package co.edu.uniminuto.gymsoft.persistence.model;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUsuario;

	private int altura;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String genero;

	private String nombre;

	private String perfil;

	//bi-directional many-to-one association to AsignacionMaquina
	@OneToMany(mappedBy="usuario")
	private List<AsignacionMaquina> asignacionMaquinas;

	//bi-directional many-to-one association to Medida
	@OneToMany(mappedBy="usuario")
	private List<Medida> medidas;

	//bi-directional many-to-one association to Objetivo
	@OneToMany(mappedBy="usuario")
	private List<Objetivo> objetivos;

	//bi-directional many-to-one association to Pago
	@OneToMany(mappedBy="usuario")
	private List<Pago> pagos;

	//bi-directional many-to-one association to Actividad
	@ManyToOne
	private Actividad actividad;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPerfil() {
		return this.perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public List<AsignacionMaquina> getAsignacionMaquinas() {
		return this.asignacionMaquinas;
	}

	public void setAsignacionMaquinas(List<AsignacionMaquina> asignacionMaquinas) {
		this.asignacionMaquinas = asignacionMaquinas;
	}

	public AsignacionMaquina addAsignacionMaquina(AsignacionMaquina asignacionMaquina) {
		getAsignacionMaquinas().add(asignacionMaquina);
		asignacionMaquina.setUsuario(this);

		return asignacionMaquina;
	}

	public AsignacionMaquina removeAsignacionMaquina(AsignacionMaquina asignacionMaquina) {
		getAsignacionMaquinas().remove(asignacionMaquina);
		asignacionMaquina.setUsuario(null);

		return asignacionMaquina;
	}

	public List<Medida> getMedidas() {
		return this.medidas;
	}

	public void setMedidas(List<Medida> medidas) {
		this.medidas = medidas;
	}

	public Medida addMedida(Medida medida) {
		getMedidas().add(medida);
		medida.setUsuario(this);

		return medida;
	}

	public Medida removeMedida(Medida medida) {
		getMedidas().remove(medida);
		medida.setUsuario(null);

		return medida;
	}

	public List<Objetivo> getObjetivos() {
		return this.objetivos;
	}

	public void setObjetivos(List<Objetivo> objetivos) {
		this.objetivos = objetivos;
	}

	public Objetivo addObjetivo(Objetivo objetivo) {
		getObjetivos().add(objetivo);
		objetivo.setUsuario(this);

		return objetivo;
	}

	public Objetivo removeObjetivo(Objetivo objetivo) {
		getObjetivos().remove(objetivo);
		objetivo.setUsuario(null);

		return objetivo;
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

	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

}