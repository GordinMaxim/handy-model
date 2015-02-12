package org.novosoft.task.base;

import java.util.HashMap;
import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.eclipse.emf.texo.server.service.ServiceModelPackageRegistry;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.jpa.PersistenceProvider;
import org.novosoft.task.base.dao.TaskDao;
import org.novosoft.task.base.properties.Log;
import org.novosoft.task.base.properties.TaskProperties;

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

	}

	/**
	 * @generated
	 */
	public List<Task> getAll() {
		return taskDao.getAll();
	}

	/**
	 * @generated
	 */
	public int countAll() {
		return taskDao.countAll();
	}

	/**
	 * @generated
	 */
	public List<Task> findBy(@WebParam(name = "property") String property,
			@WebParam(name = "value") Object value) {
		return taskDao.findBy(property, value);
	}

	/**
	 * @generated
	 */
	public Task get(@WebParam(name = "id") Object id) {
		return taskDao.get(id);
	}

	/**
	 * @generated
	 */
	public void insert(@WebParam(name = "task") Task task) {
		taskDao.insert(task);
	}

	/**
	 * @generated
	 */
	public void remove(@WebParam(name = "task") Task task) {
		taskDao.remove(task);
	}

	/**
	 * @generated
	 */
	public void removeList(@WebParam(name = "tasks") List<Task> tasks) {
		taskDao.remove(tasks);
	}

	/**
	 * @generated
	 */
	public void refresh(@WebParam(name = "tasks") Task task) {
		taskDao.refresh(task);
	}

	/**
	 * @generated
	 */
	public void update(@WebParam(name = "tasks") Task task) {
		taskDao.update(task);
	}

	/**
	 * @generated
	 */
	public void updateTaskXML(@WebParam(name = "taskXML") String taskXML,
			@WebParam(name = "id") Object id) {
		Task task = taskDao.get(id);
		task.setTaskXML(taskXML);
		taskDao.update(task);
	}

	/**
	 * @generated
	 */
	public void updateProps(@WebParam(name = "props") TaskProperties props,
			@WebParam(name = "id") Object id) {
		Task task = taskDao.get(id);
		task.setProps(props);
		taskDao.update(task);
	}

	/**
	 * @generated
	 */
	public void updateLog(@WebParam(name = "log") Log log,
			@WebParam(name = "id") Object id) {
		Task task = taskDao.get(id);
		task.setLog(log);
		taskDao.update(task);
	}

	/**
	 * @generated
	 */
	public void updateFname(@WebParam(name = "fname") String fname,
			@WebParam(name = "id") Object id) {
		Task task = taskDao.get(id);
		task.setFname(fname);
		taskDao.update(task);
	}

}
