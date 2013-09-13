
 /***************************************************
 * Generated by DAOGenerator http://daogenerator.u-db.com
 * http://daogenerator.u-db.com email: buraksrc@gmail.com
 ***************************************************/
 
 
 package co.edu.uniminuto.gymsoft.persistence.daos.controller;
 
 
 
 import java.io.Serializable;
import java.util.List;

import co.edu.uniminuto.gymsoft.persistence.model.Categoria;
 
 
 /***************************************************
 *DAO interface of categoria table.
 *Generated on Thu Sep 12 21:23:17 COT 2013
 ***************************************************/
 
 
 public interface CategoriaDAO extends Serializable {
 
 /**
 * @return Categoria
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Categoria
 */
	public List<Categoria> findAll();
 
 /**
 * Inserts Categoria
 * @param: Categoria
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Categoria
 */
	public void save(Categoria arg0);
 
 /**
 * Updates Categoria
 * @param: Categoria
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Categoria
 */
	public void update(Categoria arg0);
 
 /**
 * Removes Categoria
 * @param: Categoria
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Categoria
 */
	public void delete(Categoria arg0);
 
 /**
 * @return Categoria
 * @param: java.lang.Integer Idcategoria
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Categoria
 */
	public List<Categoria> getCategoriaByIdcategoria(Integer idcategoria);

/**
 * @return Categoria
 * @param: java.lang.Integer idcategoria
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Categoria
 */
	public List<Categoria> getCategoriaByIdcategoria(Integer idcategoria, int startPosition, int maxResult);
 
 /**
 * @return Categoria
 * @param: java.lang.String Descripcion
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Categoria
 */
	public List<Categoria> getCategoriaByDescripcion(String descripcion);

/**
 * @return Categoria
 * @param: java.lang.String descripcion
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Categoria
 */
	public List<Categoria> getCategoriaByDescripcion(String descripcion, int startPosition, int maxResult);
 
 /**
 * @return Categoria
 * @param: java.lang.String Explicacion
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Categoria
 */
	public List<Categoria> getCategoriaByExplicacion(String explicacion);

/**
 * @return Categoria
 * @param: java.lang.String explicacion
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Categoria
 */
	public List<Categoria> getCategoriaByExplicacion(String explicacion, int startPosition, int maxResult);
 
 
 
 
 }