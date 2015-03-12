package org.novosoft.task.base.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>OperationType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum OperationType {

	/**
	 * The enum: OTBACKUPFULL <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	OTBACKUPFULL(0, "otBackupFull", "otBackupFull") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isOtBackupFull() {
			return true;
		}
	},
	/**
	 * The enum: OTBACKUPINCREMENTAL <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	OTBACKUPINCREMENTAL(1, "otBackupIncremental", "otBackupIncremental") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isOtBackupIncremental() {
			return true;
		}
	},
	/**
	 * The enum: OTBACKUPDIFFERENTIAL <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	OTBACKUPDIFFERENTIAL(2, "otBackupDifferential", "otBackupDifferential") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isOtBackupDifferential() {
			return true;
		}
	},
	/**
	 * The enum: OTRESTOREFULL <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	OTRESTOREFULL(3, "otRestoreFull", "") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isOtRestoreFull() {
			return true;
		}
	},
	/**
	 * The enum: OTRESTOREINCREMENTAL <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	OTRESTOREINCREMENTAL(4, "otRestoreIncremental", "otRestoreIncremental") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isOtRestoreIncremental() {
			return true;
		}
	},
	/**
	 * The enum: OTSYNCHRONIZE <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	OTSYNCHRONIZE(5, "otSynchronize", "otSynchronize") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isOtSynchronize() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>OperationType</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final OperationType[] VALUES_ARRAY = new OperationType[] {
			OTBACKUPFULL, OTBACKUPINCREMENTAL, OTBACKUPDIFFERENTIAL,
			OTRESTOREFULL, OTRESTOREINCREMENTAL, OTSYNCHRONIZE };

	/**
	 * A public read-only list of all the '<em><b>OperationType</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<OperationType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OperationType</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the OperationType, the literal enum class
	 * @generated
	 */
	public static OperationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OperationType</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the OperationType, the literal enum class
	 * @generated
	 */
	public static OperationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OperationType</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the OperationType, the literal enum
	 * @generated
	 */
	public static OperationType get(int value) {
		for (OperationType enumInstance : VALUES_ARRAY) {
			if (enumInstance.getValue() == value) {
				return enumInstance;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private OperationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isOtBackupFull() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isOtBackupIncremental() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isOtBackupDifferential() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isOtRestoreFull() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isOtRestoreIncremental() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isOtSynchronize() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the name
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the literal of this enum instance
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the literal value of the enumerator, which is its string
	 *         representation.
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
