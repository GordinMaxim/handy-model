package org.novosoft.task.base.properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

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
	public static final int OPERATIONTYPE_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTIONTYPE_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTIONRUNTIME_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int COPYMODE_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int COPYDIRECTION_CLASSIFIER_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STOPCONDITION_CLASSIFIER_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DIFFCONDITION_CLASSIFIER_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHEDULETYPE_CLASSIFIER_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ERRORID_CLASSIFIER_ID = 8;

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

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier

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
				StopCondition.class, modelPackage.getStopConditionEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				DiffCondition.class, modelPackage.getDiffConditionEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ScheduleType.class, modelPackage.getScheduleTypeEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(ErrorID.class,
				modelPackage.getErrorIDEEnum(), modelPackage);

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
	 * Returns the EEnum '<em><b>ErrorID</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '<em><b>ErrorID</b></em>'
	 * @generated
	 */
	public EEnum getErrorIDEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				ERRORID_CLASSIFIER_ID);
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
		case STOPCONDITION_CLASSIFIER_ID:
			return StopCondition.class;
		case DIFFCONDITION_CLASSIFIER_ID:
			return DiffCondition.class;
		case SCHEDULETYPE_CLASSIFIER_ID:
			return ScheduleType.class;
		case ERRORID_CLASSIFIER_ID:
			return ErrorID.class;
		default:
			throw new IllegalArgumentException("The EClassifier '"
					+ eClassifier + "' is not defined in this EPackage");
		}
	}
}
