package org.novosoft.task.base;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.novosoft.task.base.identifiable.Identifiable;
import org.novosoft.task.base.properties.Log;
import org.novosoft.task.base.properties.TaskProperties;

/**
 * A representation of the model object '<em><b>Task</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "task_Task")
@Table(name = "task_Task")
@Inheritance(strategy = InheritanceType.JOINED)
public class Task extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(name = "taskXML")
	private String taskXML = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinColumns({ @JoinColumn(name = "task_Task_props") })
	private TaskProperties props = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinColumns({ @JoinColumn(name = "task_Task_log") })
	private Log log = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(name = "fname")
	private String fname = null;

	/**
	 * Returns the value of '<em><b>taskXML</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>taskXML</b></em>' feature
	 * @generated
	 */
	public String getTaskXML() {
		return taskXML;
	}

	/**
	 * Sets the '{@link Task#getTaskXML() <em>taskXML</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTaskXML
	 *            the new value of the '{@link Task#getTaskXML() taskXML}'
	 *            feature.
	 * @generated
	 */
	public void setTaskXML(String newTaskXML) {
		taskXML = newTaskXML;
	}

	/**
	 * Returns the value of '<em><b>props</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>props</b></em>' feature
	 * @generated
	 */
	public TaskProperties getProps() {
		return props;
	}

	/**
	 * Sets the '{@link Task#getProps() <em>props</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProps
	 *            the new value of the '{@link Task#getProps() props}' feature.
	 * @generated
	 */
	public void setProps(TaskProperties newProps) {
		props = newProps;
	}

	/**
	 * Returns the value of '<em><b>log</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>log</b></em>' feature
	 * @generated
	 */
	public Log getLog() {
		return log;
	}

	/**
	 * Sets the '{@link Task#getLog() <em>log</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLog
	 *            the new value of the '{@link Task#getLog() log}' feature.
	 * @generated
	 */
	public void setLog(Log newLog) {
		log = newLog;
	}

	/**
	 * Returns the value of '<em><b>fname</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>fname</b></em>' feature
	 * @generated
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * Sets the '{@link Task#getFname() <em>fname</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFname
	 *            the new value of the '{@link Task#getFname() fname}' feature.
	 * @generated
	 */
	public void setFname(String newFname) {
		fname = newFname;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Task " + " [taskXML: " + getTaskXML() + "]" + " [fname: "
				+ getFname() + "]";
	}
}
