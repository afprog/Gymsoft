
 /***************************************************
 * Generated by DAOGenerator http://daogenerator.u-db.com
 * http://daogenerator.u-db.com email: buraksrc@gmail.com
 ***************************************************/
 
 
 package co.edu.uniminuto.gymsoft.persistence.daos.controller;
 
 
 
 import java.io.Serializable;
import java.util.Date;
import java.util.List;

import co.edu.uniminuto.gymsoft.persistence.model.AsignacionMaquina;
 
 
 /***************************************************
 *DAO interface of asignacion_maquina table.
 *Generated on Thu Sep 12 21:23:17 COT 2013
 ***************************************************/
 
 
 public interface AsignacionMaquinaDAO extends Serializable {
 
 /**
 * @return Asignacionmaquina
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> findAll();
 
 /**
 * Inserts Asignacionmaquina
 * @param: AsignacionMaquina
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public void save(AsignacionMaquina arg0);
 
 /**
 * Updates Asignacionmaquina
 * @param: AsignacionMaquina
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public void update(AsignacionMaquina arg0);
 
 /**
 * Removes Asignacionmaquina
 * @param: AsignacionMaquina
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public void delete(AsignacionMaquina arg0);
 
 /**
 * @return Asignacionmaquina
 * @param: java.lang.Integer IdasignacionMaquina
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> getAsignacionMaquinaByIdasignacionMaquina(Integer idasignacionMaquina);

/**
 * @return Asignacionmaquina
 * @param: java.lang.Integer idasignacionMaquina
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> getAsignacionMaquinaByIdasignacionMaquina(Integer idasignacionMaquina, int startPosition, int maxResult);
 
 /**
 * @return Asignacionmaquina
 * @param: java.lang.Integer UsuarioIdusuario
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> getAsignacionMaquinaByUsuarioIdusuario(Integer usuarioIdusuario);

/**
 * @return Asignacionmaquina
 * @param: java.lang.Integer usuarioIdusuario
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> getAsignacionMaquinaByUsuarioIdusuario(Integer usuarioIdusuario, int startPosition, int maxResult);
 
 /**
 * @return Asignacionmaquina
 * @param: java.lang.Integer MaquinaIdmaquina
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> getAsignacionMaquinaByMaquinaIdmaquina(Integer maquinaIdmaquina);

/**
 * @return Asignacionmaquina
 * @param: java.lang.Integer maquinaIdmaquina
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> getAsignacionMaquinaByMaquinaIdmaquina(Integer maquinaIdmaquina, int startPosition, int maxResult);
 
 /**
 * @return Asignacionmaquina
 * @param: java.util.Date Horaini
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> getAsignacionMaquinaByHoraini(Date horaini);

/**
 * @return Asignacionmaquina
 * @param: java.util.Date horaini
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> getAsignacionMaquinaByHoraini(Date horaini, int startPosition, int maxResult);
 
 /**
 * @return Asignacionmaquina
 * @param: java.util.Date Horafin
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> getAsignacionMaquinaByHorafin(Date horafin);

/**
 * @return Asignacionmaquina
 * @param: java.util.Date horafin
 * @param: int startposition
 * @param: int maxresults
 * Generated on: Thu Sep 12 21:23:17 COT 2013
 * @See Asignacionmaquina
 */
	public List<AsignacionMaquina> getAsignacionMaquinaByHorafin(Date horafin, int startPosition, int maxResult);
 
 
 
 
 }