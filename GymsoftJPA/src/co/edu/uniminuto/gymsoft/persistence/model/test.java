package co.edu.uniminuto.gymsoft.persistence.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityTransaction;

import co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.vo.RegistroUsuarioVo;

public class test {

	public static void main(String[] args) {
		UsuarioDAOImpl usuarioDAOImpl = new UsuarioDAOImpl();
		//List<Usuario> result = usuarioDAOImpl.findAll();
		Usuario record = new Usuario();
		record.setNombre("Thomas");
		record.setGenero("F");
		record.setAltura(190);
		record.setFechanacimiento(new Date(1987, 9, 17));
		record.setPerfil("Usuario");
		RegistroUsuarioVo reg = new RegistroUsuarioVo(record);
		reg.guardarUsuario();
//		EntityTransaction transaction = usuarioDAOImpl.getDAOManager().getTransaction();
//		transaction.begin();
//		List<Usuario> result = usuarioDAOImpl.findAll();
//		transaction.commit();
//		System.out.println("Usuarios " + result.get(0).getAltura());
	}

}
