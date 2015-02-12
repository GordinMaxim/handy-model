package org.novosoft.task.base.properties;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import org.novosoft.task.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>ScheduleProperties</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "properties_ScheduleProperties")
public class ScheduleProperties extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean isRunMissing = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private ScheduleType type = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long start = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long days = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long period = 0;

	/**
	 * Returns the value of '<em><b>isRunMissing</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>isRunMissing</b></em>' feature
	 * @generated
	 */
	public boolean isIsRunMissing() {
		return isRunMissing;
	}

	/**
	 * Sets the '{@link ScheduleProperties#isIsRunMissing()
	 * <em>isRunMissing</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newIsRunMissing
	 *            the new value of the '
	 *            {@link ScheduleProperties#isIsRunMissing() isRunMissing}'
	 *            feature.
	 * @generated
	 */
	public void setIsRunMissing(boolean newIsRunMissing) {
		isRunMissing = newIsRunMissing;
	}

	/**
	 * Returns the value of '<em><b>type</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>type</b></em>' feature
	 * @generated
	 */
	public ScheduleType getType() {
		return type;
	}

	/**
	 * Sets the '{@link ScheduleProperties#getType() <em>type</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newType
	 *            the new value of the '{@link ScheduleProperties#getType()
	 *            type}' feature.
	 * @generated
	 */
	public void setType(ScheduleType newType) {
		type = newType;
	}

	/**
	 * Returns the value of '<em><b>start</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>start</b></em>' feature
	 * @generated
	 */
	public long getStart() {
		return start;
	}

	/**
	 * Sets the '{@link ScheduleProperties#getStart() <em>start</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newStart
	 *            the new value of the '{@link ScheduleProperties#getStart()
	 *            start}' feature.
	 * @generated
	 */
	public void setStart(long newStart) {
		start = newStart;
	}

	/**
	 * Returns the value of '<em><b>days</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>days</b></em>' feature
	 * @generated
	 */
	public long getDays() {
		return days;
	}

	/**
	 * Sets the '{@link ScheduleProperties#getDays() <em>days</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDays
	 *            the new value of the '{@link ScheduleProperties#getDays()
	 *            days}' feature.
	 * @generated
	 */
	public void setDays(long newDays) {
		days = newDays;
	}

	/**
	 * Returns the value of '<em><b>period</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>period</b></em>' feature
	 * @generated
	 */
	public long getPeriod() {
		return period;
	}

	/**
	 * Sets the '{@link ScheduleProperties#getPeriod() <em>period</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPeriod
	 *            the new value of the '{@link ScheduleProperties#getPeriod()
	 *            period}' feature.
	 * @generated
	 */
	public void setPeriod(long newPeriod) {
		period = newPeriod;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ScheduleProperties " + " [isRunMissing: " + isIsRunMissing()
				+ "]" + " [type: " + getType() + "]" + " [start: " + getStart()
				+ "]" + " [days: " + getDays() + "]" + " [period: "
				+ getPeriod() + "]";
	}
}
