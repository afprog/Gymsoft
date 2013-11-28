package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.Maquina;

/**
 * Interface for MaquinaDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IMaquinaDAO {
	/**
	 * Perform an initial save of a previously unsaved Maquina entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IMaquinaDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Maquina entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Maquina entity);

	/**
	 * Delete a persistent Maquina entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IMaquinaDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Maquina entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Maquina entity);

	/**
	 * Persist a previously saved Maquina entity and return it or a copy of it
	 * to the sender. A copy of the Maquina entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IMaquinaDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Maquina entity to update
	 * @return Maquina the persisted Maquina entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Maquina update(Maquina entity);

	public Maquina findById(Integer id);

	/**
	 * Find all Maquina entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Maquina property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Maquina> found by query
	 */
	public List<Maquina> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Maquina> findByNombre(Object nombre, int... rowStartIdxAndCount);

	/**
	 * Find all Maquina entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Maquina> all Maquina entities
	 */
	public List<Maquina> findAll(int... rowStartIdxAndCount);
}