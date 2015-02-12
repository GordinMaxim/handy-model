package org.novosoft.task.base.properties;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import org.novosoft.task.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>CustomAction</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "properties_CustomAction")
public class CustomAction extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private ActionType type = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean wait = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private ActionRunTime event = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String params = null;

	/**
	 * Returns the value of '<em><b>type</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>type</b></em>' feature
	 * @generated
	 */
	public ActionType getType() {
		return type;
	}

	/**
	 * Sets the '{@link CustomAction#getType() <em>type</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newType
	 *            the new value of the '{@link CustomAction#getType() type}'
	 *            feature.
	 * @generated
	 */
	public void setType(ActionType newType) {
		type = newType;
	}

	/**
	 * Returns the value of '<em><b>wait</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>wait</b></em>' feature
	 * @generated
	 */
	public boolean isWait() {
		return wait;
	}

	/**
	 * Sets the '{@link CustomAction#isWait() <em>wait</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newWait
	 *            the new value of the '{@link CustomAction#isWait() wait}'
	 *            feature.
	 * @generated
	 */
	public void setWait(boolean newWait) {
		wait = newWait;
	}

	/**
	 * Returns the value of '<em><b>event</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>event</b></em>' feature
	 * @generated
	 */
	public ActionRunTime getEvent() {
		return event;
	}

	/**
	 * Sets the '{@link CustomAction#getEvent() <em>event</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newEvent
	 *            the new value of the '{@link CustomAction#getEvent() event}'
	 *            feature.
	 * @generated
	 */
	public void setEvent(ActionRunTime newEvent) {
		event = newEvent;
	}

	/**
	 * Returns the value of '<em><b>params</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>params</b></em>' feature
	 * @generated
	 */
	public String getParams() {
		return params;
	}

	/**
	 * Sets the '{@link CustomAction#getParams() <em>params</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newParams
	 *            the new value of the '{@link CustomAction#getParams() params}'
	 *            feature.
	 * @generated
	 */
	public void setParams(String newParams) {
		params = newParams;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "CustomAction " + " [type: " + getType() + "]" + " [wait: "
				+ isWait() + "]" + " [event: " + getEvent() + "]"
				+ " [params: " + getParams() + "]";
	}
}
