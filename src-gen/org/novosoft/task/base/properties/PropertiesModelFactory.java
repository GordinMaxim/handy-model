package org.novosoft.task.base.properties;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.novosoft.task.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: properties. It
 * contains code to create instances {@link ModelObject} wrappers and instances
 * for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PropertiesModelFactory implements ModelFactory {

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
		case PropertiesModelPackage.TASKPROPERTIES_CLASSIFIER_ID:
			return createTaskProperties();
		case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_CLASSIFIER_ID:
			return createObjectsFetchingProperties();
		case PropertiesModelPackage.OPERATIONPROPERTIES_CLASSIFIER_ID:
			return createOperationProperties();
		case PropertiesModelPackage.SCHEDULEPROPERTIES_CLASSIFIER_ID:
			return createScheduleProperties();
		case PropertiesModelPackage.LOG_CLASSIFIER_ID:
			return createLog();
		case PropertiesModelPackage.CUSTOMACTION_CLASSIFIER_ID:
			return createCustomAction();
		case PropertiesModelPackage.FILEFILTERPROPERTIES_CLASSIFIER_ID:
			return createFileFilterProperties();
		case PropertiesModelPackage.INTERVALT_CLASSIFIER_ID:
			return createIntervalT();
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
		case PropertiesModelPackage.TASKPROPERTIES_CLASSIFIER_ID:
			modelObject = new TaskPropertiesModelObject();
			break;
		case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_CLASSIFIER_ID:
			modelObject = new ObjectsFetchingPropertiesModelObject();
			break;
		case PropertiesModelPackage.OPERATIONPROPERTIES_CLASSIFIER_ID:
			modelObject = new OperationPropertiesModelObject();
			break;
		case PropertiesModelPackage.SCHEDULEPROPERTIES_CLASSIFIER_ID:
			modelObject = new SchedulePropertiesModelObject();
			break;
		case PropertiesModelPackage.LOG_CLASSIFIER_ID:
			modelObject = new LogModelObject();
			break;
		case PropertiesModelPackage.CUSTOMACTION_CLASSIFIER_ID:
			modelObject = new CustomActionModelObject();
			break;
		case PropertiesModelPackage.FILEFILTERPROPERTIES_CLASSIFIER_ID:
			modelObject = new FileFilterPropertiesModelObject();
			break;
		case PropertiesModelPackage.INTERVALT_CLASSIFIER_ID:
			modelObject = new IntervalTModelObject();
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
	 * @return an instance of the model object representing the EClass
	 *         TaskProperties
	 * @generated
	 */
	public TaskProperties createTaskProperties() {
		return new TaskProperties();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         ObjectsFetchingProperties
	 * @generated
	 */
	public ObjectsFetchingProperties createObjectsFetchingProperties() {
		return new ObjectsFetchingProperties();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         OperationProperties
	 * @generated
	 */
	public OperationProperties createOperationProperties() {
		return new OperationProperties();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         ScheduleProperties
	 * @generated
	 */
	public ScheduleProperties createScheduleProperties() {
		return new ScheduleProperties();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Log
	 * @generated
	 */
	public Log createLog() {
		return new Log();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         CustomAction
	 * @generated
	 */
	public CustomAction createCustomAction() {
		return new CustomAction();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         FileFilterProperties
	 * @generated
	 */
	public FileFilterProperties createFileFilterProperties() {
		return new FileFilterProperties();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass IntervalT
	 * @generated
	 */
	public IntervalT createIntervalT() {
		return new IntervalT();
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
		case PropertiesModelPackage.OPERATIONTYPE_CLASSIFIER_ID:
			return createOperationTypeFromString(value);
		case PropertiesModelPackage.ACTIONTYPE_CLASSIFIER_ID:
			return createActionTypeFromString(value);
		case PropertiesModelPackage.ACTIONRUNTIME_CLASSIFIER_ID:
			return createActionRunTimeFromString(value);
		case PropertiesModelPackage.COPYMODE_CLASSIFIER_ID:
			return createCopyModeFromString(value);
		case PropertiesModelPackage.COPYDIRECTION_CLASSIFIER_ID:
			return createCopyDirectionFromString(value);
		case PropertiesModelPackage.DIFFCONDITION_CLASSIFIER_ID:
			return createDiffConditionFromString(value);
		case PropertiesModelPackage.STOPCONDITION_CLASSIFIER_ID:
			return createStopConditionFromString(value);
		case PropertiesModelPackage.SCHEDULETYPE_CLASSIFIER_ID:
			return createScheduleTypeFromString(value);
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
		case PropertiesModelPackage.OPERATIONTYPE_CLASSIFIER_ID:
			return convertOperationTypeToString((OperationType) value);
		case PropertiesModelPackage.ACTIONTYPE_CLASSIFIER_ID:
			return convertActionTypeToString((ActionType) value);
		case PropertiesModelPackage.ACTIONRUNTIME_CLASSIFIER_ID:
			return convertActionRunTimeToString((ActionRunTime) value);
		case PropertiesModelPackage.COPYMODE_CLASSIFIER_ID:
			return convertCopyModeToString((CopyMode) value);
		case PropertiesModelPackage.COPYDIRECTION_CLASSIFIER_ID:
			return convertCopyDirectionToString((CopyDirection) value);
		case PropertiesModelPackage.DIFFCONDITION_CLASSIFIER_ID:
			return convertDiffConditionToString((DiffCondition) value);
		case PropertiesModelPackage.STOPCONDITION_CLASSIFIER_ID:
			return convertStopConditionToString((StopCondition) value);
		case PropertiesModelPackage.SCHEDULETYPE_CLASSIFIER_ID:
			return convertScheduleTypeToString((ScheduleType) value);
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage.");
		}
	}

	/**
	 * Converts the EDataType: OperationType to a String. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertOperationTypeToString(OperationType value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: OperationType from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public OperationType createOperationTypeFromString(String value) {
		if (value == null) {
			return null;
		}
		return OperationType.get(value);
	}

	/**
	 * Converts the EDataType: ActionType to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertActionTypeToString(ActionType value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: ActionType from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public ActionType createActionTypeFromString(String value) {
		if (value == null) {
			return null;
		}
		return ActionType.get(value);
	}

	/**
	 * Converts the EDataType: ActionRunTime to a String. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertActionRunTimeToString(ActionRunTime value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: ActionRunTime from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public ActionRunTime createActionRunTimeFromString(String value) {
		if (value == null) {
			return null;
		}
		return ActionRunTime.get(value);
	}

	/**
	 * Converts the EDataType: CopyMode to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertCopyModeToString(CopyMode value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: CopyMode from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public CopyMode createCopyModeFromString(String value) {
		if (value == null) {
			return null;
		}
		return CopyMode.get(value);
	}

	/**
	 * Converts the EDataType: CopyDirection to a String. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertCopyDirectionToString(CopyDirection value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: CopyDirection from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public CopyDirection createCopyDirectionFromString(String value) {
		if (value == null) {
			return null;
		}
		return CopyDirection.get(value);
	}

	/**
	 * Converts the EDataType: DiffCondition to a String. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertDiffConditionToString(DiffCondition value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: DiffCondition from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public DiffCondition createDiffConditionFromString(String value) {
		if (value == null) {
			return null;
		}
		return DiffCondition.get(value);
	}

	/**
	 * Converts the EDataType: StopCondition to a String. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertStopConditionToString(StopCondition value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: StopCondition from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public StopCondition createStopConditionFromString(String value) {
		if (value == null) {
			return null;
		}
		return StopCondition.get(value);
	}

	/**
	 * Converts the EDataType: ScheduleType to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertScheduleTypeToString(ScheduleType value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: ScheduleType from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public ScheduleType createScheduleTypeFromString(String value) {
		if (value == null) {
			return null;
		}
		return ScheduleType.get(value);
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>TaskProperties</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class TaskPropertiesModelObject<E extends TaskProperties>
			extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PropertiesModelPackage.INSTANCE.getTaskPropertiesEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PropertiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.TASKPROPERTIES_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PropertiesModelPackage.TASKPROPERTIES_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PropertiesModelPackage.TASKPROPERTIES_FNAME_FEATURE_ID:
				return getTarget().getFname();
			case PropertiesModelPackage.TASKPROPERTIES_DNAME_FEATURE_ID:
				return getTarget().getDname();
			case PropertiesModelPackage.TASKPROPERTIES_TYPE_FEATURE_ID:
				return getTarget().getType();
			case PropertiesModelPackage.TASKPROPERTIES_CREATIONTIME_FEATURE_ID:
				return getTarget().getCreationTime();
			case PropertiesModelPackage.TASKPROPERTIES_USEINPLC_FEATURE_ID:
				return getTarget().isUseInPLC();
			case PropertiesModelPackage.TASKPROPERTIES_EXPTHESHOLD_FEATURE_ID:
				return getTarget().getExpTheshold();
			case PropertiesModelPackage.TASKPROPERTIES_EXPPERIOD_FEATURE_ID:
				return getTarget().getExpPeriod();
			case PropertiesModelPackage.TASKPROPERTIES_PRIORITY_FEATURE_ID:
				return getTarget().getPriority();
			case PropertiesModelPackage.TASKPROPERTIES_ACTIONS_FEATURE_ID:
				return getTarget().getActions();
			case PropertiesModelPackage.TASKPROPERTIES_FETCHING_FEATURE_ID:
				return getTarget().getFetching();
			case PropertiesModelPackage.TASKPROPERTIES_OPERATION_FEATURE_ID:
				return getTarget().getOperation();
			case PropertiesModelPackage.TASKPROPERTIES_SCHEDULE_FEATURE_ID:
				return getTarget().getSchedule();
			case PropertiesModelPackage.TASKPROPERTIES_SOURCES_FEATURE_ID:
				return getTarget().getSources();
			case PropertiesModelPackage.TASKPROPERTIES_TARGETS_FEATURE_ID:
				return getTarget().getTargets();
			case PropertiesModelPackage.TASKPROPERTIES_ALIASES_FEATURE_ID:
				return getTarget().getAliases();
			case PropertiesModelPackage.TASKPROPERTIES_FILTERS_FEATURE_ID:
				return getTarget().getFilters();
			case PropertiesModelPackage.TASKPROPERTIES_EVENTS_FEATURE_ID:
				return getTarget().getEvents();
			case PropertiesModelPackage.TASKPROPERTIES_VERSION_FEATURE_ID:
				return getTarget().getVersion();
			case PropertiesModelPackage.TASKPROPERTIES_VERSIONED_FEATURE_ID:
				return getTarget().isVersioned();
			case PropertiesModelPackage.TASKPROPERTIES_MAXVERSIONSCOUNT_FEATURE_ID:
				return getTarget().getMaxVersionsCount();
			case PropertiesModelPackage.TASKPROPERTIES_MAXSTORAGETIME_FEATURE_ID:
				return getTarget().getMaxStorageTime();
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
			case PropertiesModelPackage.TASKPROPERTIES_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_FNAME_FEATURE_ID:
				getTarget().setFname((String) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_DNAME_FEATURE_ID:
				getTarget().setDname((String) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_TYPE_FEATURE_ID:
				getTarget().setType((OperationType) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_CREATIONTIME_FEATURE_ID:
				getTarget().setCreationTime((Long) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_USEINPLC_FEATURE_ID:
				getTarget().setUseInPLC((Boolean) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_EXPTHESHOLD_FEATURE_ID:
				getTarget().setExpTheshold((Long) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_EXPPERIOD_FEATURE_ID:
				getTarget().setExpPeriod((Long) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_PRIORITY_FEATURE_ID:
				getTarget().setPriority((Long) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_ACTIONS_FEATURE_ID:
				getTarget().setActions((List<String>) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_FETCHING_FEATURE_ID:
				getTarget().setFetching((ObjectsFetchingProperties) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_OPERATION_FEATURE_ID:
				getTarget().setOperation((OperationProperties) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_SCHEDULE_FEATURE_ID:
				getTarget().setSchedule((ScheduleProperties) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_SOURCES_FEATURE_ID:
				getTarget().setSources((List<String>) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_TARGETS_FEATURE_ID:
				getTarget().setTargets((List<String>) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_ALIASES_FEATURE_ID:
				getTarget().setAliases((List<String>) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_FILTERS_FEATURE_ID:
				getTarget().setFilters((List<String>) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_EVENTS_FEATURE_ID:
				getTarget().setEvents((List<String>) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_VERSION_FEATURE_ID:
				getTarget().setVersion((Long) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_VERSIONED_FEATURE_ID:
				getTarget().setVersioned((Boolean) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_MAXVERSIONSCOUNT_FEATURE_ID:
				getTarget().setMaxVersionsCount((Long) value);
				return;
			case PropertiesModelPackage.TASKPROPERTIES_MAXSTORAGETIME_FEATURE_ID:
				getTarget().setMaxStorageTime((Long) value);
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

			case PropertiesModelPackage.TASKPROPERTIES_ACTIONS_FEATURE_ID:
				return getTarget().getActions().add((String) value);

			case PropertiesModelPackage.TASKPROPERTIES_SOURCES_FEATURE_ID:
				return getTarget().getSources().add((String) value);

			case PropertiesModelPackage.TASKPROPERTIES_TARGETS_FEATURE_ID:
				return getTarget().getTargets().add((String) value);

			case PropertiesModelPackage.TASKPROPERTIES_ALIASES_FEATURE_ID:
				return getTarget().getAliases().add((String) value);

			case PropertiesModelPackage.TASKPROPERTIES_FILTERS_FEATURE_ID:
				return getTarget().getFilters().add((String) value);

			case PropertiesModelPackage.TASKPROPERTIES_EVENTS_FEATURE_ID:
				return getTarget().getEvents().add((String) value);

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

			case PropertiesModelPackage.TASKPROPERTIES_ACTIONS_FEATURE_ID:
				return getTarget().getActions().remove(value);

			case PropertiesModelPackage.TASKPROPERTIES_SOURCES_FEATURE_ID:
				return getTarget().getSources().remove(value);

			case PropertiesModelPackage.TASKPROPERTIES_TARGETS_FEATURE_ID:
				return getTarget().getTargets().remove(value);

			case PropertiesModelPackage.TASKPROPERTIES_ALIASES_FEATURE_ID:
				return getTarget().getAliases().remove(value);

			case PropertiesModelPackage.TASKPROPERTIES_FILTERS_FEATURE_ID:
				return getTarget().getFilters().remove(value);

			case PropertiesModelPackage.TASKPROPERTIES_EVENTS_FEATURE_ID:
				return getTarget().getEvents().remove(value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '
	 * <em><b>ObjectsFetchingProperties</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ObjectsFetchingPropertiesModelObject<E extends ObjectsFetchingProperties>
			extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PropertiesModelPackage.INSTANCE
					.getObjectsFetchingPropertiesEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PropertiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FILESEXCLUDE_FEATURE_ID:
				return getTarget().getFilesExclude();
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FILESINCLUDE_FEATURE_ID:
				return getTarget().getFilesInclude();
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FOLDERSEXCLUDEMASKS_FEATURE_ID:
				return getTarget().getFoldersExcludeMasks();
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FOLDERSINCLUDEMASKS_FEATURE_ID:
				return getTarget().getFoldersIncludeMasks();
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
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FILESEXCLUDE_FEATURE_ID:
				getTarget().setFilesExclude((ObjectsFetchingProperties) value);
				return;
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FILESINCLUDE_FEATURE_ID:
				getTarget().setFilesInclude((ObjectsFetchingProperties) value);
				return;
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FOLDERSEXCLUDEMASKS_FEATURE_ID:
				getTarget().setFoldersExcludeMasks((List<String>) value);
				return;
			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FOLDERSINCLUDEMASKS_FEATURE_ID:
				getTarget().setFoldersIncludeMasks((List<String>) value);
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

			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FOLDERSEXCLUDEMASKS_FEATURE_ID:
				return getTarget().getFoldersExcludeMasks().add((String) value);

			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FOLDERSINCLUDEMASKS_FEATURE_ID:
				return getTarget().getFoldersIncludeMasks().add((String) value);
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

			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FOLDERSEXCLUDEMASKS_FEATURE_ID:
				return getTarget().getFoldersExcludeMasks().remove(value);

			case PropertiesModelPackage.OBJECTSFETCHINGPROPERTIES_FOLDERSINCLUDEMASKS_FEATURE_ID:
				return getTarget().getFoldersIncludeMasks().remove(value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>OperationProperties</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class OperationPropertiesModelObject<E extends OperationProperties>
			extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PropertiesModelPackage.INSTANCE
					.getOperationPropertiesEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PropertiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.OPERATIONPROPERTIES_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PropertiesModelPackage.OPERATIONPROPERTIES_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PropertiesModelPackage.OPERATIONPROPERTIES_COPYMODE_FEATURE_ID:
				return getTarget().getCopyMode();
			case PropertiesModelPackage.OPERATIONPROPERTIES_COPYDIRECTION_FEATURE_ID:
				return getTarget().getCopyDirection();
			case PropertiesModelPackage.OPERATIONPROPERTIES_DIFFCONDITION_FEATURE_ID:
				return getTarget().getDiffCondition();
			case PropertiesModelPackage.OPERATIONPROPERTIES_STOPCONDITION_FEATURE_ID:
				return getTarget().getStopCondition();
			case PropertiesModelPackage.OPERATIONPROPERTIES_CHECKFILESIZE_FEATURE_ID:
				return getTarget().isCheckFileSize();
			case PropertiesModelPackage.OPERATIONPROPERTIES_CHECKCREATIONTIME_FEATURE_ID:
				return getTarget().isCheckCreationTime();
			case PropertiesModelPackage.OPERATIONPROPERTIES_CHECKMODIFICATIONTIME_FEATURE_ID:
				return getTarget().isCheckModificationTime();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.OPERATIONPROPERTIES_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PropertiesModelPackage.OPERATIONPROPERTIES_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PropertiesModelPackage.OPERATIONPROPERTIES_COPYMODE_FEATURE_ID:
				getTarget().setCopyMode((CopyMode) value);
				return;
			case PropertiesModelPackage.OPERATIONPROPERTIES_COPYDIRECTION_FEATURE_ID:
				getTarget().setCopyDirection((CopyDirection) value);
				return;
			case PropertiesModelPackage.OPERATIONPROPERTIES_DIFFCONDITION_FEATURE_ID:
				getTarget().setDiffCondition((DiffCondition) value);
				return;
			case PropertiesModelPackage.OPERATIONPROPERTIES_STOPCONDITION_FEATURE_ID:
				getTarget().setStopCondition((StopCondition) value);
				return;
			case PropertiesModelPackage.OPERATIONPROPERTIES_CHECKFILESIZE_FEATURE_ID:
				getTarget().setCheckFileSize((Boolean) value);
				return;
			case PropertiesModelPackage.OPERATIONPROPERTIES_CHECKCREATIONTIME_FEATURE_ID:
				getTarget().setCheckCreationTime((Boolean) value);
				return;
			case PropertiesModelPackage.OPERATIONPROPERTIES_CHECKMODIFICATIONTIME_FEATURE_ID:
				getTarget().setCheckModificationTime((Boolean) value);
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

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ScheduleProperties</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class SchedulePropertiesModelObject<E extends ScheduleProperties>
			extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PropertiesModelPackage.INSTANCE
					.getSchedulePropertiesEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PropertiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.SCHEDULEPROPERTIES_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PropertiesModelPackage.SCHEDULEPROPERTIES_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PropertiesModelPackage.SCHEDULEPROPERTIES_ISRUNMISSING_FEATURE_ID:
				return getTarget().isIsRunMissing();
			case PropertiesModelPackage.SCHEDULEPROPERTIES_TYPE_FEATURE_ID:
				return getTarget().getType();
			case PropertiesModelPackage.SCHEDULEPROPERTIES_START_FEATURE_ID:
				return getTarget().getStart();
			case PropertiesModelPackage.SCHEDULEPROPERTIES_DAYS_FEATURE_ID:
				return getTarget().getDays();
			case PropertiesModelPackage.SCHEDULEPROPERTIES_PERIOD_FEATURE_ID:
				return getTarget().getPeriod();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.SCHEDULEPROPERTIES_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PropertiesModelPackage.SCHEDULEPROPERTIES_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PropertiesModelPackage.SCHEDULEPROPERTIES_ISRUNMISSING_FEATURE_ID:
				getTarget().setIsRunMissing((Boolean) value);
				return;
			case PropertiesModelPackage.SCHEDULEPROPERTIES_TYPE_FEATURE_ID:
				getTarget().setType((ScheduleType) value);
				return;
			case PropertiesModelPackage.SCHEDULEPROPERTIES_START_FEATURE_ID:
				getTarget().setStart((Long) value);
				return;
			case PropertiesModelPackage.SCHEDULEPROPERTIES_DAYS_FEATURE_ID:
				getTarget().setDays((Long) value);
				return;
			case PropertiesModelPackage.SCHEDULEPROPERTIES_PERIOD_FEATURE_ID:
				getTarget().setPeriod((Long) value);
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

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Log</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class LogModelObject<E extends Log> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PropertiesModelPackage.INSTANCE.getLogEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PropertiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.LOG_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PropertiesModelPackage.LOG_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PropertiesModelPackage.LOG_FILEPATH_FEATURE_ID:
				return getTarget().getFilePath();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.LOG_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PropertiesModelPackage.LOG_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PropertiesModelPackage.LOG_FILEPATH_FEATURE_ID:
				getTarget().setFilePath((String) value);
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

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>CustomAction</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class CustomActionModelObject<E extends CustomAction> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PropertiesModelPackage.INSTANCE.getCustomActionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PropertiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.CUSTOMACTION_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PropertiesModelPackage.CUSTOMACTION_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PropertiesModelPackage.CUSTOMACTION_TYPE_FEATURE_ID:
				return getTarget().getType();
			case PropertiesModelPackage.CUSTOMACTION_WAIT_FEATURE_ID:
				return getTarget().isWait();
			case PropertiesModelPackage.CUSTOMACTION_EVENT_FEATURE_ID:
				return getTarget().getEvent();
			case PropertiesModelPackage.CUSTOMACTION_PARAMS_FEATURE_ID:
				return getTarget().getParams();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.CUSTOMACTION_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PropertiesModelPackage.CUSTOMACTION_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PropertiesModelPackage.CUSTOMACTION_TYPE_FEATURE_ID:
				getTarget().setType((ActionType) value);
				return;
			case PropertiesModelPackage.CUSTOMACTION_WAIT_FEATURE_ID:
				getTarget().setWait((Boolean) value);
				return;
			case PropertiesModelPackage.CUSTOMACTION_EVENT_FEATURE_ID:
				getTarget().setEvent((ActionRunTime) value);
				return;
			case PropertiesModelPackage.CUSTOMACTION_PARAMS_FEATURE_ID:
				getTarget().setParams((String) value);
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

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>FileFilterProperties</b></em>
	 * '.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class FileFilterPropertiesModelObject<E extends FileFilterProperties>
			extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PropertiesModelPackage.INSTANCE
					.getFileFilterPropertiesEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PropertiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.FILEFILTERPROPERTIES_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PropertiesModelPackage.FILEFILTERPROPERTIES_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PropertiesModelPackage.FILEFILTERPROPERTIES_ATTRIBUTES_FEATURE_ID:
				return getTarget().getAttributes();
			case PropertiesModelPackage.FILEFILTERPROPERTIES_MASKS_FEATURE_ID:
				return getTarget().getMasks();
			case PropertiesModelPackage.FILEFILTERPROPERTIES_CREATION_FEATURE_ID:
				return getTarget().getCreation();
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
			case PropertiesModelPackage.FILEFILTERPROPERTIES_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PropertiesModelPackage.FILEFILTERPROPERTIES_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PropertiesModelPackage.FILEFILTERPROPERTIES_ATTRIBUTES_FEATURE_ID:
				getTarget().setAttributes((Long) value);
				return;
			case PropertiesModelPackage.FILEFILTERPROPERTIES_MASKS_FEATURE_ID:
				getTarget().setMasks((List<String>) value);
				return;
			case PropertiesModelPackage.FILEFILTERPROPERTIES_CREATION_FEATURE_ID:
				getTarget().setCreation((IntervalT) value);
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

			case PropertiesModelPackage.FILEFILTERPROPERTIES_MASKS_FEATURE_ID:
				return getTarget().getMasks().add((String) value);

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

			case PropertiesModelPackage.FILEFILTERPROPERTIES_MASKS_FEATURE_ID:
				return getTarget().getMasks().remove(value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>IntervalT</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class IntervalTModelObject<E extends IntervalT> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PropertiesModelPackage.INSTANCE.getIntervalTEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PropertiesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.INTERVALT_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PropertiesModelPackage.INTERVALT_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PropertiesModelPackage.INTERVALT_LOWER_BOUND_FEATURE_ID:
				return getTarget().getLower_bound();
			case PropertiesModelPackage.INTERVALT_UPPER_BOUND_FEATURE_ID:
				return getTarget().getUpper_bound();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PropertiesModelPackage.INTERVALT_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PropertiesModelPackage.INTERVALT_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PropertiesModelPackage.INTERVALT_LOWER_BOUND_FEATURE_ID:
				getTarget().setLower_bound((Long) value);
				return;
			case PropertiesModelPackage.INTERVALT_UPPER_BOUND_FEATURE_ID:
				getTarget().setUpper_bound((Long) value);
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

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}
}