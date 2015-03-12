package org.novosoft.task.base;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.novosoft.task.base.properties.CopyDirection;
import org.novosoft.task.base.properties.DiffCondition;
import org.novosoft.task.base.properties.ErrorID;
import org.novosoft.task.base.properties.OperationType;
import org.novosoft.task.base.properties.ScheduleType;
import org.novosoft.task.base.properties.StopCondition;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: task. It
 * contains code to create instances {@link ModelObject} wrappers and instances
 * for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TaskModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TaskModelPackage.TASK_CLASSIFIER_ID:
			return createTask();
		default:
			throw new IllegalArgumentException("The EClass '"
					+ eClass.getName()
					+ "' is not a valid EClass for this EPackage");
		}
	}

	/**
	 * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModelObject createModelObject(EClass eClass, Object adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case TaskModelPackage.TASK_CLASSIFIER_ID:
			modelObject = new TaskModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass
					+ "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 *
	 * @param eFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}.
	 * If the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param eFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(
			EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Task
	 * @generated
	 */
	public Task createTask() {
		return new Task();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if the value is null then null is
	 *            returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage");
		}
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage.");
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Task</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class TaskModelObject<E extends Task> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return TaskModelPackage.INSTANCE.getTaskEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return TaskModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case TaskModelPackage.TASK_TASKID_FEATURE_ID:
				return getTarget().getTaskID();
			case TaskModelPackage.TASK_FILENAME_FEATURE_ID:
				return getTarget().getFileName();
			case TaskModelPackage.TASK_DISPLAYNAME_FEATURE_ID:
				return getTarget().getDisplayName();
			case TaskModelPackage.TASK_ISHIDDEN_FEATURE_ID:
				return getTarget().isIsHidden();
			case TaskModelPackage.TASK_LASTRUNEVENT_FEATURE_ID:
				return getTarget().getLastRunEvent();
			case TaskModelPackage.TASK_LASTRUNERROR_FEATURE_ID:
				return getTarget().getLastRunError();
			case TaskModelPackage.TASK_LASTRUNSTART_FEATURE_ID:
				return getTarget().getLastRunStart();
			case TaskModelPackage.TASK_LASTRUNFINISH_FEATURE_ID:
				return getTarget().getLastRunFinish();
			case TaskModelPackage.TASK_TASKTYPE_FEATURE_ID:
				return getTarget().getTaskType();
			case TaskModelPackage.TASK_TASKCREATIONDATE_FEATURE_ID:
				return getTarget().getTaskCreationDate();
			case TaskModelPackage.TASK_USEDFORPROTECTIONCALC_FEATURE_ID:
				return getTarget().isUsedForProtectionCalc();
			case TaskModelPackage.TASK_BACKUPEXPIRATIONTHRESHOLD_FEATURE_ID:
				return getTarget().getBackupExpirationThreshold();
			case TaskModelPackage.TASK_BACKUPEXPIRATIONPERIOD_FEATURE_ID:
				return getTarget().getBackupExpirationPeriod();
			case TaskModelPackage.TASK_TASKPRIORITY_FEATURE_ID:
				return getTarget().getTaskPriority();
			case TaskModelPackage.TASK_RUNONEVENT_FEATURE_ID:
				return getTarget().getRunOnEvent();
			case TaskModelPackage.TASK_CURRENTBACKUPVERSION_FEATURE_ID:
				return getTarget().getCurrentBackupVersion();
			case TaskModelPackage.TASK_LASTFULLBACKUPVERSION_FEATURE_ID:
				return getTarget().getLastFullBackupVersion();
			case TaskModelPackage.TASK_USETIMESTAMPS_FEATURE_ID:
				return getTarget().isUseTimeStamps();
			case TaskModelPackage.TASK_USETEMPFORSZIP_FEATURE_ID:
				return getTarget().isUseTempForSZIP();
			case TaskModelPackage.TASK_INCREMENTVERSIONNUMBER_FEATURE_ID:
				return getTarget().isIncrementVersionNumber();
			case TaskModelPackage.TASK_MAXVERSIONSCOUNT_FEATURE_ID:
				return getTarget().getMaxVersionsCount();
			case TaskModelPackage.TASK_MAXSTORAGETIME_FEATURE_ID:
				return getTarget().getMaxStorageTime();
			case TaskModelPackage.TASK_BACKUPTYPE_FEATURE_ID:
				return getTarget().getBackupType();
			case TaskModelPackage.TASK_CLEANDESTINATION_FEATURE_ID:
				return getTarget().isCleanDestination();
			case TaskModelPackage.TASK_TRANSFORMATIONFILTERS_FEATURE_ID:
				return getTarget().getTransformationFilters();
			case TaskModelPackage.TASK_DIFFCONDITION_FEATURE_ID:
				return getTarget().getDiffCondition();
			case TaskModelPackage.TASK_COPYDIRECTION_FEATURE_ID:
				return getTarget().getCopyDirection();
			case TaskModelPackage.TASK_STOPCONDITION_FEATURE_ID:
				return getTarget().getStopCondition();
			case TaskModelPackage.TASK_DIFFATTRIBUTESMASK_FEATURE_ID:
				return getTarget().getDiffAttributesMask();
			case TaskModelPackage.TASK_EXCLUDEDFILEFILTERATTRIBUTES_FEATURE_ID:
				return getTarget().getExcludedFileFilterAttributes();
			case TaskModelPackage.TASK_EXCLUDEDFILEFILTERMASKS_FEATURE_ID:
				return getTarget().getExcludedFileFilterMasks();
			case TaskModelPackage.TASK_EXCLUDEDFILEFILTERCREATIONMIN_FEATURE_ID:
				return getTarget().getExcludedFileFilterCreationMin();
			case TaskModelPackage.TASK_EXCLUDEDFILEFILTERCREATIONMAX_FEATURE_ID:
				return getTarget().getExcludedFileFilterCreationMax();
			case TaskModelPackage.TASK_INCLUDEDFILEFILTERATTRIBUTES_FEATURE_ID:
				return getTarget().getIncludedFileFilterAttributes();
			case TaskModelPackage.TASK_INCLUDEDFILEFILTERMASKS_FEATURE_ID:
				return getTarget().getIncludedFileFilterMasks();
			case TaskModelPackage.TASK_INCLUDEDFILEFILTERCREATIONMIN_FEATURE_ID:
				return getTarget().getIncludedFileFilterCreationMin();
			case TaskModelPackage.TASK_INCLUDEDFILEFILTERCREATIONMAX_FEATURE_ID:
				return getTarget().getIncludedFileFilterCreationMax();
			case TaskModelPackage.TASK_EXCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID:
				return getTarget().getExcludedDirectoryFilterMasks();
			case TaskModelPackage.TASK_INCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID:
				return getTarget().getIncludedDirectoryFilterMasks();
			case TaskModelPackage.TASK_SOURCES_FEATURE_ID:
				return getTarget().getSources();
			case TaskModelPackage.TASK_ALIASES_FEATURE_ID:
				return getTarget().getAliases();
			case TaskModelPackage.TASK_TARGETS_FEATURE_ID:
				return getTarget().getTargets();
			case TaskModelPackage.TASK_SCHEDULETYPE_FEATURE_ID:
				return getTarget().getScheduleType();
			case TaskModelPackage.TASK_RUNMISSING_FEATURE_ID:
				return getTarget().isRunMissing();
			case TaskModelPackage.TASK_SCHEDULESTART_FEATURE_ID:
				return getTarget().getScheduleStart();
			case TaskModelPackage.TASK_SCHEDULEDAYS_FEATURE_ID:
				return getTarget().getScheduleDays();
			case TaskModelPackage.TASK_SCHEDULEPERIOD_FEATURE_ID:
				return getTarget().getSchedulePeriod();
			case TaskModelPackage.TASK_ACTIONS_FEATURE_ID:
				return getTarget().getActions();
			case TaskModelPackage.TASK_SCHEDULELASTRUNTIME_FEATURE_ID:
				return getTarget().getScheduleLastRunTime();
			case TaskModelPackage.TASK_SCHEDULENEXTRUNTIME_FEATURE_ID:
				return getTarget().getScheduleNextRunTime();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case TaskModelPackage.TASK_TASKID_FEATURE_ID:
				getTarget().setTaskID((Long) value);
				return;
			case TaskModelPackage.TASK_FILENAME_FEATURE_ID:
				getTarget().setFileName((String) value);
				return;
			case TaskModelPackage.TASK_DISPLAYNAME_FEATURE_ID:
				getTarget().setDisplayName((String) value);
				return;
			case TaskModelPackage.TASK_ISHIDDEN_FEATURE_ID:
				getTarget().setIsHidden((Boolean) value);
				return;
			case TaskModelPackage.TASK_LASTRUNEVENT_FEATURE_ID:
				getTarget().setLastRunEvent((String) value);
				return;
			case TaskModelPackage.TASK_LASTRUNERROR_FEATURE_ID:
				getTarget().setLastRunError((ErrorID) value);
				return;
			case TaskModelPackage.TASK_LASTRUNSTART_FEATURE_ID:
				getTarget().setLastRunStart((Long) value);
				return;
			case TaskModelPackage.TASK_LASTRUNFINISH_FEATURE_ID:
				getTarget().setLastRunFinish((Long) value);
				return;
			case TaskModelPackage.TASK_TASKTYPE_FEATURE_ID:
				getTarget().setTaskType((OperationType) value);
				return;
			case TaskModelPackage.TASK_TASKCREATIONDATE_FEATURE_ID:
				getTarget().setTaskCreationDate((Long) value);
				return;
			case TaskModelPackage.TASK_USEDFORPROTECTIONCALC_FEATURE_ID:
				getTarget().setUsedForProtectionCalc((Boolean) value);
				return;
			case TaskModelPackage.TASK_BACKUPEXPIRATIONTHRESHOLD_FEATURE_ID:
				getTarget().setBackupExpirationThreshold((Long) value);
				return;
			case TaskModelPackage.TASK_BACKUPEXPIRATIONPERIOD_FEATURE_ID:
				getTarget().setBackupExpirationPeriod((Long) value);
				return;
			case TaskModelPackage.TASK_TASKPRIORITY_FEATURE_ID:
				getTarget().setTaskPriority((Long) value);
				return;
			case TaskModelPackage.TASK_RUNONEVENT_FEATURE_ID:
				getTarget().setRunOnEvent((List<String>) value);
				return;
			case TaskModelPackage.TASK_CURRENTBACKUPVERSION_FEATURE_ID:
				getTarget().setCurrentBackupVersion((Long) value);
				return;
			case TaskModelPackage.TASK_LASTFULLBACKUPVERSION_FEATURE_ID:
				getTarget().setLastFullBackupVersion((Long) value);
				return;
			case TaskModelPackage.TASK_USETIMESTAMPS_FEATURE_ID:
				getTarget().setUseTimeStamps((Boolean) value);
				return;
			case TaskModelPackage.TASK_USETEMPFORSZIP_FEATURE_ID:
				getTarget().setUseTempForSZIP((Boolean) value);
				return;
			case TaskModelPackage.TASK_INCREMENTVERSIONNUMBER_FEATURE_ID:
				getTarget().setIncrementVersionNumber((Boolean) value);
				return;
			case TaskModelPackage.TASK_MAXVERSIONSCOUNT_FEATURE_ID:
				getTarget().setMaxVersionsCount((Long) value);
				return;
			case TaskModelPackage.TASK_MAXSTORAGETIME_FEATURE_ID:
				getTarget().setMaxStorageTime((Long) value);
				return;
			case TaskModelPackage.TASK_BACKUPTYPE_FEATURE_ID:
				getTarget().setBackupType((OperationType) value);
				return;
			case TaskModelPackage.TASK_CLEANDESTINATION_FEATURE_ID:
				getTarget().setCleanDestination((Boolean) value);
				return;
			case TaskModelPackage.TASK_TRANSFORMATIONFILTERS_FEATURE_ID:
				getTarget().setTransformationFilters((List<String>) value);
				return;
			case TaskModelPackage.TASK_DIFFCONDITION_FEATURE_ID:
				getTarget().setDiffCondition((DiffCondition) value);
				return;
			case TaskModelPackage.TASK_COPYDIRECTION_FEATURE_ID:
				getTarget().setCopyDirection((CopyDirection) value);
				return;
			case TaskModelPackage.TASK_STOPCONDITION_FEATURE_ID:
				getTarget().setStopCondition((StopCondition) value);
				return;
			case TaskModelPackage.TASK_DIFFATTRIBUTESMASK_FEATURE_ID:
				getTarget().setDiffAttributesMask((Integer) value);
				return;
			case TaskModelPackage.TASK_EXCLUDEDFILEFILTERATTRIBUTES_FEATURE_ID:
				getTarget().setExcludedFileFilterAttributes((Integer) value);
				return;
			case TaskModelPackage.TASK_EXCLUDEDFILEFILTERMASKS_FEATURE_ID:
				getTarget().setExcludedFileFilterMasks((List<String>) value);
				return;
			case TaskModelPackage.TASK_EXCLUDEDFILEFILTERCREATIONMIN_FEATURE_ID:
				getTarget().setExcludedFileFilterCreationMin((Long) value);
				return;
			case TaskModelPackage.TASK_EXCLUDEDFILEFILTERCREATIONMAX_FEATURE_ID:
				getTarget().setExcludedFileFilterCreationMax((Long) value);
				return;
			case TaskModelPackage.TASK_INCLUDEDFILEFILTERATTRIBUTES_FEATURE_ID:
				getTarget().setIncludedFileFilterAttributes((Integer) value);
				return;
			case TaskModelPackage.TASK_INCLUDEDFILEFILTERMASKS_FEATURE_ID:
				getTarget().setIncludedFileFilterMasks((List<String>) value);
				return;
			case TaskModelPackage.TASK_INCLUDEDFILEFILTERCREATIONMIN_FEATURE_ID:
				getTarget().setIncludedFileFilterCreationMin((Long) value);
				return;
			case TaskModelPackage.TASK_INCLUDEDFILEFILTERCREATIONMAX_FEATURE_ID:
				getTarget().setIncludedFileFilterCreationMax((Long) value);
				return;
			case TaskModelPackage.TASK_EXCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID:
				getTarget().setExcludedDirectoryFilterMasks(
						(List<String>) value);
				return;
			case TaskModelPackage.TASK_INCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID:
				getTarget().setIncludedDirectoryFilterMasks(
						(List<String>) value);
				return;
			case TaskModelPackage.TASK_SOURCES_FEATURE_ID:
				getTarget().setSources((List<String>) value);
				return;
			case TaskModelPackage.TASK_ALIASES_FEATURE_ID:
				getTarget().setAliases((List<String>) value);
				return;
			case TaskModelPackage.TASK_TARGETS_FEATURE_ID:
				getTarget().setTargets((List<String>) value);
				return;
			case TaskModelPackage.TASK_SCHEDULETYPE_FEATURE_ID:
				getTarget().setScheduleType((ScheduleType) value);
				return;
			case TaskModelPackage.TASK_RUNMISSING_FEATURE_ID:
				getTarget().setRunMissing((Boolean) value);
				return;
			case TaskModelPackage.TASK_SCHEDULESTART_FEATURE_ID:
				getTarget().setScheduleStart((Long) value);
				return;
			case TaskModelPackage.TASK_SCHEDULEDAYS_FEATURE_ID:
				getTarget().setScheduleDays((Long) value);
				return;
			case TaskModelPackage.TASK_SCHEDULEPERIOD_FEATURE_ID:
				getTarget().setSchedulePeriod((Long) value);
				return;
			case TaskModelPackage.TASK_ACTIONS_FEATURE_ID:
				getTarget().setActions((List<String>) value);
				return;
			case TaskModelPackage.TASK_SCHEDULELASTRUNTIME_FEATURE_ID:
				getTarget().setScheduleLastRunTime((Long) value);
				return;
			case TaskModelPackage.TASK_SCHEDULENEXTRUNTIME_FEATURE_ID:
				getTarget().setScheduleNextRunTime((Long) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case TaskModelPackage.TASK_RUNONEVENT_FEATURE_ID:
				return getTarget().getRunOnEvent().add((String) value);

			case TaskModelPackage.TASK_TRANSFORMATIONFILTERS_FEATURE_ID:
				return getTarget().getTransformationFilters().add(
						(String) value);

			case TaskModelPackage.TASK_EXCLUDEDFILEFILTERMASKS_FEATURE_ID:
				return getTarget().getExcludedFileFilterMasks().add(
						(String) value);

			case TaskModelPackage.TASK_INCLUDEDFILEFILTERMASKS_FEATURE_ID:
				return getTarget().getIncludedFileFilterMasks().add(
						(String) value);

			case TaskModelPackage.TASK_EXCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID:
				return getTarget().getExcludedDirectoryFilterMasks().add(
						(String) value);

			case TaskModelPackage.TASK_INCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID:
				return getTarget().getIncludedDirectoryFilterMasks().add(
						(String) value);

			case TaskModelPackage.TASK_SOURCES_FEATURE_ID:
				return getTarget().getSources().add((String) value);

			case TaskModelPackage.TASK_ALIASES_FEATURE_ID:
				return getTarget().getAliases().add((String) value);

			case TaskModelPackage.TASK_TARGETS_FEATURE_ID:
				return getTarget().getTargets().add((String) value);

			case TaskModelPackage.TASK_ACTIONS_FEATURE_ID:
				return getTarget().getActions().add((String) value);

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case TaskModelPackage.TASK_RUNONEVENT_FEATURE_ID:
				return getTarget().getRunOnEvent().remove(value);

			case TaskModelPackage.TASK_TRANSFORMATIONFILTERS_FEATURE_ID:
				return getTarget().getTransformationFilters().remove(value);

			case TaskModelPackage.TASK_EXCLUDEDFILEFILTERMASKS_FEATURE_ID:
				return getTarget().getExcludedFileFilterMasks().remove(value);

			case TaskModelPackage.TASK_INCLUDEDFILEFILTERMASKS_FEATURE_ID:
				return getTarget().getIncludedFileFilterMasks().remove(value);

			case TaskModelPackage.TASK_EXCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID:
				return getTarget().getExcludedDirectoryFilterMasks().remove(
						value);

			case TaskModelPackage.TASK_INCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID:
				return getTarget().getIncludedDirectoryFilterMasks().remove(
						value);

			case TaskModelPackage.TASK_SOURCES_FEATURE_ID:
				return getTarget().getSources().remove(value);

			case TaskModelPackage.TASK_ALIASES_FEATURE_ID:
				return getTarget().getAliases().remove(value);

			case TaskModelPackage.TASK_TARGETS_FEATURE_ID:
				return getTarget().getTargets().remove(value);

			case TaskModelPackage.TASK_ACTIONS_FEATURE_ID:
				return getTarget().getActions().remove(value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}
}