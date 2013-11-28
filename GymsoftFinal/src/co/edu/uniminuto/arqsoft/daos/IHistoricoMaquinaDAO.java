package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.HistoricoMaquina;

/**
 * Interface for HistoricoMaquinaDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IHistoricoMaquinaDAO {
	/**
	 * Perform an initial save of a previously unsaved HistoricoMaquina entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IHistoricoMaquinaDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            HistoricoMaquina entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(HistoricoMaquina entity);

	/**
	 * Delete a persistent HistoricoMaquina entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IHistoricoMaquinaDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            HistoricoMaquina entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(HistoricoMaquina entity);

	/**
	 * Persist a previously saved HistoricoMaquina entity and return it or a
	 * copy of it to the sender. A copy of the HistoricoMaquina entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IHistoricoMaquinaDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            HistoricoMaquina entity to update
	 * @return HistoricoMaquina the persisted HistoricoMaquina entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public HistoricoMaquina update(HistoricoMaquina entity);

	public HistoricoMaquina findById(Integer id);

	/**
	 * Find all HistoricoMaquina entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the HistoricoMaquina property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<HistoricoMaquina> found by query
	 */
	public List<HistoricoMaquina> findByProperty(String propertyName,
			Object value, int... rowStartIdxAndCount);

	public List<HistoricoMaquina> findByTiempo(Object tiempo,
			int... rowStartIdxAndCount);

	public List<HistoricoMaquina> findByVelocidad(Object velocidad,
			int... rowStartIdxAndCount);

	public List<HistoricoMaquina> findByRitmoCardiaco(Object ritmoCardiaco,
			int... rowStartIdxAndCount);

	public List<HistoricoMaquina> findByCalorias(Object calorias,
			int... rowStartIdxAndCount);

	/**
	 * Find all HistoricoMaquina entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<HistoricoMaquina> all HistoricoMaquina entities
	 */
	public List<HistoricoMaquina> findAll(int... rowStartIdxAndCount);
}