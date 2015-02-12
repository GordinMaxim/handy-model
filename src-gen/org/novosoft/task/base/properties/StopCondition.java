package org.novosoft.task.base.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>StopCondition</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum StopCondition {

	/**
	 * The enum: SCONCRITICALERROR <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	SCONCRITICALERROR(0, "scOnCriticalError", "") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isScOnCriticalError() {
			return true;
		}
	},
	/**
	 * The enum: SCONANYERROR <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	SCONANYERROR(0, "scOnAnyError", "scOnAnyError") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isScOnAnyError() {
			return true;
		}
	},
	/**
	 * The enum: SCIGNOREALLERRORS <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	SCIGNOREALLERRORS(0, "scIgnoreAllErrors", "scIgnoreAllErrors") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isScIgnoreAllErrors() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>StopCondition</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final StopCondition[] VALUES_ARRAY = new StopCondition[] {
			SCONCRITICALERROR, SCONANYERROR, SCIGNOREALLERRORS };

	/**
	 * A public read-only list of all the '<em><b>StopCondition</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<StopCondition> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>StopCondition</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the StopCondition, the literal enum class
	 * @generated
	 */
	public static StopCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StopCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>StopCondition</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the StopCondition, the literal enum class
	 * @generated
	 */
	public static StopCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StopCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>StopCondition</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the StopCondition, the literal enum
	 * @generated
	 */
	public static StopCondition get(int value) {
		for (StopCondition enumInstance : VALUES_ARRAY) {
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
	private StopCondition(int value, String name, String literal) {
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
	public boolean isScOnCriticalError() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isScOnAnyError() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isScIgnoreAllErrors() {
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
