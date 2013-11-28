package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.ProgramacionEvento;

/**
 * Interface for ProgramacionEventoDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IProgramacionEventoDAO {
	/**
	 * Perform an initial save of a previously unsaved ProgramacionEvento
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IProgramacionEventoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            ProgramacionEvento entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(ProgramacionEvento entity);

	/**
	 * Delete a persistent ProgramacionEvento entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IProgramacionEventoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            ProgramacionEvento entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(ProgramacionEvento entity);

	/**
	 * Persist a previously saved ProgramacionEvento entity and return it or a
	 * copy of it to the sender. A copy of the ProgramacionEvento entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IProgramacionEventoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            ProgramacionEvento entity to update
	 * @return ProgramacionEvento the persisted ProgramacionEvento entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public ProgramacionEvento update(ProgramacionEvento entity);

	public ProgramacionEvento findById(Integer id);

	/**
	 * Find all ProgramacionEvento entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the ProgramacionEvento property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<ProgramacionEvento> found by query
	 */
	public List<ProgramacionEvento> findByProperty(String propertyName,
			Object value, int... rowStartIdxAndCount);

	public List<ProgramacionEvento> findByLugarFisico(Object lugarFisico,
			int... rowStartIdxAndCount);

	/**
	 * Find all ProgramacionEvento entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<ProgramacionEvento> all ProgramacionEvento entities
	 */
	public List<ProgramacionEvento> findAll(int... rowStartIdxAndCount);
}