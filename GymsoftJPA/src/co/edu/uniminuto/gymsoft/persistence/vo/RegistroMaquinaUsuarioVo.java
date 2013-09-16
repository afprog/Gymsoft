package co.edu.uniminuto.gymsoft.persistence.vo;

import javax.persistence.EntityTransaction;

import co.edu.uniminuto.gymsoft.persistence.daos.AsignacionMaquinaDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.AsignacionMaquina;

public class RegistroMaquinaUsuarioVo {

	private AsignacionMaquina asignacionMaquina;

	public RegistroMaquinaUsuarioVo(AsignacionMaquina asignacionMaquina) {
		super();
		this.asignacionMaquina = asignacionMaquina;
	}

	public AsignacionMaquina getAsignacionMaquina() {
		return asignacionMaquina;
	}

	public void setAsignacionMaquina(AsignacionMaquina asignacionMaquina) {
		this.asignacionMaquina = asignacionMaquina;
	}

	public void guardarAsignacionActividad() {
		AsignacionMaquinaDAOImpl asignacionMaquina = new AsignacionMaquinaDAOImpl();
		EntityTransaction transaction = asignacionMaquina.getDAOManager()
				.getTransaction();
		transaction.begin();
		asignacionMaquina.save(this.asignacionMaquina);
		transaction.commit();
	}

}
