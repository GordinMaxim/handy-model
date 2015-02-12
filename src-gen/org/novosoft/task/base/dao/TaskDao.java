package org.novosoft.task.base.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.novosoft.task.base.Task;
import org.novosoft.task.base.TaskModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Task</b></em>'.
 *
 * @generated
 */
public class TaskDao extends BaseDao<Task> {

	/**
	 * @generated
	 */
	@Override
	public Class<Task> getEntityClass() {
		return Task.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return TaskModelPackage.INSTANCE.getTaskEClass();
	}
}
