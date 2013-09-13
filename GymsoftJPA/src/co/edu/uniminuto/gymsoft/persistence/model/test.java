package co.edu.uniminuto.gymsoft.persistence.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityTransaction;

import co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl;

public class test {

	public static void main(String[] args) {
		UsuarioDAOImpl usuarioDAOImpl = new UsuarioDAOImpl();
		//List<Usuario> result = usuarioDAOImpl.findAll();
		Usuario record = new Usuario();
		record.setNombre("Angela");
		record.setGenero("F");
		record.setAltura(190);
		record.setFechanacimiento(new Date(1987, 9, 17));
		record.setPerfil("Usuario");
		record.setIdUsuario(2);
		EntityTransaction transaction = usuarioDAOImpl.getDAOManager().getTransaction();
		transaction.begin();
		usuarioDAOImpl.delete(record);
		transaction.commit();
		//System.out.println("Usuarios " + result.get(0).getAltura());
	}

}
