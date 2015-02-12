package org.novosoft.task.base.properties;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import org.novosoft.task.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>OperationProperties</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "properties_OperationProperties")
public class OperationProperties extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private CopyMode copyMode = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private CopyDirection copyDirection = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private DiffCondition diffCondition = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private StopCondition stopCondition = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean checkFileSize = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean checkCreationTime = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean checkModificationTime = false;

	/**
	 * Returns the value of '<em><b>copyMode</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>copyMode</b></em>' feature
	 * @generated
	 */
	public CopyMode getCopyMode() {
		return copyMode;
	}

	/**
	 * Sets the '{@link OperationProperties#getCopyMode() <em>copyMode</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCopyMode
	 *            the new value of the '
	 *            {@link OperationProperties#getCopyMode() copyMode}' feature.
	 * @generated
	 */
	public void setCopyMode(CopyMode newCopyMode) {
		copyMode = newCopyMode;
	}

	/**
	 * Returns the value of '<em><b>copyDirection</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>copyDirection</b></em>' feature
	 * @generated
	 */
	public CopyDirection getCopyDirection() {
		return copyDirection;
	}

	/**
	 * Sets the '{@link OperationProperties#getCopyDirection()
	 * <em>copyDirection</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCopyDirection
	 *            the new value of the '
	 *            {@link OperationProperties#getCopyDirection() copyDirection}'
	 *            feature.
	 * @generated
	 */
	public void setCopyDirection(CopyDirection newCopyDirection) {
		copyDirection = newCopyDirection;
	}

	/**
	 * Returns the value of '<em><b>diffCondition</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>diffCondition</b></em>' feature
	 * @generated
	 */
	public DiffCondition getDiffCondition() {
		return diffCondition;
	}

	/**
	 * Sets the '{@link OperationProperties#getDiffCondition()
	 * <em>diffCondition</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDiffCondition
	 *            the new value of the '
	 *            {@link OperationProperties#getDiffCondition() diffCondition}'
	 *            feature.
	 * @generated
	 */
	public void setDiffCondition(DiffCondition newDiffCondition) {
		diffCondition = newDiffCondition;
	}

	/**
	 * Returns the value of '<em><b>stopCondition</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>stopCondition</b></em>' feature
	 * @generated
	 */
	public StopCondition getStopCondition() {
		return stopCondition;
	}

	/**
	 * Sets the '{@link OperationProperties#getStopCondition()
	 * <em>stopCondition</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newStopCondition
	 *            the new value of the '
	 *            {@link OperationProperties#getStopCondition() stopCondition}'
	 *            feature.
	 * @generated
	 */
	public void setStopCondition(StopCondition newStopCondition) {
		stopCondition = newStopCondition;
	}

	/**
	 * Returns the value of '<em><b>checkFileSize</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>checkFileSize</b></em>' feature
	 * @generated
	 */
	public boolean isCheckFileSize() {
		return checkFileSize;
	}

	/**
	 * Sets the '{@link OperationProperties#isCheckFileSize()
	 * <em>checkFileSize</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCheckFileSize
	 *            the new value of the '
	 *            {@link OperationProperties#isCheckFileSize() checkFileSize}'
	 *            feature.
	 * @generated
	 */
	public void setCheckFileSize(boolean newCheckFileSize) {
		checkFileSize = newCheckFileSize;
	}

	/**
	 * Returns the value of '<em><b>checkCreationTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>checkCreationTime</b></em>' feature
	 * @generated
	 */
	public boolean isCheckCreationTime() {
		return checkCreationTime;
	}

	/**
	 * Sets the '{@link OperationProperties#isCheckCreationTime()
	 * <em>checkCreationTime</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCheckCreationTime
	 *            the new value of the '
	 *            {@link OperationProperties#isCheckCreationTime()
	 *            checkCreationTime}' feature.
	 * @generated
	 */
	public void setCheckCreationTime(boolean newCheckCreationTime) {
		checkCreationTime = newCheckCreationTime;
	}

	/**
	 * Returns the value of '<em><b>checkModificationTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>checkModificationTime</b></em>' feature
	 * @generated
	 */
	public boolean isCheckModificationTime() {
		return checkModificationTime;
	}

	/**
	 * Sets the '{@link OperationProperties#isCheckModificationTime()
	 * <em>checkModificationTime</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCheckModificationTime
	 *            the new value of the '
	 *            {@link OperationProperties#isCheckModificationTime()
	 *            checkModificationTime}' feature.
	 * @generated
	 */
	public void setCheckModificationTime(boolean newCheckModificationTime) {
		checkModificationTime = newCheckModificationTime;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "OperationProperties " + " [copyMode: " + getCopyMode() + "]"
				+ " [copyDirection: " + getCopyDirection() + "]"
				+ " [diffCondition: " + getDiffCondition() + "]"
				+ " [stopCondition: " + getStopCondition() + "]"
				+ " [checkFileSize: " + isCheckFileSize() + "]"
				+ " [checkCreationTime: " + isCheckCreationTime() + "]"
				+ " [checkModificationTime: " + isCheckModificationTime() + "]";
	}
}
