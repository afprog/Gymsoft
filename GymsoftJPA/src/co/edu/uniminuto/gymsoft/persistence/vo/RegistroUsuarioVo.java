package co.edu.uniminuto.gymsoft.persistence.vo;

import javax.persistence.EntityTransaction;

import co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.Usuario;

public class RegistroUsuarioVo {
	private Usuario usuario;
	private UsuarioDAOImpl usuarioDAOImpl;

	public RegistroUsuarioVo(Usuario usuario) {
		super();
		this.usuario = usuario;
		usuarioDAOImpl = new UsuarioDAOImpl();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void guardarUsuario(){
		EntityTransaction transaction = usuarioDAOImpl.getDAOManager().getTransaction();
		transaction.begin();
		usuarioDAOImpl.save(this.usuario);
		transaction.commit();
	}

}
