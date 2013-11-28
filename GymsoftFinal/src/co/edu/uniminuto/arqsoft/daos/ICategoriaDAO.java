package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.Categoria;

/**
 * Interface for CategoriaDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ICategoriaDAO {
	/**
	 * Perform an initial save of a previously unsaved Categoria entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ICategoriaDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Categoria entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Categoria entity);

	/**
	 * Delete a persistent Categoria entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ICategoriaDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Categoria entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Categoria entity);

	/**
	 * Persist a previously saved Categoria entity and return it or a copy of it
	 * to the sender. A copy of the Categoria entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ICategoriaDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Categoria entity to update
	 * @return Categoria the persisted Categoria entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Categoria update(Categoria entity);

	public Categoria findById(Integer id);

	/**
	 * Find all Categoria entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Categoria property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Categoria> found by query
	 */
	public List<Categoria> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Categoria> findByDescripcion(Object descripcion,
			int... rowStartIdxAndCount);

	/**
	 * Find all Categoria entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Categoria> all Categoria entities
	 */
	public List<Categoria> findAll(int... rowStartIdxAndCount);
}