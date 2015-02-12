package org.novosoft.task.base.properties;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.novosoft.task.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>FileFilterProperties</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "properties_FileFilterProperties")
public class FileFilterProperties extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long attributes = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> masks = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private IntervalT creation = null;

	/**
	 * Returns the value of '<em><b>attributes</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>attributes</b></em>' feature
	 * @generated
	 */
	public long getAttributes() {
		return attributes;
	}

	/**
	 * Sets the '{@link FileFilterProperties#getAttributes()
	 * <em>attributes</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAttributes
	 *            the new value of the '
	 *            {@link FileFilterProperties#getAttributes() attributes}'
	 *            feature.
	 * @generated
	 */
	public void setAttributes(long newAttributes) {
		attributes = newAttributes;
	}

	/**
	 * Returns the value of '<em><b>masks</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>masks</b></em>' feature
	 * @generated
	 */
	public List<String> getMasks() {
		return masks;
	}

	/**
	 * Sets the '{@link FileFilterProperties#getMasks() <em>masks</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMasks
	 *            the new value of the '{@link FileFilterProperties#getMasks()
	 *            masks}' feature.
	 * @generated
	 */
	public void setMasks(List<String> newMasks) {
		masks = newMasks;
	}

	/**
	 * Returns the value of '<em><b>creation</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>creation</b></em>' feature
	 * @generated
	 */
	public IntervalT getCreation() {
		return creation;
	}

	/**
	 * Sets the '{@link FileFilterProperties#getCreation() <em>creation</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCreation
	 *            the new value of the '
	 *            {@link FileFilterProperties#getCreation() creation}' feature.
	 * @generated
	 */
	public void setCreation(IntervalT newCreation) {
		creation = newCreation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "FileFilterProperties " + " [attributes: " + getAttributes()
				+ "]";
	}
}
