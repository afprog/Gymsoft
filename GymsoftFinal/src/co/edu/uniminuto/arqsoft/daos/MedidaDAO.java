package co.edu.uniminuto.arqsoft.daos;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.uniminuto.arqsoft.gymsoft.entities.Medida;

/**
 * A data access object (DAO) providing persistence and search support for
 * Medida entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see co.edu.uniminuto.arqsoft.daos.Medida
 * @author MyEclipse Persistence Tools
 */
public class MedidaDAO implements IMedidaDAO {
	// property constants
	public static final String PESO = "peso";
	public static final String PRESION_SANGUINEA = "presionSanguinea";
	public static final String RITMO_CARDIACO = "ritmoCardiaco";
	public static final String CINTURA = "cintura";
	public static final String PIERNAS = "piernas";
	public static final String BRAZOS = "brazos";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved Medida entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * MedidaDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Medida entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Medida entity) {
		EntityManagerHelper.log("saving Medida instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Medida entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * MedidaDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Medida entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Medida entity) {
		EntityManagerHelper.log("deleting Medida instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(Medida.class,
					entity.getIdMedida());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Medida entity and return it or a copy of it to
	 * the sender. A copy of the Medida entity parameter is returned when the
	 * JPA persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = MedidaDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Medida entity to update
	 * @return Medida the persisted Medida entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Medida update(Medida entity) {
		EntityManagerHelper.log("updating Medida instance", Level.INFO, null);
		try {
			Medida result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Medida findById(Integer id) {
		EntityManagerHelper.log("finding Medida instance with id: " + id,
				Level.INFO, null);
		try {
			Medida instance = getEntityManager().find(Medida.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Medida entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Medida property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<Medida> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Medida> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding Medida instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Medida model where model."
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

	public List<Medida> findByPeso(Object peso, int... rowStartIdxAndCount) {
		return findByProperty(PESO, peso, rowStartIdxAndCount);
	}

	public List<Medida> findByPresionSanguinea(Object presionSanguinea,
			int... rowStartIdxAndCount) {
		return findByProperty(PRESION_SANGUINEA, presionSanguinea,
				rowStartIdxAndCount);
	}

	public List<Medida> findByRitmoCardiaco(Object ritmoCardiaco,
			int... rowStartIdxAndCount) {
		return findByProperty(RITMO_CARDIACO, ritmoCardiaco,
				rowStartIdxAndCount);
	}

	public List<Medida> findByCintura(Object cintura,
			int... rowStartIdxAndCount) {
		return findByProperty(CINTURA, cintura, rowStartIdxAndCount);
	}

	public List<Medida> findByPiernas(Object piernas,
			int... rowStartIdxAndCount) {
		return findByProperty(PIERNAS, piernas, rowStartIdxAndCount);
	}

	public List<Medida> findByBrazos(Object brazos, int... rowStartIdxAndCount) {
		return findByProperty(BRAZOS, brazos, rowStartIdxAndCount);
	}

	/**
	 * Find all Medida entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Medida> all Medida entities
	 */
	@SuppressWarnings("unchecked")
	public List<Medida> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all Medida instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from Medida model";
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