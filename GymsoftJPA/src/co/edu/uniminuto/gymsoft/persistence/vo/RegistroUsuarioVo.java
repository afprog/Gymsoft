package co.edu.uniminuto.gymsoft.persistence.vo;

import javax.persistence.EntityTransaction;

import co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.Usuario;

public class RegistroUsuarioVo {
	private Usuario usuario;

	public RegistroUsuarioVo(Usuario usuario) {
		super();
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void guardarUsuario(){
		UsuarioDAOImpl usuarioDAOImpl = new UsuarioDAOImpl();
		EntityTransaction transaction = usuarioDAOImpl.getDAOManager().getTransaction();
		transaction.begin();
		usuarioDAOImpl.save(this.usuario);
		transaction.commit();
	}
	
	/**
	 * Creado Diego para actualizar deportistas.
	 */
	public void actualizarUsuario(){
	UsuarioDAOImpl usuarioDAOImpl = new UsuarioDAOImpl();
	EntityTransaction transaction = usuarioDAOImpl.getDAOManager().getTransaction();
	transaction.begin();
	usuarioDAOImpl.update(this.usuario);
	transaction.commit();
	}

}
