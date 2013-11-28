package co.edu.uniminuto.arqsoft.daos;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.uniminuto.arqsoft.gymsoft.entities.ProgramacionEvento;

/**
 * A data access object (DAO) providing persistence and search support for
 * ProgramacionEvento entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see co.edu.uniminuto.arqsoft.daos.ProgramacionEvento
 * @author MyEclipse Persistence Tools
 */
public class ProgramacionEventoDAO implements IProgramacionEventoDAO {
	// property constants
	public static final String LUGAR_FISICO = "lugarFisico";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

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
	 * ProgramacionEventoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            ProgramacionEvento entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(ProgramacionEvento entity) {
		EntityManagerHelper.log("saving ProgramacionEvento instance",
				Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

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
	 * ProgramacionEventoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            ProgramacionEvento entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(ProgramacionEvento entity) {
		EntityManagerHelper.log("deleting ProgramacionEvento instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(ProgramacionEvento.class,
					entity.getIdProgramacion_Evento());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

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
	 * entity = ProgramacionEventoDAO.update(entity);
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
	public ProgramacionEvento update(ProgramacionEvento entity) {
		EntityManagerHelper.log("updating ProgramacionEvento instance",
				Level.INFO, null);
		try {
			ProgramacionEvento result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public ProgramacionEvento findById(Integer id) {
		EntityManagerHelper.log("finding ProgramacionEvento instance with id: "
				+ id, Level.INFO, null);
		try {
			ProgramacionEvento instance = getEntityManager().find(
					ProgramacionEvento.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

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
	 *            number of results to return.
	 * @return List<ProgramacionEvento> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<ProgramacionEvento> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding ProgramacionEvento instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from ProgramacionEvento model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}

	public List<ProgramacionEvento> findByLugarFisico(Object lugarFisico,
			int... rowStartIdxAndCount) {
		return findByProperty(LUGAR_FISICO, lugarFisico, rowStartIdxAndCount);
	}

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
	@SuppressWarnings("unchecked")
	public List<ProgramacionEvento> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all ProgramacionEvento instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from ProgramacionEvento model";
			Query query = getEntityManager().createQuery(queryString);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}