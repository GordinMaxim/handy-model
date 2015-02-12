package org.novosoft.task.base.properties;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.novosoft.task.base.identifiable.IdentifiableModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>properties</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PropertiesModelPackage extends ModelPackage {

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
	public static final String NS_URI = "http://www.novosoft.org/task/base/properties";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final PropertiesModelFactory MODELFACTORY = new PropertiesModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONTYPE_CLASSIFIER_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTIONTYPE_CLASSIFIER_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTIONRUNTIME_CLASSIFIER_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int COPYMODE_CLASSIFIER_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int COPYDIRECTION_CLASSIFIER_ID = 12;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DIFFCONDITION_CLASSIFIER_ID = 14;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STOPCONDITION_CLASSIFIER_ID = 13;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHEDULETYPE_CLASSIFIER_ID = 15;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_FNAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_DNAME_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_TYPE_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_CREATIONTIME_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_USEINPLC_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_EXPTHESHOLD_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_EXPPERIOD_FEATURE_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_PRIORITY_FEATURE_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_ACTIONS_FEATURE_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_FETCHING_FEATURE_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_OPERATION_FEATURE_ID = 12;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_SCHEDULE_FEATURE_ID = 13;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_SOURCES_FEATURE_ID = 14;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_TARGETS_FEATURE_ID = 15;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_ALIASES_FEATURE_ID = 16;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_FILTERS_FEATURE_ID = 17;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_EVENTS_FEATURE_ID = 18;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_VERSION_FEATURE_ID = 19;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_VERSIONED_FEATURE_ID = 20;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_MAXVERSIONSCOUNT_FEATURE_ID = 21;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TASKPROPERTIES_MAXSTORAGETIME_FEATURE_ID = 22;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTSFETCHINGPROPERTIES_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTSFETCHINGPROPERTIES_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTSFETCHINGPROPERTIES_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTSFETCHINGPROPERTIES_FILESEXCLUDE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTSFETCHINGPROPERTIES_FILESINCLUDE_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTSFETCHINGPROPERTIES_FOLDERSEXCLUDEMASKS_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTSFETCHINGPROPERTIES_FOLDERSINCLUDEMASKS_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONPROPERTIES_CLASSIFIER_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONPROPERTIES_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONPROPERTIES_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONPROPERTIES_COPYMODE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONPROPERTIES_COPYDIRECTION_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONPROPERTIES_DIFFCONDITION_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONPROPERTIES_STOPCONDITION_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONPROPERTIES_CHECKFILESIZE_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONPROPERTIES_CHECKCREATIONTIME_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OPERATIONPROPERTIES_CHECKMODIFICATIONTIME_FEATURE_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHEDULEPROPERTIES_CLASSIFIER_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHEDULEPROPERTIES_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHEDULEPROPERTIES_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHEDULEPROPERTIES_ISRUNMISSING_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHEDULEPROPERTIES_TYPE_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHEDULEPROPERTIES_START_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHEDULEPROPERTIES_DAYS_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHEDULEPROPERTIES_PERIOD_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LOG_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LOG_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LOG_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LOG_FILEPATH_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMACTION_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMACTION_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMACTION_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMACTION_TYPE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMACTION_WAIT_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMACTION_EVENT_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMACTION_PARAMS_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int FILEFILTERPROPERTIES_CLASSIFIER_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int FILEFILTERPROPERTIES_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int FILEFILTERPROPERTIES_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int FILEFILTERPROPERTIES_ATTRIBUTES_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int FILEFILTERPROPERTIES_MASKS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int FILEFILTERPROPERTIES_CREATION_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INTERVALT_CLASSIFIER_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INTERVALT_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INTERVALT_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INTERVALT_LOWER_BOUND_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INTERVALT_UPPER_BOUND_FEATURE_ID = 3;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final PropertiesModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return an initialized instance of this class
	 *
	 * @generated
	 */
	public static PropertiesModelPackage initialize() {

		if (isInitialized) {
			return (PropertiesModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final PropertiesModelPackage modelPackage = new PropertiesModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		IdentifiableModelPackage.initialize();

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(
				TaskProperties.class, modelPackage.getTaskPropertiesEClass(),
				modelPackage);
		ModelResolver.getInstance()
				.registerClassModelMapping(ObjectsFetchingProperties.class,
						modelPackage.getObjectsFetchingPropertiesEClass(),
						modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				OperationProperties.class,
				modelPackage.getOperationPropertiesEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ScheduleProperties.class,
				modelPackage.getSchedulePropertiesEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Log.class,
				modelPackage.getLogEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				CustomAction.class, modelPackage.getCustomActionEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				FileFilterProperties.class,
				modelPackage.getFileFilterPropertiesEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(IntervalT.class,
				modelPackage.getIntervalTEClass(), modelPackage);

		ModelResolver.getInstance().registerClassModelMapping(
				OperationType.class, modelPackage.getOperationTypeEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(ActionType.class,
				modelPackage.getActionTypeEEnum(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ActionRunTime.class, modelPackage.getActionRunTimeEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(CopyMode.class,
				modelPackage.getCopyModeEEnum(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				CopyDirection.class, modelPackage.getCopyDirectionEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				DiffCondition.class, modelPackage.getDiffConditionEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				StopCondition.class, modelPackage.getStopConditionEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ScheduleType.class, modelPackage.getScheduleTypeEEnum(),
				modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the {@link PropertiesModelFactory} instance.
	 * @generated
	 */
	@Override
	public PropertiesModelFactory getModelFactory() {
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
		return "properties.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>TaskProperties</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>TaskProperties</b></em>
	 *         '
	 * @generated
	 */
	public EClass getTaskPropertiesEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				TASKPROPERTIES_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.fname</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.fname</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Fname() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_FNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.dname</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.dname</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Dname() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_DNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.type</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.type</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Type() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures()
				.get(TASKPROPERTIES_TYPE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.creationTime</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.creationTime</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_CreationTime() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_CREATIONTIME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.useInPLC</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.useInPLC</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_UseInPLC() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_USEINPLC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.expTheshold</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.expTheshold</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_ExpTheshold() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_EXPTHESHOLD_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.expPeriod</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.expPeriod</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_ExpPeriod() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_EXPPERIOD_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.priority</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.priority</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Priority() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_PRIORITY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.actions</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.actions</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Actions() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_ACTIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.fetching</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.fetching</b></em>'.
	 * @generated
	 */
	public EReference getTaskProperties_Fetching() {
		return (EReference) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_FETCHING_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.operation</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.operation</b></em>'.
	 * @generated
	 */
	public EReference getTaskProperties_Operation() {
		return (EReference) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_OPERATION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.schedule</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.schedule</b></em>'.
	 * @generated
	 */
	public EReference getTaskProperties_Schedule() {
		return (EReference) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_SCHEDULE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.sources</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.sources</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Sources() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_SOURCES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.targets</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.targets</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Targets() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_TARGETS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.aliases</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.aliases</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Aliases() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_ALIASES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.filters</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.filters</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Filters() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_FILTERS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.events</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.events</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Events() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_EVENTS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.version</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.version</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Version() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_VERSION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.versioned</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.versioned</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_Versioned() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_VERSIONED_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.maxVersionsCount</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.maxVersionsCount</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_MaxVersionsCount() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_MAXVERSIONSCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TaskProperties.maxStorageTime</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TaskProperties.maxStorageTime</b></em>'.
	 * @generated
	 */
	public EAttribute getTaskProperties_MaxStorageTime() {
		return (EAttribute) getTaskPropertiesEClass()
				.getEAllStructuralFeatures().get(
						TASKPROPERTIES_MAXSTORAGETIME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ObjectsFetchingProperties</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>ObjectsFetchingProperties</b></em>'
	 * @generated
	 */
	public EClass getObjectsFetchingPropertiesEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				OBJECTSFETCHINGPROPERTIES_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ObjectsFetchingProperties.filesExclude</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ObjectsFetchingProperties.filesExclude</b></em>'.
	 * @generated
	 */
	public EReference getObjectsFetchingProperties_FilesExclude() {
		return (EReference) getObjectsFetchingPropertiesEClass()
				.getEAllStructuralFeatures().get(
						OBJECTSFETCHINGPROPERTIES_FILESEXCLUDE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ObjectsFetchingProperties.filesInclude</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ObjectsFetchingProperties.filesInclude</b></em>'.
	 * @generated
	 */
	public EReference getObjectsFetchingProperties_FilesInclude() {
		return (EReference) getObjectsFetchingPropertiesEClass()
				.getEAllStructuralFeatures().get(
						OBJECTSFETCHINGPROPERTIES_FILESINCLUDE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ObjectsFetchingProperties.foldersExcludeMasks</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ObjectsFetchingProperties.foldersExcludeMasks</b></em>'.
	 * @generated
	 */
	public EAttribute getObjectsFetchingProperties_FoldersExcludeMasks() {
		return (EAttribute) getObjectsFetchingPropertiesEClass()
				.getEAllStructuralFeatures()
				.get(OBJECTSFETCHINGPROPERTIES_FOLDERSEXCLUDEMASKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ObjectsFetchingProperties.foldersIncludeMasks</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ObjectsFetchingProperties.foldersIncludeMasks</b></em>'.
	 * @generated
	 */
	public EAttribute getObjectsFetchingProperties_FoldersIncludeMasks() {
		return (EAttribute) getObjectsFetchingPropertiesEClass()
				.getEAllStructuralFeatures()
				.get(OBJECTSFETCHINGPROPERTIES_FOLDERSINCLUDEMASKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>OperationProperties</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>OperationProperties</b></em>'
	 * @generated
	 */
	public EClass getOperationPropertiesEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				OPERATIONPROPERTIES_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>OperationProperties.copyMode</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>OperationProperties.copyMode</b></em>'.
	 * @generated
	 */
	public EAttribute getOperationProperties_CopyMode() {
		return (EAttribute) getOperationPropertiesEClass()
				.getEAllStructuralFeatures().get(
						OPERATIONPROPERTIES_COPYMODE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>OperationProperties.copyDirection</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>OperationProperties.copyDirection</b></em>'.
	 * @generated
	 */
	public EAttribute getOperationProperties_CopyDirection() {
		return (EAttribute) getOperationPropertiesEClass()
				.getEAllStructuralFeatures().get(
						OPERATIONPROPERTIES_COPYDIRECTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>OperationProperties.diffCondition</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>OperationProperties.diffCondition</b></em>'.
	 * @generated
	 */
	public EAttribute getOperationProperties_DiffCondition() {
		return (EAttribute) getOperationPropertiesEClass()
				.getEAllStructuralFeatures().get(
						OPERATIONPROPERTIES_DIFFCONDITION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>OperationProperties.stopCondition</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>OperationProperties.stopCondition</b></em>'.
	 * @generated
	 */
	public EAttribute getOperationProperties_StopCondition() {
		return (EAttribute) getOperationPropertiesEClass()
				.getEAllStructuralFeatures().get(
						OPERATIONPROPERTIES_STOPCONDITION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>OperationProperties.checkFileSize</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>OperationProperties.checkFileSize</b></em>'.
	 * @generated
	 */
	public EAttribute getOperationProperties_CheckFileSize() {
		return (EAttribute) getOperationPropertiesEClass()
				.getEAllStructuralFeatures().get(
						OPERATIONPROPERTIES_CHECKFILESIZE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>OperationProperties.checkCreationTime</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>OperationProperties.checkCreationTime</b></em>'.
	 * @generated
	 */
	public EAttribute getOperationProperties_CheckCreationTime() {
		return (EAttribute) getOperationPropertiesEClass()
				.getEAllStructuralFeatures().get(
						OPERATIONPROPERTIES_CHECKCREATIONTIME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>OperationProperties.checkModificationTime</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>OperationProperties.checkModificationTime</b></em>'.
	 * @generated
	 */
	public EAttribute getOperationProperties_CheckModificationTime() {
		return (EAttribute) getOperationPropertiesEClass()
				.getEAllStructuralFeatures().get(
						OPERATIONPROPERTIES_CHECKMODIFICATIONTIME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ScheduleProperties</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>ScheduleProperties</b></em>'
	 * @generated
	 */
	public EClass getSchedulePropertiesEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SCHEDULEPROPERTIES_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ScheduleProperties.isRunMissing</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ScheduleProperties.isRunMissing</b></em>'.
	 * @generated
	 */
	public EAttribute getScheduleProperties_IsRunMissing() {
		return (EAttribute) getSchedulePropertiesEClass()
				.getEAllStructuralFeatures().get(
						SCHEDULEPROPERTIES_ISRUNMISSING_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ScheduleProperties.type</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ScheduleProperties.type</b></em>'.
	 * @generated
	 */
	public EAttribute getScheduleProperties_Type() {
		return (EAttribute) getSchedulePropertiesEClass()
				.getEAllStructuralFeatures().get(
						SCHEDULEPROPERTIES_TYPE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ScheduleProperties.start</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ScheduleProperties.start</b></em>'.
	 * @generated
	 */
	public EAttribute getScheduleProperties_Start() {
		return (EAttribute) getSchedulePropertiesEClass()
				.getEAllStructuralFeatures().get(
						SCHEDULEPROPERTIES_START_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ScheduleProperties.days</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ScheduleProperties.days</b></em>'.
	 * @generated
	 */
	public EAttribute getScheduleProperties_Days() {
		return (EAttribute) getSchedulePropertiesEClass()
				.getEAllStructuralFeatures().get(
						SCHEDULEPROPERTIES_DAYS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ScheduleProperties.period</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ScheduleProperties.period</b></em>'.
	 * @generated
	 */
	public EAttribute getScheduleProperties_Period() {
		return (EAttribute) getSchedulePropertiesEClass()
				.getEAllStructuralFeatures().get(
						SCHEDULEPROPERTIES_PERIOD_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Log</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Log</b></em>'
	 * @generated
	 */
	public EClass getLogEClass() {
		return (EClass) getEPackage().getEClassifiers().get(LOG_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Log.filePath</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Log.filePath</b></em>'.
	 * @generated
	 */
	public EAttribute getLog_FilePath() {
		return (EAttribute) getLogEClass().getEAllStructuralFeatures().get(
				LOG_FILEPATH_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>CustomAction</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>CustomAction</b></em>'
	 * @generated
	 */
	public EClass getCustomActionEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				CUSTOMACTION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>CustomAction.type</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>CustomAction.type</b></em>'.
	 * @generated
	 */
	public EAttribute getCustomAction_Type() {
		return (EAttribute) getCustomActionEClass().getEAllStructuralFeatures()
				.get(CUSTOMACTION_TYPE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>CustomAction.wait</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>CustomAction.wait</b></em>'.
	 * @generated
	 */
	public EAttribute getCustomAction_Wait() {
		return (EAttribute) getCustomActionEClass().getEAllStructuralFeatures()
				.get(CUSTOMACTION_WAIT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>CustomAction.event</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>CustomAction.event</b></em>'.
	 * @generated
	 */
	public EAttribute getCustomAction_Event() {
		return (EAttribute) getCustomActionEClass().getEAllStructuralFeatures()
				.get(CUSTOMACTION_EVENT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>CustomAction.params</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>CustomAction.params</b></em>'.
	 * @generated
	 */
	public EAttribute getCustomAction_Params() {
		return (EAttribute) getCustomActionEClass().getEAllStructuralFeatures()
				.get(CUSTOMACTION_PARAMS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>FileFilterProperties</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>FileFilterProperties</b></em>'
	 * @generated
	 */
	public EClass getFileFilterPropertiesEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				FILEFILTERPROPERTIES_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>FileFilterProperties.attributes</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>FileFilterProperties.attributes</b></em>'.
	 * @generated
	 */
	public EAttribute getFileFilterProperties_Attributes() {
		return (EAttribute) getFileFilterPropertiesEClass()
				.getEAllStructuralFeatures().get(
						FILEFILTERPROPERTIES_ATTRIBUTES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>FileFilterProperties.masks</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>FileFilterProperties.masks</b></em>'.
	 * @generated
	 */
	public EAttribute getFileFilterProperties_Masks() {
		return (EAttribute) getFileFilterPropertiesEClass()
				.getEAllStructuralFeatures().get(
						FILEFILTERPROPERTIES_MASKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>FileFilterProperties.creation</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>FileFilterProperties.creation</b></em>'.
	 * @generated
	 */
	public EReference getFileFilterProperties_Creation() {
		return (EReference) getFileFilterPropertiesEClass()
				.getEAllStructuralFeatures().get(
						FILEFILTERPROPERTIES_CREATION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>IntervalT</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>IntervalT</b></em>'
	 * @generated
	 */
	public EClass getIntervalTEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				INTERVALT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>IntervalT.lower_bound</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>IntervalT.lower_bound</b></em>'.
	 * @generated
	 */
	public EAttribute getIntervalT_Lower_bound() {
		return (EAttribute) getIntervalTEClass().getEAllStructuralFeatures()
				.get(INTERVALT_LOWER_BOUND_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>IntervalT.upper_bound</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>IntervalT.upper_bound</b></em>'.
	 * @generated
	 */
	public EAttribute getIntervalT_Upper_bound() {
		return (EAttribute) getIntervalTEClass().getEAllStructuralFeatures()
				.get(INTERVALT_UPPER_BOUND_FEATURE_ID);
	}

	/**
	 * Returns the EEnum '<em><b>OperationType</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>OperationType</b></em>'
	 * @generated
	 */
	public EEnum getOperationTypeEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				OPERATIONTYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>ActionType</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '<em><b>ActionType</b></em>
	 *         '
	 * @generated
	 */
	public EEnum getActionTypeEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				ACTIONTYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>ActionRunTime</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>ActionRunTime</b></em>'
	 * @generated
	 */
	public EEnum getActionRunTimeEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				ACTIONRUNTIME_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>CopyMode</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '<em><b>CopyMode</b></em>'
	 * @generated
	 */
	public EEnum getCopyModeEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				COPYMODE_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>CopyDirection</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>CopyDirection</b></em>'
	 * @generated
	 */
	public EEnum getCopyDirectionEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				COPYDIRECTION_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>DiffCondition</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>DiffCondition</b></em>'
	 * @generated
	 */
	public EEnum getDiffConditionEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				DIFFCONDITION_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>StopCondition</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>StopCondition</b></em>'
	 * @generated
	 */
	public EEnum getStopConditionEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				STOPCONDITION_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>ScheduleType</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>ScheduleType</b></em>'
	 * @generated
	 */
	public EEnum getScheduleTypeEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				SCHEDULETYPE_CLASSIFIER_ID);
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
		case TASKPROPERTIES_CLASSIFIER_ID:
			return TaskProperties.class;
		case OBJECTSFETCHINGPROPERTIES_CLASSIFIER_ID:
			return ObjectsFetchingProperties.class;
		case OPERATIONPROPERTIES_CLASSIFIER_ID:
			return OperationProperties.class;
		case SCHEDULEPROPERTIES_CLASSIFIER_ID:
			return ScheduleProperties.class;
		case LOG_CLASSIFIER_ID:
			return Log.class;
		case CUSTOMACTION_CLASSIFIER_ID:
			return CustomAction.class;
		case FILEFILTERPROPERTIES_CLASSIFIER_ID:
			return FileFilterProperties.class;
		case INTERVALT_CLASSIFIER_ID:
			return IntervalT.class;
		case OPERATIONTYPE_CLASSIFIER_ID:
			return OperationType.class;
		case ACTIONTYPE_CLASSIFIER_ID:
			return ActionType.class;
		case ACTIONRUNTIME_CLASSIFIER_ID:
			return ActionRunTime.class;
		case COPYMODE_CLASSIFIER_ID:
			return CopyMode.class;
		case COPYDIRECTION_CLASSIFIER_ID:
			return CopyDirection.class;
		case DIFFCONDITION_CLASSIFIER_ID:
			return DiffCondition.class;
		case STOPCONDITION_CLASSIFIER_ID:
			return StopCondition.class;
		case SCHEDULETYPE_CLASSIFIER_ID:
			return ScheduleType.class;
		default:
			throw new IllegalArgumentException("The EClassifier '"
					+ eClassifier + "' is not defined in this EPackage");
		}
	}
}
