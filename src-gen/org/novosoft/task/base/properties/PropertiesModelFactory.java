package org.novosoft.task.base.properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;

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
		throw new IllegalArgumentException("The EClass '" + eClass
				+ "' is not defined in this EPackage");
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
		case PropertiesModelPackage.STOPCONDITION_CLASSIFIER_ID:
			return createStopConditionFromString(value);
		case PropertiesModelPackage.DIFFCONDITION_CLASSIFIER_ID:
			return createDiffConditionFromString(value);
		case PropertiesModelPackage.SCHEDULETYPE_CLASSIFIER_ID:
			return createScheduleTypeFromString(value);
		case PropertiesModelPackage.ERRORID_CLASSIFIER_ID:
			return createErrorIDFromString(value);
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
		case PropertiesModelPackage.STOPCONDITION_CLASSIFIER_ID:
			return convertStopConditionToString((StopCondition) value);
		case PropertiesModelPackage.DIFFCONDITION_CLASSIFIER_ID:
			return convertDiffConditionToString((DiffCondition) value);
		case PropertiesModelPackage.SCHEDULETYPE_CLASSIFIER_ID:
			return convertScheduleTypeToString((ScheduleType) value);
		case PropertiesModelPackage.ERRORID_CLASSIFIER_ID:
			return convertErrorIDToString((ErrorID) value);
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
	 * Converts the EDataType: ErrorID to a String. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertErrorIDToString(ErrorID value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: ErrorID from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public ErrorID createErrorIDFromString(String value) {
		if (value == null) {
			return null;
		}
		return ErrorID.get(value);
	}
}