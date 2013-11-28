package co.edu.uniminuto.arqsoft.daos;

import java.util.List;

import co.edu.uniminuto.arqsoft.gymsoft.entities.Rutina;

/**
 * Interface for RutinaDAO.
 * @author MyEclipse Persistence Tools
 */

public interface IRutinaDAO {
		/**
	 Perform an initial save of a previously unsaved Rutina entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   IRutinaDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Rutina entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(Rutina entity);
    /**
	 Delete a persistent Rutina entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   IRutinaDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity Rutina entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(Rutina entity);
   /**
	 Persist a previously saved Rutina entity and return it or a copy of it to the sender. 
	 A copy of the Rutina entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = IRutinaDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Rutina entity to update
	 @return Rutina the persisted Rutina entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public Rutina update(Rutina entity);
	public Rutina findById( Integer id);
	 /**
	 * Find all Rutina entities with a specific property value.  
	 
	  @param propertyName the name of the Rutina property to query
	  @param value the property value to match
	  	  @param rowStartIdxAndCount Optional int varargs. rowStartIdxAndCount[0] specifies the  the row index in the query result-set to begin collecting the results. rowStartIdxAndCount[1] specifies the the maximum count of results to return.  
	  	  @return List<Rutina> found by query
	 */
	public List<Rutina> findByProperty(String propertyName, Object value
			, int...rowStartIdxAndCount
		);
	public List<Rutina> findByDescripcion(Object descripcion
			, int...rowStartIdxAndCount
		);
	public List<Rutina> findByDuracion(Object duracion
			, int...rowStartIdxAndCount
		);
	public List<Rutina> findByRegularidad(Object regularidad
			, int...rowStartIdxAndCount
		);
	public List<Rutina> findBySeries(Object series
			, int...rowStartIdxAndCount
		);
	/**
	 * Find all Rutina entities.
	  	  @param rowStartIdxAndCount Optional int varargs. rowStartIdxAndCount[0] specifies the  the row index in the query result-set to begin collecting the results. rowStartIdxAndCount[1] specifies the the maximum count of results to return.  
	  	  @return List<Rutina> all Rutina entities
	 */
	public List<Rutina> findAll(
			int...rowStartIdxAndCount
		);	
}