package co.edu.uniminuto.arqsoft.daos;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.uniminuto.arqsoft.gymsoft.entities.HistoricoMaquina;

/**
 * A data access object (DAO) providing persistence and search support for
 * HistoricoMaquina entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see co.edu.uniminuto.arqsoft.daos.HistoricoMaquina
 * @author MyEclipse Persistence Tools
 */
public class HistoricoMaquinaDAO implements IHistoricoMaquinaDAO {
	// property constants
	public static final String TIEMPO = "tiempo";
	public static final String VELOCIDAD = "velocidad";
	public static final String RITMO_CARDIACO = "ritmoCardiaco";
	public static final String CALORIAS = "calorias";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved HistoricoMaquina entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * HistoricoMaquinaDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            HistoricoMaquina entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(HistoricoMaquina entity) {
		EntityManagerHelper.log("saving HistoricoMaquina instance", Level.INFO,
				null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent HistoricoMaquina entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * HistoricoMaquinaDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            HistoricoMaquina entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(HistoricoMaquina entity) {
		EntityManagerHelper.log("deleting HistoricoMaquina instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(HistoricoMaquina.class,
					entity.getIdHistorico_Maquina());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved HistoricoMaquina entity and return it or a
	 * copy of it to the sender. A copy of the HistoricoMaquina entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = HistoricoMaquinaDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            HistoricoMaquina entity to update
	 * @return HistoricoMaquina the persisted HistoricoMaquina entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public HistoricoMaquina update(HistoricoMaquina entity) {
		EntityManagerHelper.log("updating HistoricoMaquina instance",
				Level.INFO, null);
		try {
			HistoricoMaquina result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public HistoricoMaquina findById(Integer id) {
		EntityManagerHelper.log("finding HistoricoMaquina instance with id: "
				+ id, Level.INFO, null);
		try {
			HistoricoMaquina instance = getEntityManager().find(
					HistoricoMaquina.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all HistoricoMaquina entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the HistoricoMaquina property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<HistoricoMaquina> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<HistoricoMaquina> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding HistoricoMaquina instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from HistoricoMaquina model where model."
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

	public List<HistoricoMaquina> findByTiempo(Object tiempo,
			int... rowStartIdxAndCount) {
		return findByProperty(TIEMPO, tiempo, rowStartIdxAndCount);
	}

	public List<HistoricoMaquina> findByVelocidad(Object velocidad,
			int... rowStartIdxAndCount) {
		return findByProperty(VELOCIDAD, velocidad, rowStartIdxAndCount);
	}

	public List<HistoricoMaquina> findByRitmoCardiaco(Object ritmoCardiaco,
			int... rowStartIdxAndCount) {
		return findByProperty(RITMO_CARDIACO, ritmoCardiaco,
				rowStartIdxAndCount);
	}

	public List<HistoricoMaquina> findByCalorias(Object calorias,
			int... rowStartIdxAndCount) {
		return findByProperty(CALORIAS, calorias, rowStartIdxAndCount);
	}

	/**
	 * Find all HistoricoMaquina entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<HistoricoMaquina> all HistoricoMaquina entities
	 */
	@SuppressWarnings("unchecked")
	public List<HistoricoMaquina> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all HistoricoMaquina instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from HistoricoMaquina model";
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