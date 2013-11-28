package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.Actividad;

/**
 * Interface for ActividadDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IActividadDAO {
	/**
	 * Perform an initial save of a previously unsaved Actividad entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IActividadDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Actividad entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Actividad entity);

	/**
	 * Delete a persistent Actividad entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IActividadDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Actividad entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Actividad entity);

	/**
	 * Persist a previously saved Actividad entity and return it or a copy of it
	 * to the sender. A copy of the Actividad entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IActividadDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Actividad entity to update
	 * @return Actividad the persisted Actividad entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Actividad update(Actividad entity);

	public Actividad findById(Integer id);

	/**
	 * Find all Actividad entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Actividad property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Actividad> found by query
	 */
	public List<Actividad> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Actividad> findByTipo(Object tipo, int... rowStartIdxAndCount);

	/**
	 * Find all Actividad entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Actividad> all Actividad entities
	 */
	public List<Actividad> findAll(int... rowStartIdxAndCount);
}