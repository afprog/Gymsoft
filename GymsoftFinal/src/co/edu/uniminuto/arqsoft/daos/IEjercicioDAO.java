package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.Ejercicio;

/**
 * Interface for EjercicioDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IEjercicioDAO {
	/**
	 * Perform an initial save of a previously unsaved Ejercicio entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IEjercicioDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Ejercicio entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Ejercicio entity);

	/**
	 * Delete a persistent Ejercicio entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IEjercicioDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Ejercicio entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Ejercicio entity);

	/**
	 * Persist a previously saved Ejercicio entity and return it or a copy of it
	 * to the sender. A copy of the Ejercicio entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IEjercicioDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Ejercicio entity to update
	 * @return Ejercicio the persisted Ejercicio entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Ejercicio update(Ejercicio entity);

	public Ejercicio findById(Integer id);

	/**
	 * Find all Ejercicio entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Ejercicio property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Ejercicio> found by query
	 */
	public List<Ejercicio> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Ejercicio> findByDescripcion(Object descripcion,
			int... rowStartIdxAndCount);

	public List<Ejercicio> findByExplicacion(Object explicacion,
			int... rowStartIdxAndCount);

	/**
	 * Find all Ejercicio entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Ejercicio> all Ejercicio entities
	 */
	public List<Ejercicio> findAll(int... rowStartIdxAndCount);
}