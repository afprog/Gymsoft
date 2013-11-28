package co.edu.uniminuto.arqsoft.gymsoft.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the zona_corporal database table.
 * 
 */
@Entity
@Table(name="zona_corporal")
@NamedQuery(name="ZonaCorporal.findAll", query="SELECT z FROM ZonaCorporal z")
public class ZonaCorporal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ZONA_CORPORAL_IDZONA_CORPORAL_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ZONA_CORPORAL_IDZONA_CORPORAL_GENERATOR")
	private int idZona_Corporal;

	private String descripcion;

	//bi-directional many-to-one association to Ejercicio
	@ManyToOne
	private Ejercicio ejercicio;

	public ZonaCorporal() {
	}

	public int getIdZona_Corporal() {
		return this.idZona_Corporal;
	}

	public void setIdZona_Corporal(int idZona_Corporal) {
		this.idZona_Corporal = idZona_Corporal;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Ejercicio getEjercicio() {
		return this.ejercicio;
	}

	public void setEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}

}