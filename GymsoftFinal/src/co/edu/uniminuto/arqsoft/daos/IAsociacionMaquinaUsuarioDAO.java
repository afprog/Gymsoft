package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.AsociacionMaquinaUsuario;

/**
 * Interface for AsociacionMaquinaUsuarioDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IAsociacionMaquinaUsuarioDAO {
	/**
	 * Perform an initial save of a previously unsaved AsociacionMaquinaUsuario
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAsociacionMaquinaUsuarioDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AsociacionMaquinaUsuario entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AsociacionMaquinaUsuario entity);

	/**
	 * Delete a persistent AsociacionMaquinaUsuario entity. This operation must
	 * be performed within the a database transaction context for the entity's
	 * data to be permanently deleted from the persistence store, i.e.,
	 * database. This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAsociacionMaquinaUsuarioDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AsociacionMaquinaUsuario entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AsociacionMaquinaUsuario entity);

	/**
	 * Persist a previously saved AsociacionMaquinaUsuario entity and return it
	 * or a copy of it to the sender. A copy of the AsociacionMaquinaUsuario
	 * entity parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IAsociacionMaquinaUsuarioDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AsociacionMaquinaUsuario entity to update
	 * @return AsociacionMaquinaUsuario the persisted AsociacionMaquinaUsuario
	 *         entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AsociacionMaquinaUsuario update(AsociacionMaquinaUsuario entity);

	public AsociacionMaquinaUsuario findById(Integer id);

	/**
	 * Find all AsociacionMaquinaUsuario entities with a specific property
	 * value.
	 * 
	 * @param propertyName
	 *            the name of the AsociacionMaquinaUsuario property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<AsociacionMaquinaUsuario> found by query
	 */
	public List<AsociacionMaquinaUsuario> findByProperty(String propertyName,
			Object value, int... rowStartIdxAndCount);

	/**
	 * Find all AsociacionMaquinaUsuario entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<AsociacionMaquinaUsuario> all AsociacionMaquinaUsuario
	 *         entities
	 */
	public List<AsociacionMaquinaUsuario> findAll(int... rowStartIdxAndCount);
}