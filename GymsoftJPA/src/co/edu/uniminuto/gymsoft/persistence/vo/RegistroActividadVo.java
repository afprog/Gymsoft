package co.edu.uniminuto.gymsoft.persistence.vo;

import javax.persistence.EntityTransaction;

import co.edu.uniminuto.gymsoft.persistence.daos.ActividadDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.Actividad;

public class RegistroActividadVo {

	private Actividad actividad;

	public RegistroActividadVo(Actividad actividad) {
		super();
		this.actividad = actividad;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public void guardarActividad() {
		ActividadDAOImpl actividadDAOImpl = new ActividadDAOImpl();
		EntityTransaction transaction = actividadDAOImpl.getDAOManager()
				.getTransaction();
		transaction.begin();
		actividadDAOImpl.save(this.actividad);
		transaction.commit();
	}
}
