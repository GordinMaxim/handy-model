package org.novosoft.task.base.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>ActionRunTime</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum ActionRunTime {

	/**
	 * The enum: CAONOPERATIONSTART <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	CAONOPERATIONSTART(0, "caOnOperationStart", "caOnOperationStart") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isCaOnOperationStart() {
			return true;
		}
	},
	/**
	 * The enum: CAONOPERATIONFINISH <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	CAONOPERATIONFINISH(1, "caOnOperationFinish", "caOnOperationFinish") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isCaOnOperationFinish() {
			return true;
		}
	},
	/**
	 * The enum: CAONOPERATIONFAILURE <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	CAONOPERATIONFAILURE(2, "caOnOperationFailure", "caOnOperationFailure") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isCaOnOperationFailure() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>ActionRunTime</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ActionRunTime[] VALUES_ARRAY = new ActionRunTime[] {
			CAONOPERATIONSTART, CAONOPERATIONFINISH, CAONOPERATIONFAILURE };

	/**
	 * A public read-only list of all the '<em><b>ActionRunTime</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ActionRunTime> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ActionRunTime</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the ActionRunTime, the literal enum class
	 * @generated
	 */
	public static ActionRunTime get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionRunTime result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ActionRunTime</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the ActionRunTime, the literal enum class
	 * @generated
	 */
	public static ActionRunTime getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionRunTime result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ActionRunTime</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the ActionRunTime, the literal enum
	 * @generated
	 */
	public static ActionRunTime get(int value) {
		for (ActionRunTime enumInstance : VALUES_ARRAY) {
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
	private ActionRunTime(int value, String name, String literal) {
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
	public boolean isCaOnOperationStart() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isCaOnOperationFinish() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isCaOnOperationFailure() {
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
