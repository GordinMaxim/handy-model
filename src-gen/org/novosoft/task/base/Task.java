package org.novosoft.task.base;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import org.novosoft.task.base.properties.CopyDirection;
import org.novosoft.task.base.properties.DiffCondition;
import org.novosoft.task.base.properties.ErrorID;
import org.novosoft.task.base.properties.OperationType;
import org.novosoft.task.base.properties.ScheduleType;
import org.novosoft.task.base.properties.StopCondition;

/**
 * A representation of the model object '<em><b>Task</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "task_Task")
public class Task {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Id()
	private long taskID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String fileName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String displayName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean isHidden = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String lastRunEvent = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private ErrorID lastRunError = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long lastRunStart = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long lastRunFinish = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private OperationType taskType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long taskCreationDate = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean usedForProtectionCalc = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long backupExpirationThreshold = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long backupExpirationPeriod = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long taskPriority = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> runOnEvent = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long currentBackupVersion = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long lastFullBackupVersion = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean useTimeStamps = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean useTempForSZIP = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean incrementVersionNumber = false;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private OperationType backupType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean cleanDestination = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> transformationFilters = new ArrayList<String>();

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
	private CopyDirection copyDirection = null;

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
	private int diffAttributesMask = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private int excludedFileFilterAttributes = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> excludedFileFilterMasks = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long excludedFileFilterCreationMin = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long excludedFileFilterCreationMax = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private int includedFileFilterAttributes = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> includedFileFilterMasks = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long includedFileFilterCreationMin = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long includedFileFilterCreationMax = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> excludedDirectoryFilterMasks = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@CollectionTable()
	private List<String> includedDirectoryFilterMasks = new ArrayList<String>();

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
	private List<String> aliases = new ArrayList<String>();

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
	@Basic()
	@Enumerated(EnumType.STRING)
	private ScheduleType scheduleType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean runMissing = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long scheduleStart = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long scheduleDays = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long schedulePeriod = 0;

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
	@Basic()
	private long scheduleLastRunTime = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long scheduleNextRunTime = 0;

	/**
	 * Returns the value of '<em><b>taskID</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>taskID</b></em>' feature
	 * @generated
	 */
	public long getTaskID() {
		return taskID;
	}

	/**
	 * Sets the '{@link Task#getTaskID() <em>taskID</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTaskID
	 *            the new value of the '{@link Task#getTaskID() taskID}'
	 *            feature.
	 * @generated
	 */
	public void setTaskID(long newTaskID) {
		taskID = newTaskID;
	}

	/**
	 * Returns the value of '<em><b>fileName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>fileName</b></em>' feature
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the '{@link Task#getFileName() <em>fileName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFileName
	 *            the new value of the '{@link Task#getFileName() fileName}'
	 *            feature.
	 * @generated
	 */
	public void setFileName(String newFileName) {
		fileName = newFileName;
	}

	/**
	 * Returns the value of '<em><b>displayName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>displayName</b></em>' feature
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the '{@link Task#getDisplayName() <em>displayName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDisplayName
	 *            the new value of the '{@link Task#getDisplayName()
	 *            displayName}' feature.
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		displayName = newDisplayName;
	}

	/**
	 * Returns the value of '<em><b>isHidden</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>isHidden</b></em>' feature
	 * @generated
	 */
	public boolean isIsHidden() {
		return isHidden;
	}

	/**
	 * Sets the '{@link Task#isIsHidden() <em>isHidden</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newIsHidden
	 *            the new value of the '{@link Task#isIsHidden() isHidden}'
	 *            feature.
	 * @generated
	 */
	public void setIsHidden(boolean newIsHidden) {
		isHidden = newIsHidden;
	}

	/**
	 * Returns the value of '<em><b>lastRunEvent</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>lastRunEvent</b></em>' feature
	 * @generated
	 */
	public String getLastRunEvent() {
		return lastRunEvent;
	}

	/**
	 * Sets the '{@link Task#getLastRunEvent() <em>lastRunEvent</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLastRunEvent
	 *            the new value of the '{@link Task#getLastRunEvent()
	 *            lastRunEvent}' feature.
	 * @generated
	 */
	public void setLastRunEvent(String newLastRunEvent) {
		lastRunEvent = newLastRunEvent;
	}

	/**
	 * Returns the value of '<em><b>lastRunError</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>lastRunError</b></em>' feature
	 * @generated
	 */
	public ErrorID getLastRunError() {
		return lastRunError;
	}

	/**
	 * Sets the '{@link Task#getLastRunError() <em>lastRunError</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLastRunError
	 *            the new value of the '{@link Task#getLastRunError()
	 *            lastRunError}' feature.
	 * @generated
	 */
	public void setLastRunError(ErrorID newLastRunError) {
		lastRunError = newLastRunError;
	}

	/**
	 * Returns the value of '<em><b>lastRunStart</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>lastRunStart</b></em>' feature
	 * @generated
	 */
	public long getLastRunStart() {
		return lastRunStart;
	}

	/**
	 * Sets the '{@link Task#getLastRunStart() <em>lastRunStart</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLastRunStart
	 *            the new value of the '{@link Task#getLastRunStart()
	 *            lastRunStart}' feature.
	 * @generated
	 */
	public void setLastRunStart(long newLastRunStart) {
		lastRunStart = newLastRunStart;
	}

	/**
	 * Returns the value of '<em><b>lastRunFinish</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>lastRunFinish</b></em>' feature
	 * @generated
	 */
	public long getLastRunFinish() {
		return lastRunFinish;
	}

	/**
	 * Sets the '{@link Task#getLastRunFinish() <em>lastRunFinish</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLastRunFinish
	 *            the new value of the '{@link Task#getLastRunFinish()
	 *            lastRunFinish}' feature.
	 * @generated
	 */
	public void setLastRunFinish(long newLastRunFinish) {
		lastRunFinish = newLastRunFinish;
	}

	/**
	 * Returns the value of '<em><b>taskType</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>taskType</b></em>' feature
	 * @generated
	 */
	public OperationType getTaskType() {
		return taskType;
	}

	/**
	 * Sets the '{@link Task#getTaskType() <em>taskType</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTaskType
	 *            the new value of the '{@link Task#getTaskType() taskType}'
	 *            feature.
	 * @generated
	 */
	public void setTaskType(OperationType newTaskType) {
		taskType = newTaskType;
	}

	/**
	 * Returns the value of '<em><b>taskCreationDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>taskCreationDate</b></em>' feature
	 * @generated
	 */
	public long getTaskCreationDate() {
		return taskCreationDate;
	}

	/**
	 * Sets the '{@link Task#getTaskCreationDate() <em>taskCreationDate</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTaskCreationDate
	 *            the new value of the '{@link Task#getTaskCreationDate()
	 *            taskCreationDate}' feature.
	 * @generated
	 */
	public void setTaskCreationDate(long newTaskCreationDate) {
		taskCreationDate = newTaskCreationDate;
	}

	/**
	 * Returns the value of '<em><b>usedForProtectionCalc</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>usedForProtectionCalc</b></em>' feature
	 * @generated
	 */
	public boolean isUsedForProtectionCalc() {
		return usedForProtectionCalc;
	}

	/**
	 * Sets the '{@link Task#isUsedForProtectionCalc()
	 * <em>usedForProtectionCalc</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newUsedForProtectionCalc
	 *            the new value of the '{@link Task#isUsedForProtectionCalc()
	 *            usedForProtectionCalc}' feature.
	 * @generated
	 */
	public void setUsedForProtectionCalc(boolean newUsedForProtectionCalc) {
		usedForProtectionCalc = newUsedForProtectionCalc;
	}

	/**
	 * Returns the value of '<em><b>backupExpirationThreshold</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>backupExpirationThreshold</b></em>' feature
	 * @generated
	 */
	public long getBackupExpirationThreshold() {
		return backupExpirationThreshold;
	}

	/**
	 * Sets the '{@link Task#getBackupExpirationThreshold()
	 * <em>backupExpirationThreshold</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newBackupExpirationThreshold
	 *            the new value of the '
	 *            {@link Task#getBackupExpirationThreshold()
	 *            backupExpirationThreshold}' feature.
	 * @generated
	 */
	public void setBackupExpirationThreshold(long newBackupExpirationThreshold) {
		backupExpirationThreshold = newBackupExpirationThreshold;
	}

	/**
	 * Returns the value of '<em><b>backupExpirationPeriod</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>backupExpirationPeriod</b></em>' feature
	 * @generated
	 */
	public long getBackupExpirationPeriod() {
		return backupExpirationPeriod;
	}

	/**
	 * Sets the '{@link Task#getBackupExpirationPeriod()
	 * <em>backupExpirationPeriod</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newBackupExpirationPeriod
	 *            the new value of the '{@link Task#getBackupExpirationPeriod()
	 *            backupExpirationPeriod}' feature.
	 * @generated
	 */
	public void setBackupExpirationPeriod(long newBackupExpirationPeriod) {
		backupExpirationPeriod = newBackupExpirationPeriod;
	}

	/**
	 * Returns the value of '<em><b>taskPriority</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>taskPriority</b></em>' feature
	 * @generated
	 */
	public long getTaskPriority() {
		return taskPriority;
	}

	/**
	 * Sets the '{@link Task#getTaskPriority() <em>taskPriority</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTaskPriority
	 *            the new value of the '{@link Task#getTaskPriority()
	 *            taskPriority}' feature.
	 * @generated
	 */
	public void setTaskPriority(long newTaskPriority) {
		taskPriority = newTaskPriority;
	}

	/**
	 * Returns the value of '<em><b>runOnEvent</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>runOnEvent</b></em>' feature
	 * @generated
	 */
	public List<String> getRunOnEvent() {
		return runOnEvent;
	}

	/**
	 * Sets the '{@link Task#getRunOnEvent() <em>runOnEvent</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRunOnEvent
	 *            the new value of the '{@link Task#getRunOnEvent() runOnEvent}'
	 *            feature.
	 * @generated
	 */
	public void setRunOnEvent(List<String> newRunOnEvent) {
		runOnEvent = newRunOnEvent;
	}

	/**
	 * Returns the value of '<em><b>currentBackupVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>currentBackupVersion</b></em>' feature
	 * @generated
	 */
	public long getCurrentBackupVersion() {
		return currentBackupVersion;
	}

	/**
	 * Sets the '{@link Task#getCurrentBackupVersion()
	 * <em>currentBackupVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCurrentBackupVersion
	 *            the new value of the '{@link Task#getCurrentBackupVersion()
	 *            currentBackupVersion}' feature.
	 * @generated
	 */
	public void setCurrentBackupVersion(long newCurrentBackupVersion) {
		currentBackupVersion = newCurrentBackupVersion;
	}

	/**
	 * Returns the value of '<em><b>lastFullBackupVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>lastFullBackupVersion</b></em>' feature
	 * @generated
	 */
	public long getLastFullBackupVersion() {
		return lastFullBackupVersion;
	}

	/**
	 * Sets the '{@link Task#getLastFullBackupVersion()
	 * <em>lastFullBackupVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLastFullBackupVersion
	 *            the new value of the '{@link Task#getLastFullBackupVersion()
	 *            lastFullBackupVersion}' feature.
	 * @generated
	 */
	public void setLastFullBackupVersion(long newLastFullBackupVersion) {
		lastFullBackupVersion = newLastFullBackupVersion;
	}

	/**
	 * Returns the value of '<em><b>useTimeStamps</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>useTimeStamps</b></em>' feature
	 * @generated
	 */
	public boolean isUseTimeStamps() {
		return useTimeStamps;
	}

	/**
	 * Sets the '{@link Task#isUseTimeStamps() <em>useTimeStamps</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newUseTimeStamps
	 *            the new value of the '{@link Task#isUseTimeStamps()
	 *            useTimeStamps}' feature.
	 * @generated
	 */
	public void setUseTimeStamps(boolean newUseTimeStamps) {
		useTimeStamps = newUseTimeStamps;
	}

	/**
	 * Returns the value of '<em><b>useTempForSZIP</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>useTempForSZIP</b></em>' feature
	 * @generated
	 */
	public boolean isUseTempForSZIP() {
		return useTempForSZIP;
	}

	/**
	 * Sets the '{@link Task#isUseTempForSZIP() <em>useTempForSZIP</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newUseTempForSZIP
	 *            the new value of the '{@link Task#isUseTempForSZIP()
	 *            useTempForSZIP}' feature.
	 * @generated
	 */
	public void setUseTempForSZIP(boolean newUseTempForSZIP) {
		useTempForSZIP = newUseTempForSZIP;
	}

	/**
	 * Returns the value of '<em><b>incrementVersionNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>incrementVersionNumber</b></em>' feature
	 * @generated
	 */
	public boolean isIncrementVersionNumber() {
		return incrementVersionNumber;
	}

	/**
	 * Sets the '{@link Task#isIncrementVersionNumber()
	 * <em>incrementVersionNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newIncrementVersionNumber
	 *            the new value of the '{@link Task#isIncrementVersionNumber()
	 *            incrementVersionNumber}' feature.
	 * @generated
	 */
	public void setIncrementVersionNumber(boolean newIncrementVersionNumber) {
		incrementVersionNumber = newIncrementVersionNumber;
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
	 * Sets the '{@link Task#getMaxVersionsCount() <em>maxVersionsCount</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMaxVersionsCount
	 *            the new value of the '{@link Task#getMaxVersionsCount()
	 *            maxVersionsCount}' feature.
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
	 * Sets the '{@link Task#getMaxStorageTime() <em>maxStorageTime</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMaxStorageTime
	 *            the new value of the '{@link Task#getMaxStorageTime()
	 *            maxStorageTime}' feature.
	 * @generated
	 */
	public void setMaxStorageTime(long newMaxStorageTime) {
		maxStorageTime = newMaxStorageTime;
	}

	/**
	 * Returns the value of '<em><b>backupType</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>backupType</b></em>' feature
	 * @generated
	 */
	public OperationType getBackupType() {
		return backupType;
	}

	/**
	 * Sets the '{@link Task#getBackupType() <em>backupType</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newBackupType
	 *            the new value of the '{@link Task#getBackupType() backupType}'
	 *            feature.
	 * @generated
	 */
	public void setBackupType(OperationType newBackupType) {
		backupType = newBackupType;
	}

	/**
	 * Returns the value of '<em><b>cleanDestination</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>cleanDestination</b></em>' feature
	 * @generated
	 */
	public boolean isCleanDestination() {
		return cleanDestination;
	}

	/**
	 * Sets the '{@link Task#isCleanDestination() <em>cleanDestination</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCleanDestination
	 *            the new value of the '{@link Task#isCleanDestination()
	 *            cleanDestination}' feature.
	 * @generated
	 */
	public void setCleanDestination(boolean newCleanDestination) {
		cleanDestination = newCleanDestination;
	}

	/**
	 * Returns the value of '<em><b>transformationFilters</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>transformationFilters</b></em>' feature
	 * @generated
	 */
	public List<String> getTransformationFilters() {
		return transformationFilters;
	}

	/**
	 * Sets the '{@link Task#getTransformationFilters()
	 * <em>transformationFilters</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTransformationFilters
	 *            the new value of the '{@link Task#getTransformationFilters()
	 *            transformationFilters}' feature.
	 * @generated
	 */
	public void setTransformationFilters(List<String> newTransformationFilters) {
		transformationFilters = newTransformationFilters;
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
	 * Sets the '{@link Task#getDiffCondition() <em>diffCondition</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDiffCondition
	 *            the new value of the '{@link Task#getDiffCondition()
	 *            diffCondition}' feature.
	 * @generated
	 */
	public void setDiffCondition(DiffCondition newDiffCondition) {
		diffCondition = newDiffCondition;
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
	 * Sets the '{@link Task#getCopyDirection() <em>copyDirection</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCopyDirection
	 *            the new value of the '{@link Task#getCopyDirection()
	 *            copyDirection}' feature.
	 * @generated
	 */
	public void setCopyDirection(CopyDirection newCopyDirection) {
		copyDirection = newCopyDirection;
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
	 * Sets the '{@link Task#getStopCondition() <em>stopCondition</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newStopCondition
	 *            the new value of the '{@link Task#getStopCondition()
	 *            stopCondition}' feature.
	 * @generated
	 */
	public void setStopCondition(StopCondition newStopCondition) {
		stopCondition = newStopCondition;
	}

	/**
	 * Returns the value of '<em><b>diffAttributesMask</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>diffAttributesMask</b></em>' feature
	 * @generated
	 */
	public int getDiffAttributesMask() {
		return diffAttributesMask;
	}

	/**
	 * Sets the '{@link Task#getDiffAttributesMask()
	 * <em>diffAttributesMask</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDiffAttributesMask
	 *            the new value of the '{@link Task#getDiffAttributesMask()
	 *            diffAttributesMask}' feature.
	 * @generated
	 */
	public void setDiffAttributesMask(int newDiffAttributesMask) {
		diffAttributesMask = newDiffAttributesMask;
	}

	/**
	 * Returns the value of '<em><b>excludedFileFilterAttributes</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>excludedFileFilterAttributes</b></em>'
	 *         feature
	 * @generated
	 */
	public int getExcludedFileFilterAttributes() {
		return excludedFileFilterAttributes;
	}

	/**
	 * Sets the '{@link Task#getExcludedFileFilterAttributes()
	 * <em>excludedFileFilterAttributes</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newExcludedFileFilterAttributes
	 *            the new value of the '
	 *            {@link Task#getExcludedFileFilterAttributes()
	 *            excludedFileFilterAttributes}' feature.
	 * @generated
	 */
	public void setExcludedFileFilterAttributes(
			int newExcludedFileFilterAttributes) {
		excludedFileFilterAttributes = newExcludedFileFilterAttributes;
	}

	/**
	 * Returns the value of '<em><b>excludedFileFilterMasks</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>excludedFileFilterMasks</b></em>' feature
	 * @generated
	 */
	public List<String> getExcludedFileFilterMasks() {
		return excludedFileFilterMasks;
	}

	/**
	 * Sets the '{@link Task#getExcludedFileFilterMasks()
	 * <em>excludedFileFilterMasks</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newExcludedFileFilterMasks
	 *            the new value of the '
	 *            {@link Task#getExcludedFileFilterMasks()
	 *            excludedFileFilterMasks}' feature.
	 * @generated
	 */
	public void setExcludedFileFilterMasks(
			List<String> newExcludedFileFilterMasks) {
		excludedFileFilterMasks = newExcludedFileFilterMasks;
	}

	/**
	 * Returns the value of '<em><b>excludedFileFilterCreationMin</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>excludedFileFilterCreationMin</b></em>'
	 *         feature
	 * @generated
	 */
	public long getExcludedFileFilterCreationMin() {
		return excludedFileFilterCreationMin;
	}

	/**
	 * Sets the '{@link Task#getExcludedFileFilterCreationMin()
	 * <em>excludedFileFilterCreationMin</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newExcludedFileFilterCreationMin
	 *            the new value of the '
	 *            {@link Task#getExcludedFileFilterCreationMin()
	 *            excludedFileFilterCreationMin}' feature.
	 * @generated
	 */
	public void setExcludedFileFilterCreationMin(
			long newExcludedFileFilterCreationMin) {
		excludedFileFilterCreationMin = newExcludedFileFilterCreationMin;
	}

	/**
	 * Returns the value of '<em><b>excludedFileFilterCreationMax</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>excludedFileFilterCreationMax</b></em>'
	 *         feature
	 * @generated
	 */
	public long getExcludedFileFilterCreationMax() {
		return excludedFileFilterCreationMax;
	}

	/**
	 * Sets the '{@link Task#getExcludedFileFilterCreationMax()
	 * <em>excludedFileFilterCreationMax</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newExcludedFileFilterCreationMax
	 *            the new value of the '
	 *            {@link Task#getExcludedFileFilterCreationMax()
	 *            excludedFileFilterCreationMax}' feature.
	 * @generated
	 */
	public void setExcludedFileFilterCreationMax(
			long newExcludedFileFilterCreationMax) {
		excludedFileFilterCreationMax = newExcludedFileFilterCreationMax;
	}

	/**
	 * Returns the value of '<em><b>includedFileFilterAttributes</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>includedFileFilterAttributes</b></em>'
	 *         feature
	 * @generated
	 */
	public int getIncludedFileFilterAttributes() {
		return includedFileFilterAttributes;
	}

	/**
	 * Sets the '{@link Task#getIncludedFileFilterAttributes()
	 * <em>includedFileFilterAttributes</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newIncludedFileFilterAttributes
	 *            the new value of the '
	 *            {@link Task#getIncludedFileFilterAttributes()
	 *            includedFileFilterAttributes}' feature.
	 * @generated
	 */
	public void setIncludedFileFilterAttributes(
			int newIncludedFileFilterAttributes) {
		includedFileFilterAttributes = newIncludedFileFilterAttributes;
	}

	/**
	 * Returns the value of '<em><b>includedFileFilterMasks</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>includedFileFilterMasks</b></em>' feature
	 * @generated
	 */
	public List<String> getIncludedFileFilterMasks() {
		return includedFileFilterMasks;
	}

	/**
	 * Sets the '{@link Task#getIncludedFileFilterMasks()
	 * <em>includedFileFilterMasks</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newIncludedFileFilterMasks
	 *            the new value of the '
	 *            {@link Task#getIncludedFileFilterMasks()
	 *            includedFileFilterMasks}' feature.
	 * @generated
	 */
	public void setIncludedFileFilterMasks(
			List<String> newIncludedFileFilterMasks) {
		includedFileFilterMasks = newIncludedFileFilterMasks;
	}

	/**
	 * Returns the value of '<em><b>includedFileFilterCreationMin</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>includedFileFilterCreationMin</b></em>'
	 *         feature
	 * @generated
	 */
	public long getIncludedFileFilterCreationMin() {
		return includedFileFilterCreationMin;
	}

	/**
	 * Sets the '{@link Task#getIncludedFileFilterCreationMin()
	 * <em>includedFileFilterCreationMin</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newIncludedFileFilterCreationMin
	 *            the new value of the '
	 *            {@link Task#getIncludedFileFilterCreationMin()
	 *            includedFileFilterCreationMin}' feature.
	 * @generated
	 */
	public void setIncludedFileFilterCreationMin(
			long newIncludedFileFilterCreationMin) {
		includedFileFilterCreationMin = newIncludedFileFilterCreationMin;
	}

	/**
	 * Returns the value of '<em><b>includedFileFilterCreationMax</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>includedFileFilterCreationMax</b></em>'
	 *         feature
	 * @generated
	 */
	public long getIncludedFileFilterCreationMax() {
		return includedFileFilterCreationMax;
	}

	/**
	 * Sets the '{@link Task#getIncludedFileFilterCreationMax()
	 * <em>includedFileFilterCreationMax</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newIncludedFileFilterCreationMax
	 *            the new value of the '
	 *            {@link Task#getIncludedFileFilterCreationMax()
	 *            includedFileFilterCreationMax}' feature.
	 * @generated
	 */
	public void setIncludedFileFilterCreationMax(
			long newIncludedFileFilterCreationMax) {
		includedFileFilterCreationMax = newIncludedFileFilterCreationMax;
	}

	/**
	 * Returns the value of '<em><b>excludedDirectoryFilterMasks</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>excludedDirectoryFilterMasks</b></em>'
	 *         feature
	 * @generated
	 */
	public List<String> getExcludedDirectoryFilterMasks() {
		return excludedDirectoryFilterMasks;
	}

	/**
	 * Sets the '{@link Task#getExcludedDirectoryFilterMasks()
	 * <em>excludedDirectoryFilterMasks</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newExcludedDirectoryFilterMasks
	 *            the new value of the '
	 *            {@link Task#getExcludedDirectoryFilterMasks()
	 *            excludedDirectoryFilterMasks}' feature.
	 * @generated
	 */
	public void setExcludedDirectoryFilterMasks(
			List<String> newExcludedDirectoryFilterMasks) {
		excludedDirectoryFilterMasks = newExcludedDirectoryFilterMasks;
	}

	/**
	 * Returns the value of '<em><b>IncludedDirectoryFilterMasks</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>IncludedDirectoryFilterMasks</b></em>'
	 *         feature
	 * @generated
	 */
	public List<String> getIncludedDirectoryFilterMasks() {
		return includedDirectoryFilterMasks;
	}

	/**
	 * Sets the '{@link Task#getIncludedDirectoryFilterMasks()
	 * <em>IncludedDirectoryFilterMasks</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newIncludedDirectoryFilterMasks
	 *            the new value of the '
	 *            {@link Task#getIncludedDirectoryFilterMasks()
	 *            IncludedDirectoryFilterMasks}' feature.
	 * @generated
	 */
	public void setIncludedDirectoryFilterMasks(
			List<String> newIncludedDirectoryFilterMasks) {
		includedDirectoryFilterMasks = newIncludedDirectoryFilterMasks;
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
	 * Sets the '{@link Task#getSources() <em>sources</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSources
	 *            the new value of the '{@link Task#getSources() sources}'
	 *            feature.
	 * @generated
	 */
	public void setSources(List<String> newSources) {
		sources = newSources;
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
	 * Sets the '{@link Task#getAliases() <em>aliases</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAliases
	 *            the new value of the '{@link Task#getAliases() aliases}'
	 *            feature.
	 * @generated
	 */
	public void setAliases(List<String> newAliases) {
		aliases = newAliases;
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
	 * Sets the '{@link Task#getTargets() <em>targets</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTargets
	 *            the new value of the '{@link Task#getTargets() targets}'
	 *            feature.
	 * @generated
	 */
	public void setTargets(List<String> newTargets) {
		targets = newTargets;
	}

	/**
	 * Returns the value of '<em><b>scheduleType</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>scheduleType</b></em>' feature
	 * @generated
	 */
	public ScheduleType getScheduleType() {
		return scheduleType;
	}

	/**
	 * Sets the '{@link Task#getScheduleType() <em>scheduleType</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newScheduleType
	 *            the new value of the '{@link Task#getScheduleType()
	 *            scheduleType}' feature.
	 * @generated
	 */
	public void setScheduleType(ScheduleType newScheduleType) {
		scheduleType = newScheduleType;
	}

	/**
	 * Returns the value of '<em><b>runMissing</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>runMissing</b></em>' feature
	 * @generated
	 */
	public boolean isRunMissing() {
		return runMissing;
	}

	/**
	 * Sets the '{@link Task#isRunMissing() <em>runMissing</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRunMissing
	 *            the new value of the '{@link Task#isRunMissing() runMissing}'
	 *            feature.
	 * @generated
	 */
	public void setRunMissing(boolean newRunMissing) {
		runMissing = newRunMissing;
	}

	/**
	 * Returns the value of '<em><b>scheduleStart</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>scheduleStart</b></em>' feature
	 * @generated
	 */
	public long getScheduleStart() {
		return scheduleStart;
	}

	/**
	 * Sets the '{@link Task#getScheduleStart() <em>scheduleStart</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newScheduleStart
	 *            the new value of the '{@link Task#getScheduleStart()
	 *            scheduleStart}' feature.
	 * @generated
	 */
	public void setScheduleStart(long newScheduleStart) {
		scheduleStart = newScheduleStart;
	}

	/**
	 * Returns the value of '<em><b>scheduleDays</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>scheduleDays</b></em>' feature
	 * @generated
	 */
	public long getScheduleDays() {
		return scheduleDays;
	}

	/**
	 * Sets the '{@link Task#getScheduleDays() <em>scheduleDays</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newScheduleDays
	 *            the new value of the '{@link Task#getScheduleDays()
	 *            scheduleDays}' feature.
	 * @generated
	 */
	public void setScheduleDays(long newScheduleDays) {
		scheduleDays = newScheduleDays;
	}

	/**
	 * Returns the value of '<em><b>schedulePeriod</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>schedulePeriod</b></em>' feature
	 * @generated
	 */
	public long getSchedulePeriod() {
		return schedulePeriod;
	}

	/**
	 * Sets the '{@link Task#getSchedulePeriod() <em>schedulePeriod</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSchedulePeriod
	 *            the new value of the '{@link Task#getSchedulePeriod()
	 *            schedulePeriod}' feature.
	 * @generated
	 */
	public void setSchedulePeriod(long newSchedulePeriod) {
		schedulePeriod = newSchedulePeriod;
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
	 * Sets the '{@link Task#getActions() <em>actions</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newActions
	 *            the new value of the '{@link Task#getActions() actions}'
	 *            feature.
	 * @generated
	 */
	public void setActions(List<String> newActions) {
		actions = newActions;
	}

	/**
	 * Returns the value of '<em><b>scheduleLastRunTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>scheduleLastRunTime</b></em>' feature
	 * @generated
	 */
	public long getScheduleLastRunTime() {
		return scheduleLastRunTime;
	}

	/**
	 * Sets the '{@link Task#getScheduleLastRunTime()
	 * <em>scheduleLastRunTime</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newScheduleLastRunTime
	 *            the new value of the '{@link Task#getScheduleLastRunTime()
	 *            scheduleLastRunTime}' feature.
	 * @generated
	 */
	public void setScheduleLastRunTime(long newScheduleLastRunTime) {
		scheduleLastRunTime = newScheduleLastRunTime;
	}

	/**
	 * Returns the value of '<em><b>scheduleNextRunTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>scheduleNextRunTime</b></em>' feature
	 * @generated
	 */
	public long getScheduleNextRunTime() {
		return scheduleNextRunTime;
	}

	/**
	 * Sets the '{@link Task#getScheduleNextRunTime()
	 * <em>scheduleNextRunTime</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newScheduleNextRunTime
	 *            the new value of the '{@link Task#getScheduleNextRunTime()
	 *            scheduleNextRunTime}' feature.
	 * @generated
	 */
	public void setScheduleNextRunTime(long newScheduleNextRunTime) {
		scheduleNextRunTime = newScheduleNextRunTime;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Task " + " [taskID: " + getTaskID() + "]" + " [fileName: "
				+ getFileName() + "]" + " [displayName: " + getDisplayName()
				+ "]" + " [isHidden: " + isIsHidden() + "]"
				+ " [lastRunEvent: " + getLastRunEvent() + "]"
				+ " [lastRunError: " + getLastRunError() + "]"
				+ " [lastRunStart: " + getLastRunStart() + "]"
				+ " [lastRunFinish: " + getLastRunFinish() + "]"
				+ " [taskType: " + getTaskType() + "]" + " [taskCreationDate: "
				+ getTaskCreationDate() + "]" + " [usedForProtectionCalc: "
				+ isUsedForProtectionCalc() + "]"
				+ " [backupExpirationThreshold: "
				+ getBackupExpirationThreshold() + "]"
				+ " [backupExpirationPeriod: " + getBackupExpirationPeriod()
				+ "]" + " [taskPriority: " + getTaskPriority() + "]"
				+ " [currentBackupVersion: " + getCurrentBackupVersion() + "]"
				+ " [lastFullBackupVersion: " + getLastFullBackupVersion()
				+ "]" + " [useTimeStamps: " + isUseTimeStamps() + "]"
				+ " [useTempForSZIP: " + isUseTempForSZIP() + "]"
				+ " [incrementVersionNumber: " + isIncrementVersionNumber()
				+ "]" + " [maxVersionsCount: " + getMaxVersionsCount() + "]"
				+ " [maxStorageTime: " + getMaxStorageTime() + "]"
				+ " [backupType: " + getBackupType() + "]"
				+ " [cleanDestination: " + isCleanDestination() + "]"
				+ " [diffCondition: " + getDiffCondition() + "]"
				+ " [copyDirection: " + getCopyDirection() + "]"
				+ " [stopCondition: " + getStopCondition() + "]"
				+ " [diffAttributesMask: " + getDiffAttributesMask() + "]"
				+ " [excludedFileFilterAttributes: "
				+ getExcludedFileFilterAttributes() + "]"
				+ " [excludedFileFilterCreationMin: "
				+ getExcludedFileFilterCreationMin() + "]"
				+ " [excludedFileFilterCreationMax: "
				+ getExcludedFileFilterCreationMax() + "]"
				+ " [includedFileFilterAttributes: "
				+ getIncludedFileFilterAttributes() + "]"
				+ " [includedFileFilterCreationMin: "
				+ getIncludedFileFilterCreationMin() + "]"
				+ " [includedFileFilterCreationMax: "
				+ getIncludedFileFilterCreationMax() + "]" + " [scheduleType: "
				+ getScheduleType() + "]" + " [runMissing: " + isRunMissing()
				+ "]" + " [scheduleStart: " + getScheduleStart() + "]"
				+ " [scheduleDays: " + getScheduleDays() + "]"
				+ " [schedulePeriod: " + getSchedulePeriod() + "]"
				+ " [scheduleLastRunTime: " + getScheduleLastRunTime() + "]"
				+ " [scheduleNextRunTime: " + getScheduleNextRunTime() + "]";
	}
}
