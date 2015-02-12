package org.novosoft.task.base.properties;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.novosoft.task.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Log</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "properties_Log")
public class Log extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String filePath = null;

	/**
	 * Returns the value of '<em><b>filePath</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>filePath</b></em>' feature
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Sets the '{@link Log#getFilePath() <em>filePath</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFilePath
	 *            the new value of the '{@link Log#getFilePath() filePath}'
	 *            feature.
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		filePath = newFilePath;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Log " + " [filePath: " + getFilePath() + "]";
	}
}
