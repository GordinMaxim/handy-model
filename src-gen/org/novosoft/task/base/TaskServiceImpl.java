package org.novosoft.task.base;

import java.util.HashMap;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.eclipse.emf.texo.server.service.ServiceModelPackageRegistry;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.jpa.PersistenceProvider;
import org.novosoft.task.base.dao.TaskDao;

/**
 * generated web service
 * 
 * @generated
 */

@WebService(endpointInterface = "org.novosoft.task.base.TaskService", serviceName = "TaskService")
public class TaskServiceImpl implements TaskService {

	/**
	 * @generated
	 */
	final private TaskDao taskDao;
	final private EntityManager entityManager;

	public TaskServiceImpl() {

		ServiceModelPackageRegistry.getInstance().register(
				TaskModelPackage.INSTANCE);
		EntityManagerFactory entityManagerFactory;
		String persistenceUnit = "library-hsqldb";
		final HashMap<String, Object> properties = new HashMap<String, Object>();
		final ClassLoader classLoader = TaskModelPackage.class.getClassLoader();
		properties.put(PersistenceUnitProperties.CLASSLOADER, classLoader);
		properties.put(PersistenceUnitProperties.ECLIPSELINK_PERSISTENCE_XML,
				"META-INF/persistence.xml"); //$NON-NLS-1$
		entityManagerFactory = new PersistenceProvider()
				.createEntityManagerFactory(persistenceUnit, properties);
		EntityManagerProvider.getInstance().setEntityManagerFactory(
				entityManagerFactory);
		entityManager = EntityManagerProvider.getInstance()
				.getCurrentEntityManager();
		taskDao = DaoRegistry.getInstance().getDao(TaskDao.class);
		taskDao.setEntityManager(entityManager);
		// Thread thread = new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// org.hsqldb.util.DatabaseManagerSwing.main(new String[] {
		// "--url", "jdbc:hsqldb:mem:library", "--noexit"
		// });
		// }});
		// thread.start();
		// org.hsqldb.util.DatabaseManager.main(new String[] {
		// "--url", "jdbc:hsqldb:hsql://localhost/library", "--noexit"
		// });
	}

	/**
	 * @generated
	 */
	public List<Task> getAll() {
		System.out.println("[web service call] getAll");
		return taskDao.getAll();
	}

	/**
	 * @generated
	 */
	public int countAll() {
		System.out.println("[web service call] countAll");
		return taskDao.countAll();
	}

	/**
	 * @generated
	 */
	public List<Task> findBy(@WebParam(name = "property") String property,
			@WebParam(name = "value") Object value) {
		System.out.println("[web service call] findBy");
		return taskDao.findBy(property, value);
	}

	/**
	 * @generated
	 */
	public Task get(@WebParam(name = "id") Object id) {
		System.out.println("[web service call] get");
		Task task = taskDao.get(id);
		if (null == task) {
			task = new Task();
		}
		return task;
	}

	/**
	 * @generated
	 */
	public void insert(@WebParam(name = "task") Task task) {
		System.out.println("[web service call] insert");
		taskDao.insert(task);
	}

	/**
	 * @generated
	 */
	public void remove(@WebParam(name = "task") Task task) {
		System.out.println("[web service call] remove");
		task = taskDao.getEntityManager().getReference(taskDao.getEntityClass(), task.getTaskID());
		taskDao.remove(task);
	}

	/**
	 * @generated
	 */
	public void removeList(@WebParam(name = "tasks") List<Task> tasks) {
		System.out.println("[web service call] removeList");
		taskDao.remove(tasks);
	}

	/**
	 * @generated
	 */
	public void refresh(@WebParam(name = "tasks") Task task) {
		System.out.println("[web service call] refresh");
		taskDao.refresh(task);
	}

	/**
	 * @generated
	 */
	public void update(@WebParam(name = "tasks") Task task) {
		System.out.println("[web service call] update");
		taskDao.update(task);
	}
	
	public List<String> getAllUserTaskIDs(/*Object uid*/) {
		EntityManager em = taskDao.getEntityManager();
	    final CriteriaBuilder builder = em.getCriteriaBuilder();
	    final CriteriaQuery<String> criteria = builder.createQuery(String.class);
	    final Root<Task> root = criteria.from(Task.class);
	    criteria.select(builder.construct(String.class, root.get("fileName")));
	    return em.createQuery(criteria).getResultList();
	}
}
