package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.Sede;

/**
 * Interface for SedeDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ISedeDAO {
	/**
	 * Perform an initial save of a previously unsaved Sede entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ISedeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Sede entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Sede entity);

	/**
	 * Delete a persistent Sede entity. This operation must be performed within
	 * the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ISedeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Sede entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Sede entity);

	/**
	 * Persist a previously saved Sede entity and return it or a copy of it to
	 * the sender. A copy of the Sede entity parameter is returned when the JPA
	 * persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ISedeDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Sede entity to update
	 * @return Sede the persisted Sede entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Sede update(Sede entity);

	public Sede findById(Integer id);

	/**
	 * Find all Sede entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Sede property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Sede> found by query
	 */
	public List<Sede> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Sede> findByNombre(Object nombre, int... rowStartIdxAndCount);

	public List<Sede> findByDireccion(Object direccion,
			int... rowStartIdxAndCount);

	public List<Sede> findByFoto(Object foto, int... rowStartIdxAndCount);

	/**
	 * Find all Sede entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Sede> all Sede entities
	 */
	public List<Sede> findAll(int... rowStartIdxAndCount);
}