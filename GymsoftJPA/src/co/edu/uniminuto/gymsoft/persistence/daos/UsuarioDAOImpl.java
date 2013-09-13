
 /***************************************************
 * Generated by DAOGenerator http://daogenerator.u-db.com
 * http://daogenerator.u-db.com email: buraksrc@gmail.com
 ***************************************************/
 
 
 package co.edu.uniminuto.gymsoft.persistence.daos;
 
 
 import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import co.edu.uniminuto.gymsoft.persistence.customdaos.CustomDAOSupport;
import co.edu.uniminuto.gymsoft.persistence.daos.controller.UsuarioDAO;
import co.edu.uniminuto.gymsoft.persistence.model.Usuario;
 
 
 /***************************************************
 *DAO class of usuario table.
 *Generated on Thu Sep 12 21:23:18 COT 2013
 ***************************************************/
 
 
 public class UsuarioDAOImpl extends CustomDAOSupport<Usuario, Long>  implements Serializable, UsuarioDAO {
 
 
	public UsuarioDAOImpl(){
		super( Usuario.class);
	}
 
 /**
 * @return Usuario
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> findAll(){

		Query query = getDAOManager().createQuery(" select t from Usuario t");

		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 /**
 * Inserts Usuario
 * @param: Usuario
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public void save(Usuario arg0){

		getDAOManager().persist(arg0);

	}
 
 /**
 * Updates Usuario
 * @param: Usuario
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public void update(Usuario arg0){

		getDAOManager().merge(arg0);

	}
 
 /**
 * Removes Usuario
 * @param: Usuario
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public void delete(Usuario arg0){

		getDAOManager().remove(arg0);

	}
 
 /**
 * @return Usuario
 * @param: java.lang.Integer Idusuario
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByIdusuario(Integer idusuario){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.idusuario = ?1 ");

		query.setParameter(1, idusuario);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}

/**
 * @return Usuario
 * @param: java.lang.Integer idusuario
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByIdusuario(Integer idusuario, int startPosition, int maxResult){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.idusuario = ?1 ");

		if(startPosition > 0 && startPosition < maxResult){
			query.setMaxResults(maxResult);
			query.setFirstResult(startPosition);
		}

			query.setParameter(1, idusuario);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 /**
 * @return Usuario
 * @param: java.lang.String Nombre
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByNombre(String nombre){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.nombre = ?1 ");

		query.setParameter(1, nombre);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}

/**
 * @return Usuario
 * @param: java.lang.String nombre
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByNombre(String nombre, int startPosition, int maxResult){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.nombre = ?1 ");

		if(startPosition > 0 && startPosition < maxResult){
			query.setMaxResults(maxResult);
			query.setFirstResult(startPosition);
		}

			query.setParameter(1, nombre);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 /**
 * @return Usuario
 * @param: java.lang.String Genero
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByGenero(String genero){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.genero = ?1 ");

		query.setParameter(1, genero);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}

/**
 * @return Usuario
 * @param: java.lang.String genero
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByGenero(String genero, int startPosition, int maxResult){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.genero = ?1 ");

		if(startPosition > 0 && startPosition < maxResult){
			query.setMaxResults(maxResult);
			query.setFirstResult(startPosition);
		}

			query.setParameter(1, genero);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 /**
 * @return Usuario
 * @param: java.util.Date Fechanacimiento
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByFechanacimiento(Date fechanacimiento){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.fechanacimiento = ?1 ");

		query.setParameter(1, fechanacimiento);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}

/**
 * @return Usuario
 * @param: java.util.Date fechanacimiento
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByFechanacimiento(Date fechanacimiento, int startPosition, int maxResult){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.fechanacimiento = ?1 ");

		if(startPosition > 0 && startPosition < maxResult){
			query.setMaxResults(maxResult);
			query.setFirstResult(startPosition);
		}

			query.setParameter(1, fechanacimiento);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 /**
 * @return Usuario
 * @param: java.lang.Integer Altura
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByAltura(Integer altura){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.altura = ?1 ");

		query.setParameter(1, altura);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}

/**
 * @return Usuario
 * @param: java.lang.Integer altura
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByAltura(Integer altura, int startPosition, int maxResult){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.altura = ?1 ");

		if(startPosition > 0 && startPosition < maxResult){
			query.setMaxResults(maxResult);
			query.setFirstResult(startPosition);
		}

			query.setParameter(1, altura);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 /**
 * @return Usuario
 * @param: java.lang.Integer ActividadIdactividad
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByActividadIdactividad(Integer actividadIdactividad){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.actividadIdactividad = ?1 ");

		query.setParameter(1, actividadIdactividad);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}

/**
 * @return Usuario
 * @param: java.lang.Integer actividadIdactividad
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByActividadIdactividad(Integer actividadIdactividad, int startPosition, int maxResult){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.actividadIdactividad = ?1 ");

		if(startPosition > 0 && startPosition < maxResult){
			query.setMaxResults(maxResult);
			query.setFirstResult(startPosition);
		}

			query.setParameter(1, actividadIdactividad);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 /**
 * @return Usuario
 * @param: java.lang.String Perfil
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByPerfil(String perfil){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.perfil = ?1 ");

		query.setParameter(1, perfil);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}

/**
 * @return Usuario
 * @param: java.lang.String perfil
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Usuario
 */
	public List<Usuario> getUsuarioByPerfil(String perfil, int startPosition, int maxResult){

		Query query = getDAOManager().createQuery(" select t from Usuario t where t.perfil = ?1 ");

		if(startPosition > 0 && startPosition < maxResult){
			query.setMaxResults(maxResult);
			query.setFirstResult(startPosition);
		}

			query.setParameter(1, perfil);


		List<Usuario> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 
 
 
 }