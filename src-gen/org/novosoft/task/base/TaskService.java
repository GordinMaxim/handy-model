package org.novosoft.task.base;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
 * generated web service
 * 
 * @generated
 */

@WebService(targetNamespace = "http://www.novosoft.org/LinkStorageService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public interface TaskService {

	/**
	 * @generated
	 */
	public List<Task> getAll();

	/**
	 * @generated
	 */
	public int countAll();

	/**
	 * @generated
	 */
	public List<Task> findBy(String property, Object value);

	/**
	 * @generated
	 */
	public Task get(@WebParam(name = "id") Object id);

	/**
	 * @generated
	 */
	public void insert(@WebParam(name = "task") Task task);

	/**
	 * @generated
	 */
	public void remove(@WebParam(name = "task") Task task);

	/**
	 * @generated
	 */
	public void removeList(@WebParam(name = "tasks") List<Task> tasks);

	/**
	 * @generated
	 */
	public void refresh(@WebParam(name = "tasks") Task task);

	/**
	 * @generated
	 */
	public void update(@WebParam(name = "tasks") Task task);
	
	public List<String> getAllUserTaskIDs(/*Object uid*/);
}
