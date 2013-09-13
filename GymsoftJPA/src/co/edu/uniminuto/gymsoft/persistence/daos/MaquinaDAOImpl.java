
 /***************************************************
 * Generated by DAOGenerator http://daogenerator.u-db.com
 * http://daogenerator.u-db.com email: buraksrc@gmail.com
 ***************************************************/
 
 
 package co.edu.uniminuto.gymsoft.persistence.daos;
 
 
 import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import co.edu.uniminuto.gymsoft.persistence.customdaos.CustomDAOSupport;
import co.edu.uniminuto.gymsoft.persistence.daos.controller.MaquinaDAO;
import co.edu.uniminuto.gymsoft.persistence.model.Maquina;
 
 
 /***************************************************
 *DAO class of maquina table.
 *Generated on Thu Sep 12 21:23:18 COT 2013
 ***************************************************/
 
 
 public class MaquinaDAOImpl extends CustomDAOSupport<Maquina, Long>  implements Serializable, MaquinaDAO {
 
 
	public MaquinaDAOImpl(){
		super( Maquina.class);
	}
 
 /**
 * @return Maquina
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Maquina
 */
	public List<Maquina> findAll(){

		Query query = getDAOManager().createQuery(" select t from Maquina t");

		List<Maquina> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 /**
 * Inserts Maquina
 * @param: Maquina
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Maquina
 */
	public void save(Maquina arg0){

		getDAOManager().persist(arg0);

	}
 
 /**
 * Updates Maquina
 * @param: Maquina
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Maquina
 */
	public void update(Maquina arg0){

		getDAOManager().merge(arg0);

	}
 
 /**
 * Removes Maquina
 * @param: Maquina
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Maquina
 */
	public void delete(Maquina arg0){

		getDAOManager().remove(arg0);

	}
 
 /**
 * @return Maquina
 * @param: java.lang.Integer Idmaquina
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Maquina
 */
	public List<Maquina> getMaquinaByIdmaquina(Integer idmaquina){

		Query query = getDAOManager().createQuery(" select t from Maquina t where t.idmaquina = ?1 ");

		query.setParameter(1, idmaquina);


		List<Maquina> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}

/**
 * @return Maquina
 * @param: java.lang.Integer idmaquina
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Maquina
 */
	public List<Maquina> getMaquinaByIdmaquina(Integer idmaquina, int startPosition, int maxResult){

		Query query = getDAOManager().createQuery(" select t from Maquina t where t.idmaquina = ?1 ");

		if(startPosition > 0 && startPosition < maxResult){
			query.setMaxResults(maxResult);
			query.setFirstResult(startPosition);
		}

			query.setParameter(1, idmaquina);


		List<Maquina> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 /**
 * @return Maquina
 * @param: java.lang.String Nombre
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Maquina
 */
	public List<Maquina> getMaquinaByNombre(String nombre){

		Query query = getDAOManager().createQuery(" select t from Maquina t where t.nombre = ?1 ");

		query.setParameter(1, nombre);


		List<Maquina> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}

/**
 * @return Maquina
 * @param: java.lang.String nombre
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Maquina
 */
	public List<Maquina> getMaquinaByNombre(String nombre, int startPosition, int maxResult){

		Query query = getDAOManager().createQuery(" select t from Maquina t where t.nombre = ?1 ");

		if(startPosition > 0 && startPosition < maxResult){
			query.setMaxResults(maxResult);
			query.setFirstResult(startPosition);
		}

			query.setParameter(1, nombre);


		List<Maquina> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 /**
 * @return Maquina
 * @param: java.lang.Integer CategoriaIdcategoria
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Maquina
 */
	public List<Maquina> getMaquinaByCategoriaIdcategoria(Integer categoriaIdcategoria){

		Query query = getDAOManager().createQuery(" select t from Maquina t where t.categoriaIdcategoria = ?1 ");

		query.setParameter(1, categoriaIdcategoria);


		List<Maquina> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}

/**
 * @return Maquina
 * @param: java.lang.Integer categoriaIdcategoria
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:18 COT 2013
 * @See Maquina
 */
	public List<Maquina> getMaquinaByCategoriaIdcategoria(Integer categoriaIdcategoria, int startPosition, int maxResult){

		Query query = getDAOManager().createQuery(" select t from Maquina t where t.categoriaIdcategoria = ?1 ");

		if(startPosition > 0 && startPosition < maxResult){
			query.setMaxResults(maxResult);
			query.setFirstResult(startPosition);
		}

			query.setParameter(1, categoriaIdcategoria);


		List<Maquina> results = query.getResultList();

		if (results !=null && results.size() > 0) {
			return results;
		}

		return null;
	}
 
 
 
 
 }