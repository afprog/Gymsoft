package co.edu.uniminuto.arqsoft.daos;

import java.util.List;
import co.edu.uniminuto.arqsoft.gymsoft.entities.*;

/**
 * Interface for HistoricoMedidaDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IHistoricoMedidasDAO {
	/**
	 * Perform an initial save of a previously unsaved HistoricoMedida entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IHistoricoMedidaDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            HistoricoMedida entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(HistoricoMedida entity);

	/**
	 * Delete a persistent HistoricoMedida entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IHistoricoMedidaDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            HistoricoMedida entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(HistoricoMedida entity);

	/**
	 * Persist a previously saved HistoricoMedida entity and return it or a
	 * copy of it to the sender. A copy of the HistoricoMedida entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IHistoricoMedidaDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            HistoricoMedida entity to update
	 * @return HistoricoMedida the persisted HistoricoMedida entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public HistoricoMedida update(HistoricoMedida entity);

	public HistoricoMedida findById(Integer id);

	/**
	 * Find all HistoricoMedida entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the HistoricoMedida property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<HistoricoMedida> found by query
	 */
	public List<HistoricoMedida> findByProperty(String propertyName,
			Object value, int... rowStartIdxAndCount);

	/**
	 * Find all HistoricoMedida entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<HistoricoMedida> all HistoricoMedida entities
	 */
	public List<HistoricoMedida> findAll(int... rowStartIdxAndCount);
}