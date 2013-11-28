package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.Pago;

/**
 * Interface for PagoDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IPagoDAO {
	/**
	 * Perform an initial save of a previously unsaved Pago entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IPagoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Pago entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Pago entity);

	/**
	 * Delete a persistent Pago entity. This operation must be performed within
	 * the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IPagoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Pago entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Pago entity);

	/**
	 * Persist a previously saved Pago entity and return it or a copy of it to
	 * the sender. A copy of the Pago entity parameter is returned when the JPA
	 * persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IPagoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Pago entity to update
	 * @return Pago the persisted Pago entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Pago update(Pago entity);

	public Pago findById(Integer id);

	/**
	 * Find all Pago entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Pago property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Pago> found by query
	 */
	public List<Pago> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Pago> findByValor(Object valor, int... rowStartIdxAndCount);

	/**
	 * Find all Pago entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Pago> all Pago entities
	 */
	public List<Pago> findAll(int... rowStartIdxAndCount);
}