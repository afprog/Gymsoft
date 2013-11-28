package co.edu.uniminuto.arqsoft.test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

import co.edu.uniminuto.arqsoft.daos.EntityManagerHelper;
import co.edu.uniminuto.arqsoft.daos.UsuarioDAO;
import co.edu.uniminuto.arqsoft.gymsoft.entities.Usuario;

public class PersistenceTest {

	@Test
	public void test() {
		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> all = dao.findAll(0);
		Usuario record = all.get(0);
		assertThat(record.getNombres(), is("andres"));
		record.setNombres("andresA");
		EntityManagerHelper.beginTransaction();
		dao.update(record);
		EntityManagerHelper.commit();
		all = dao.findAll(0);
		Usuario nuevo = all.get(0);
		assertThat(nuevo.getNombres(), is("andresA"));
//		System.out.println(all.get(0).getNombrePersona());
	}

}
