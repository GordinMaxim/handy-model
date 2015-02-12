package org.novosoft.task.base.properties;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import org.novosoft.task.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>TaskProperties</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "properties_TaskProperties")
public class TaskProperties extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String fname = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String dname = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private OperationType type = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long creationTime = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean useInPLC = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long expTheshold = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long expPeriod = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long priority = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> actions = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private ObjectsFetchingProperties fetching = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private OperationProperties operation = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private ScheduleProperties schedule = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> sources = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> targets = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> aliases = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> filters = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> events = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long version = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean versioned = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long maxVersionsCount = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long maxStorageTime = 0;

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
	 * Sets the '{@link TaskProperties#getFname() <em>fname</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFname
	 *            the new value of the '{@link TaskProperties#getFname() fname}'
	 *            feature.
	 * @generated
	 */
	public void setFname(String newFname) {
		fname = newFname;
	}

	/**
	 * Returns the value of '<em><b>dname</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>dname</b></em>' feature
	 * @generated
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * Sets the '{@link TaskProperties#getDname() <em>dname</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDname
	 *            the new value of the '{@link TaskProperties#getDname() dname}'
	 *            feature.
	 * @generated
	 */
	public void setDname(String newDname) {
		dname = newDname;
	}

	/**
	 * Returns the value of '<em><b>type</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>type</b></em>' feature
	 * @generated
	 */
	public OperationType getType() {
		return type;
	}

	/**
	 * Sets the '{@link TaskProperties#getType() <em>type</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newType
	 *            the new value of the '{@link TaskProperties#getType() type}'
	 *            feature.
	 * @generated
	 */
	public void setType(OperationType newType) {
		type = newType;
	}

	/**
	 * Returns the value of '<em><b>creationTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>creationTime</b></em>' feature
	 * @generated
	 */
	public long getCreationTime() {
		return creationTime;
	}

	/**
	 * Sets the '{@link TaskProperties#getCreationTime() <em>creationTime</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCreationTime
	 *            the new value of the '{@link TaskProperties#getCreationTime()
	 *            creationTime}' feature.
	 * @generated
	 */
	public void setCreationTime(long newCreationTime) {
		creationTime = newCreationTime;
	}

	/**
	 * Returns the value of '<em><b>useInPLC</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>useInPLC</b></em>' feature
	 * @generated
	 */
	public boolean isUseInPLC() {
		return useInPLC;
	}

	/**
	 * Sets the '{@link TaskProperties#isUseInPLC() <em>useInPLC</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newUseInPLC
	 *            the new value of the '{@link TaskProperties#isUseInPLC()
	 *            useInPLC}' feature.
	 * @generated
	 */
	public void setUseInPLC(boolean newUseInPLC) {
		useInPLC = newUseInPLC;
	}

	/**
	 * Returns the value of '<em><b>expTheshold</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>expTheshold</b></em>' feature
	 * @generated
	 */
	public long getExpTheshold() {
		return expTheshold;
	}

	/**
	 * Sets the '{@link TaskProperties#getExpTheshold() <em>expTheshold</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newExpTheshold
	 *            the new value of the '{@link TaskProperties#getExpTheshold()
	 *            expTheshold}' feature.
	 * @generated
	 */
	public void setExpTheshold(long newExpTheshold) {
		expTheshold = newExpTheshold;
	}

	/**
	 * Returns the value of '<em><b>expPeriod</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>expPeriod</b></em>' feature
	 * @generated
	 */
	public long getExpPeriod() {
		return expPeriod;
	}

	/**
	 * Sets the '{@link TaskProperties#getExpPeriod() <em>expPeriod</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newExpPeriod
	 *            the new value of the '{@link TaskProperties#getExpPeriod()
	 *            expPeriod}' feature.
	 * @generated
	 */
	public void setExpPeriod(long newExpPeriod) {
		expPeriod = newExpPeriod;
	}

	/**
	 * Returns the value of '<em><b>priority</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>priority</b></em>' feature
	 * @generated
	 */
	public long getPriority() {
		return priority;
	}

	/**
	 * Sets the '{@link TaskProperties#getPriority() <em>priority</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPriority
	 *            the new value of the '{@link TaskProperties#getPriority()
	 *            priority}' feature.
	 * @generated
	 */
	public void setPriority(long newPriority) {
		priority = newPriority;
	}

	/**
	 * Returns the value of '<em><b>actions</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>actions</b></em>' feature
	 * @generated
	 */
	public List<String> getActions() {
		return actions;
	}

	/**
	 * Sets the '{@link TaskProperties#getActions() <em>actions</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newActions
	 *            the new value of the '{@link TaskProperties#getActions()
	 *            actions}' feature.
	 * @generated
	 */
	public void setActions(List<String> newActions) {
		actions = newActions;
	}

	/**
	 * Returns the value of '<em><b>fetching</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>fetching</b></em>' feature
	 * @generated
	 */
	public ObjectsFetchingProperties getFetching() {
		return fetching;
	}

	/**
	 * Sets the '{@link TaskProperties#getFetching() <em>fetching</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFetching
	 *            the new value of the '{@link TaskProperties#getFetching()
	 *            fetching}' feature.
	 * @generated
	 */
	public void setFetching(ObjectsFetchingProperties newFetching) {
		fetching = newFetching;
	}

	/**
	 * Returns the value of '<em><b>operation</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>operation</b></em>' feature
	 * @generated
	 */
	public OperationProperties getOperation() {
		return operation;
	}

	/**
	 * Sets the '{@link TaskProperties#getOperation() <em>operation</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newOperation
	 *            the new value of the '{@link TaskProperties#getOperation()
	 *            operation}' feature.
	 * @generated
	 */
	public void setOperation(OperationProperties newOperation) {
		operation = newOperation;
	}

	/**
	 * Returns the value of '<em><b>schedule</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>schedule</b></em>' feature
	 * @generated
	 */
	public ScheduleProperties getSchedule() {
		return schedule;
	}

	/**
	 * Sets the '{@link TaskProperties#getSchedule() <em>schedule</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSchedule
	 *            the new value of the '{@link TaskProperties#getSchedule()
	 *            schedule}' feature.
	 * @generated
	 */
	public void setSchedule(ScheduleProperties newSchedule) {
		schedule = newSchedule;
	}

	/**
	 * Returns the value of '<em><b>sources</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>sources</b></em>' feature
	 * @generated
	 */
	public List<String> getSources() {
		return sources;
	}

	/**
	 * Sets the '{@link TaskProperties#getSources() <em>sources</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSources
	 *            the new value of the '{@link TaskProperties#getSources()
	 *            sources}' feature.
	 * @generated
	 */
	public void setSources(List<String> newSources) {
		sources = newSources;
	}

	/**
	 * Returns the value of '<em><b>targets</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>targets</b></em>' feature
	 * @generated
	 */
	public List<String> getTargets() {
		return targets;
	}

	/**
	 * Sets the '{@link TaskProperties#getTargets() <em>targets</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTargets
	 *            the new value of the '{@link TaskProperties#getTargets()
	 *            targets}' feature.
	 * @generated
	 */
	public void setTargets(List<String> newTargets) {
		targets = newTargets;
	}

	/**
	 * Returns the value of '<em><b>aliases</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>aliases</b></em>' feature
	 * @generated
	 */
	public List<String> getAliases() {
		return aliases;
	}

	/**
	 * Sets the '{@link TaskProperties#getAliases() <em>aliases</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAliases
	 *            the new value of the '{@link TaskProperties#getAliases()
	 *            aliases}' feature.
	 * @generated
	 */
	public void setAliases(List<String> newAliases) {
		aliases = newAliases;
	}

	/**
	 * Returns the value of '<em><b>filters</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>filters</b></em>' feature
	 * @generated
	 */
	public List<String> getFilters() {
		return filters;
	}

	/**
	 * Sets the '{@link TaskProperties#getFilters() <em>filters</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFilters
	 *            the new value of the '{@link TaskProperties#getFilters()
	 *            filters}' feature.
	 * @generated
	 */
	public void setFilters(List<String> newFilters) {
		filters = newFilters;
	}

	/**
	 * Returns the value of '<em><b>events</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>events</b></em>' feature
	 * @generated
	 */
	public List<String> getEvents() {
		return events;
	}

	/**
	 * Sets the '{@link TaskProperties#getEvents() <em>events</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newEvents
	 *            the new value of the '{@link TaskProperties#getEvents()
	 *            events}' feature.
	 * @generated
	 */
	public void setEvents(List<String> newEvents) {
		events = newEvents;
	}

	/**
	 * Returns the value of '<em><b>version</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>version</b></em>' feature
	 * @generated
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * Sets the '{@link TaskProperties#getVersion() <em>version</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newVersion
	 *            the new value of the '{@link TaskProperties#getVersion()
	 *            version}' feature.
	 * @generated
	 */
	public void setVersion(long newVersion) {
		version = newVersion;
	}

	/**
	 * Returns the value of '<em><b>versioned</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>versioned</b></em>' feature
	 * @generated
	 */
	public boolean isVersioned() {
		return versioned;
	}

	/**
	 * Sets the '{@link TaskProperties#isVersioned() <em>versioned</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newVersioned
	 *            the new value of the '{@link TaskProperties#isVersioned()
	 *            versioned}' feature.
	 * @generated
	 */
	public void setVersioned(boolean newVersioned) {
		versioned = newVersioned;
	}

	/**
	 * Returns the value of '<em><b>maxVersionsCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>maxVersionsCount</b></em>' feature
	 * @generated
	 */
	public long getMaxVersionsCount() {
		return maxVersionsCount;
	}

	/**
	 * Sets the '{@link TaskProperties#getMaxVersionsCount()
	 * <em>maxVersionsCount</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMaxVersionsCount
	 *            the new value of the '
	 *            {@link TaskProperties#getMaxVersionsCount() maxVersionsCount}'
	 *            feature.
	 * @generated
	 */
	public void setMaxVersionsCount(long newMaxVersionsCount) {
		maxVersionsCount = newMaxVersionsCount;
	}

	/**
	 * Returns the value of '<em><b>maxStorageTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>maxStorageTime</b></em>' feature
	 * @generated
	 */
	public long getMaxStorageTime() {
		return maxStorageTime;
	}

	/**
	 * Sets the '{@link TaskProperties#getMaxStorageTime()
	 * <em>maxStorageTime</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMaxStorageTime
	 *            the new value of the '
	 *            {@link TaskProperties#getMaxStorageTime() maxStorageTime}'
	 *            feature.
	 * @generated
	 */
	public void setMaxStorageTime(long newMaxStorageTime) {
		maxStorageTime = newMaxStorageTime;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TaskProperties " + " [fname: " + getFname() + "]" + " [dname: "
				+ getDname() + "]" + " [type: " + getType() + "]"
				+ " [creationTime: " + getCreationTime() + "]" + " [useInPLC: "
				+ isUseInPLC() + "]" + " [expTheshold: " + getExpTheshold()
				+ "]" + " [expPeriod: " + getExpPeriod() + "]" + " [priority: "
				+ getPriority() + "]" + " [version: " + getVersion() + "]"
				+ " [versioned: " + isVersioned() + "]"
				+ " [maxVersionsCount: " + getMaxVersionsCount() + "]"
				+ " [maxStorageTime: " + getMaxStorageTime() + "]";
	}
}
