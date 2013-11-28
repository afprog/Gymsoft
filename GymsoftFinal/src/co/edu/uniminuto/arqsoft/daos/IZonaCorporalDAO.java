package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.ZonaCorporal;

/**
 * Interface for ZonaCorporalDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IZonaCorporalDAO {
	/**
	 * Perform an initial save of a previously unsaved ZonaCorporal entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IZonaCorporalDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            ZonaCorporal entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(ZonaCorporal entity);

	/**
	 * Delete a persistent ZonaCorporal entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IZonaCorporalDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            ZonaCorporal entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(ZonaCorporal entity);

	/**
	 * Persist a previously saved ZonaCorporal entity and return it or a copy of
	 * it to the sender. A copy of the ZonaCorporal entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IZonaCorporalDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            ZonaCorporal entity to update
	 * @return ZonaCorporal the persisted ZonaCorporal entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public ZonaCorporal update(ZonaCorporal entity);

	public ZonaCorporal findById(Integer id);

	/**
	 * Find all ZonaCorporal entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the ZonaCorporal property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<ZonaCorporal> found by query
	 */
	public List<ZonaCorporal> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<ZonaCorporal> findByDescripcion(Object descripcion,
			int... rowStartIdxAndCount);

	/**
	 * Find all ZonaCorporal entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<ZonaCorporal> all ZonaCorporal entities
	 */
	public List<ZonaCorporal> findAll(int... rowStartIdxAndCount);
}