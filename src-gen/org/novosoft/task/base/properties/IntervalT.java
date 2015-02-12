package org.novosoft.task.base.properties;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.novosoft.task.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>IntervalT</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "properties_IntervalT")
public class IntervalT extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long lower_bound = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long upper_bound = 0;

	/**
	 * Returns the value of '<em><b>lower_bound</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>lower_bound</b></em>' feature
	 * @generated
	 */
	public long getLower_bound() {
		return lower_bound;
	}

	/**
	 * Sets the '{@link IntervalT#getLower_bound() <em>lower_bound</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLower_bound
	 *            the new value of the '{@link IntervalT#getLower_bound()
	 *            lower_bound}' feature.
	 * @generated
	 */
	public void setLower_bound(long newLower_bound) {
		lower_bound = newLower_bound;
	}

	/**
	 * Returns the value of '<em><b>upper_bound</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>upper_bound</b></em>' feature
	 * @generated
	 */
	public long getUpper_bound() {
		return upper_bound;
	}

	/**
	 * Sets the '{@link IntervalT#getUpper_bound() <em>upper_bound</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newUpper_bound
	 *            the new value of the '{@link IntervalT#getUpper_bound()
	 *            upper_bound}' feature.
	 * @generated
	 */
	public void setUpper_bound(long newUpper_bound) {
		upper_bound = newUpper_bound;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "IntervalT " + " [lower_bound: " + getLower_bound() + "]"
				+ " [upper_bound: " + getUpper_bound() + "]";
	}
}
