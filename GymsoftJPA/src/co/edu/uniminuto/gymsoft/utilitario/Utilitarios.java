package co.edu.uniminuto.gymsoft.utilitario;

import java.util.List;

import co.edu.uniminuto.gymsoft.persistence.daos.RutinaDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.Rutina;
import co.edu.uniminuto.gymsoft.persistence.model.Usuario;

public class Utilitarios {
	
	public static List<Usuario> obtenerDeportistas(){
		UsuarioDAOImpl usuarioDao = new UsuarioDAOImpl();
		return usuarioDao.getUsuarioByPerfil("Deportista");
	}
	
	public static List<Rutina> obtenerRutinas(){
		RutinaDAOImpl rutinaDao = new RutinaDAOImpl();
		System.out.println("<----------------- " + rutinaDao.findAll().size());
		return rutinaDao.findAll();
	}

}
