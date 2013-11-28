package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.PlanDeportista;

/**
 * Interface for PlanDeportistaDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IPlanDeportistaDAO {
	/**
	 * Perform an initial save of a previously unsaved PlanDeportista entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IPlanDeportistaDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            PlanDeportista entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(PlanDeportista entity);

	/**
	 * Delete a persistent PlanDeportista entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IPlanDeportistaDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            PlanDeportista entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(PlanDeportista entity);

	/**
	 * Persist a previously saved PlanDeportista entity and return it or a copy
	 * of it to the sender. A copy of the PlanDeportista entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IPlanDeportistaDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            PlanDeportista entity to update
	 * @return PlanDeportista the persisted PlanDeportista entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public PlanDeportista update(PlanDeportista entity);

	public PlanDeportista findById(Integer id);

	/**
	 * Find all PlanDeportista entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the PlanDeportista property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<PlanDeportista> found by query
	 */
	public List<PlanDeportista> findByProperty(String propertyName,
			Object value, int... rowStartIdxAndCount);

	/**
	 * Find all PlanDeportista entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<PlanDeportista> all PlanDeportista entities
	 */
	public List<PlanDeportista> findAll(int... rowStartIdxAndCount);
}