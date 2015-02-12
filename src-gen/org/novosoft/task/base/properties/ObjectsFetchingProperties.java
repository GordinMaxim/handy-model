package org.novosoft.task.base.properties;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.novosoft.task.base.identifiable.Identifiable;

/**
 * A representation of the model object '
 * <em><b>ObjectsFetchingProperties</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "properties_ObjectsFetchingProperties")
public class ObjectsFetchingProperties extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private ObjectsFetchingProperties filesExclude = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private ObjectsFetchingProperties filesInclude = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> foldersExcludeMasks = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> foldersIncludeMasks = new ArrayList<String>();

	/**
	 * Returns the value of '<em><b>filesExclude</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>filesExclude</b></em>' feature
	 * @generated
	 */
	public ObjectsFetchingProperties getFilesExclude() {
		return filesExclude;
	}

	/**
	 * Sets the '{@link ObjectsFetchingProperties#getFilesExclude()
	 * <em>filesExclude</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFilesExclude
	 *            the new value of the '
	 *            {@link ObjectsFetchingProperties#getFilesExclude()
	 *            filesExclude}' feature.
	 * @generated
	 */
	public void setFilesExclude(ObjectsFetchingProperties newFilesExclude) {
		filesExclude = newFilesExclude;
	}

	/**
	 * Returns the value of '<em><b>filesInclude</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>filesInclude</b></em>' feature
	 * @generated
	 */
	public ObjectsFetchingProperties getFilesInclude() {
		return filesInclude;
	}

	/**
	 * Sets the '{@link ObjectsFetchingProperties#getFilesInclude()
	 * <em>filesInclude</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFilesInclude
	 *            the new value of the '
	 *            {@link ObjectsFetchingProperties#getFilesInclude()
	 *            filesInclude}' feature.
	 * @generated
	 */
	public void setFilesInclude(ObjectsFetchingProperties newFilesInclude) {
		filesInclude = newFilesInclude;
	}

	/**
	 * Returns the value of '<em><b>foldersExcludeMasks</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>foldersExcludeMasks</b></em>' feature
	 * @generated
	 */
	public List<String> getFoldersExcludeMasks() {
		return foldersExcludeMasks;
	}

	/**
	 * Sets the '{@link ObjectsFetchingProperties#getFoldersExcludeMasks()
	 * <em>foldersExcludeMasks</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFoldersExcludeMasks
	 *            the new value of the '
	 *            {@link ObjectsFetchingProperties#getFoldersExcludeMasks()
	 *            foldersExcludeMasks}' feature.
	 * @generated
	 */
	public void setFoldersExcludeMasks(List<String> newFoldersExcludeMasks) {
		foldersExcludeMasks = newFoldersExcludeMasks;
	}

	/**
	 * Returns the value of '<em><b>foldersIncludeMasks</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>foldersIncludeMasks</b></em>' feature
	 * @generated
	 */
	public List<String> getFoldersIncludeMasks() {
		return foldersIncludeMasks;
	}

	/**
	 * Sets the '{@link ObjectsFetchingProperties#getFoldersIncludeMasks()
	 * <em>foldersIncludeMasks</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFoldersIncludeMasks
	 *            the new value of the '
	 *            {@link ObjectsFetchingProperties#getFoldersIncludeMasks()
	 *            foldersIncludeMasks}' feature.
	 * @generated
	 */
	public void setFoldersIncludeMasks(List<String> newFoldersIncludeMasks) {
		foldersIncludeMasks = newFoldersIncludeMasks;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ObjectsFetchingProperties ";
	}
}
