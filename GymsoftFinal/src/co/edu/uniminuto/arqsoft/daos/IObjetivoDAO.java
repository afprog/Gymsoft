package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.Objetivo;

/**
 * Interface for ObjetivoDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IObjetivoDAO {
	/**
	 * Perform an initial save of a previously unsaved Objetivo entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IObjetivoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Objetivo entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Objetivo entity);

	/**
	 * Delete a persistent Objetivo entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IObjetivoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Objetivo entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Objetivo entity);

	/**
	 * Persist a previously saved Objetivo entity and return it or a copy of it
	 * to the sender. A copy of the Objetivo entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IObjetivoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Objetivo entity to update
	 * @return Objetivo the persisted Objetivo entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Objetivo update(Objetivo entity);

	public Objetivo findById(Integer id);

	/**
	 * Find all Objetivo entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Objetivo property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Objetivo> found by query
	 */
	public List<Objetivo> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Objetivo> findByDescripcion(Object descripcion,
			int... rowStartIdxAndCount);

	/**
	 * Find all Objetivo entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Objetivo> all Objetivo entities
	 */
	public List<Objetivo> findAll(int... rowStartIdxAndCount);
}