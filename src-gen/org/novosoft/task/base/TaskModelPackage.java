package org.novosoft.task.base;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.novosoft.task.base.dao.TaskDao;
import org.novosoft.task.base.properties.PropertiesModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>task</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TaskModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * 
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String NS_URI = "http://www.novosoft.org/task/base";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final TaskModelFactory MODELFACTORY = new TaskModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_TASKID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_FILENAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_DISPLAYNAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_ISHIDDEN_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_LASTRUNEVENT_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_LASTRUNERROR_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_LASTRUNSTART_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_LASTRUNFINISH_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_TASKTYPE_FEATURE_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_TASKCREATIONDATE_FEATURE_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_USEDFORPROTECTIONCALC_FEATURE_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_BACKUPEXPIRATIONTHRESHOLD_FEATURE_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_BACKUPEXPIRATIONPERIOD_FEATURE_ID = 12;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_TASKPRIORITY_FEATURE_ID = 13;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_RUNONEVENT_FEATURE_ID = 14;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_CURRENTBACKUPVERSION_FEATURE_ID = 15;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_LASTFULLBACKUPVERSION_FEATURE_ID = 16;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_USETIMESTAMPS_FEATURE_ID = 17;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_USETEMPFORSZIP_FEATURE_ID = 18;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_INCREMENTVERSIONNUMBER_FEATURE_ID = 19;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_MAXVERSIONSCOUNT_FEATURE_ID = 20;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_MAXSTORAGETIME_FEATURE_ID = 21;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_BACKUPTYPE_FEATURE_ID = 22;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_CLEANDESTINATION_FEATURE_ID = 23;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_TRANSFORMATIONFILTERS_FEATURE_ID = 24;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_DIFFCONDITION_FEATURE_ID = 25;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_COPYDIRECTION_FEATURE_ID = 26;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_STOPCONDITION_FEATURE_ID = 27;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_DIFFATTRIBUTESMASK_FEATURE_ID = 28;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_EXCLUDEDFILEFILTERATTRIBUTES_FEATURE_ID = 29;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_EXCLUDEDFILEFILTERMASKS_FEATURE_ID = 30;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_EXCLUDEDFILEFILTERCREATIONMIN_FEATURE_ID = 31;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_EXCLUDEDFILEFILTERCREATIONMAX_FEATURE_ID = 32;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_INCLUDEDFILEFILTERATTRIBUTES_FEATURE_ID = 33;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_INCLUDEDFILEFILTERMASKS_FEATURE_ID = 34;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_INCLUDEDFILEFILTERCREATIONMIN_FEATURE_ID = 35;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_INCLUDEDFILEFILTERCREATIONMAX_FEATURE_ID = 36;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_EXCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID = 37;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_INCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID = 38;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_SOURCES_FEATURE_ID = 39;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_ALIASES_FEATURE_ID = 40;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_TARGETS_FEATURE_ID = 41;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_SCHEDULETYPE_FEATURE_ID = 42;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_RUNMISSING_FEATURE_ID = 43;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_SCHEDULESTART_FEATURE_ID = 44;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_SCHEDULEDAYS_FEATURE_ID = 45;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_SCHEDULEPERIOD_FEATURE_ID = 46;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_ACTIONS_FEATURE_ID = 47;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_SCHEDULELASTRUNTIME_FEATURE_ID = 48;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASK_SCHEDULENEXTRUNTIME_FEATURE_ID = 49;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final TaskModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return an initialized instance of this class
	 *
	 * @generated
	 */
	public static TaskModelPackage initialize() {

		if (isInitialized) {
			return (TaskModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final TaskModelPackage modelPackage = new TaskModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		PropertiesModelPackage.initialize();

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(Task.class,
				modelPackage.getTaskEClass(), modelPackage);

		DaoRegistry.getInstance().registerDao(Task.class, TaskDao.class);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the {@link TaskModelFactory} instance.
	 * @generated
	 */
	@Override
	public TaskModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "task.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Task</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Task</b></em>'
	 * @generated
	 */
	public EClass getTaskEClass() {
		return (EClass) getEPackage().getEClassifiers().get(TASK_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.taskID</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.taskID</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_TaskID() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_TASKID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.fileName</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.fileName</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_FileName() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_FILENAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.displayName</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.displayName</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_DisplayName() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_DISPLAYNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.isHidden</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.isHidden</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_IsHidden() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_ISHIDDEN_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.lastRunEvent</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.lastRunEvent</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_LastRunEvent() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_LASTRUNEVENT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.lastRunError</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.lastRunError</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_LastRunError() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_LASTRUNERROR_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.lastRunStart</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.lastRunStart</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_LastRunStart() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_LASTRUNSTART_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.lastRunFinish</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.lastRunFinish</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_LastRunFinish() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_LASTRUNFINISH_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.taskType</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.taskType</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_TaskType() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_TASKTYPE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.taskCreationDate</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.taskCreationDate</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_TaskCreationDate() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_TASKCREATIONDATE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.usedForProtectionCalc</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.usedForProtectionCalc</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_UsedForProtectionCalc() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_USEDFORPROTECTIONCALC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.backupExpirationThreshold</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.backupExpirationThreshold</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_BackupExpirationThreshold() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_BACKUPEXPIRATIONTHRESHOLD_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.backupExpirationPeriod</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.backupExpirationPeriod</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_BackupExpirationPeriod() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_BACKUPEXPIRATIONPERIOD_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.taskPriority</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.taskPriority</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_TaskPriority() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_TASKPRIORITY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.runOnEvent</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.runOnEvent</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_RunOnEvent() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_RUNONEVENT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.currentBackupVersion</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.currentBackupVersion</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_CurrentBackupVersion() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_CURRENTBACKUPVERSION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.lastFullBackupVersion</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.lastFullBackupVersion</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_LastFullBackupVersion() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_LASTFULLBACKUPVERSION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.useTimeStamps</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.useTimeStamps</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_UseTimeStamps() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_USETIMESTAMPS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.useTempForSZIP</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.useTempForSZIP</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_UseTempForSZIP() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_USETEMPFORSZIP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.incrementVersionNumber</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.incrementVersionNumber</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_IncrementVersionNumber() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_INCREMENTVERSIONNUMBER_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.maxVersionsCount</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.maxVersionsCount</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_MaxVersionsCount() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_MAXVERSIONSCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.maxStorageTime</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.maxStorageTime</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_MaxStorageTime() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_MAXSTORAGETIME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.backupType</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.backupType</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_BackupType() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_BACKUPTYPE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.cleanDestination</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.cleanDestination</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_CleanDestination() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_CLEANDESTINATION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.transformationFilters</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.transformationFilters</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_TransformationFilters() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_TRANSFORMATIONFILTERS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.diffCondition</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.diffCondition</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_DiffCondition() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_DIFFCONDITION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.copyDirection</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.copyDirection</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_CopyDirection() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_COPYDIRECTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.stopCondition</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.stopCondition</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_StopCondition() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_STOPCONDITION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.diffAttributesMask</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.diffAttributesMask</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_DiffAttributesMask() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_DIFFATTRIBUTESMASK_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.excludedFileFilterAttributes</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.excludedFileFilterAttributes</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_ExcludedFileFilterAttributes() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_EXCLUDEDFILEFILTERATTRIBUTES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.excludedFileFilterMasks</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.excludedFileFilterMasks</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_ExcludedFileFilterMasks() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_EXCLUDEDFILEFILTERMASKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.excludedFileFilterCreationMin</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.excludedFileFilterCreationMin</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_ExcludedFileFilterCreationMin() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_EXCLUDEDFILEFILTERCREATIONMIN_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.excludedFileFilterCreationMax</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.excludedFileFilterCreationMax</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_ExcludedFileFilterCreationMax() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_EXCLUDEDFILEFILTERCREATIONMAX_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.includedFileFilterAttributes</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.includedFileFilterAttributes</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_IncludedFileFilterAttributes() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_INCLUDEDFILEFILTERATTRIBUTES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.includedFileFilterMasks</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.includedFileFilterMasks</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_IncludedFileFilterMasks() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_INCLUDEDFILEFILTERMASKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.includedFileFilterCreationMin</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.includedFileFilterCreationMin</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_IncludedFileFilterCreationMin() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_INCLUDEDFILEFILTERCREATIONMIN_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.includedFileFilterCreationMax</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.includedFileFilterCreationMax</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_IncludedFileFilterCreationMax() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_INCLUDEDFILEFILTERCREATIONMAX_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.excludedDirectoryFilterMasks</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.excludedDirectoryFilterMasks</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_ExcludedDirectoryFilterMasks() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_EXCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.IncludedDirectoryFilterMasks</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.IncludedDirectoryFilterMasks</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_IncludedDirectoryFilterMasks() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_INCLUDEDDIRECTORYFILTERMASKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.sources</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.sources</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_Sources() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_SOURCES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.aliases</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.aliases</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_Aliases() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_ALIASES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.targets</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.targets</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_Targets() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_TARGETS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.scheduleType</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.scheduleType</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_ScheduleType() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_SCHEDULETYPE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.runMissing</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.runMissing</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_RunMissing() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_RUNMISSING_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.scheduleStart</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.scheduleStart</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_ScheduleStart() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_SCHEDULESTART_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.scheduleDays</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.scheduleDays</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_ScheduleDays() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_SCHEDULEDAYS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.schedulePeriod</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.schedulePeriod</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_SchedulePeriod() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_SCHEDULEPERIOD_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Task.actions</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.actions</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_Actions() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_ACTIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.scheduleLastRunTime</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.scheduleLastRunTime</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_ScheduleLastRunTime() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_SCHEDULELASTRUNTIME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Task.scheduleNextRunTime</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Task.scheduleNextRunTime</b></em>'.
	 * @generated
	 */
	public EAttribute getTask_ScheduleNextRunTime() {
		return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(
				TASK_SCHEDULENEXTRUNTIME_FEATURE_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case TASK_CLASSIFIER_ID:
			return Task.class;
		default:
			throw new IllegalArgumentException("The EClassifier '"
					+ eClassifier + "' is not defined in this EPackage");
		}
	}
}
