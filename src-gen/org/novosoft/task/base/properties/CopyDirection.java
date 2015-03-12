package org.novosoft.task.base.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>CopyDirection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum CopyDirection {

	/**
	 * The enum: DIRECT <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DIRECT(0, "Direct", "Direct") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDirect() {
			return true;
		}
	},
	/**
	 * The enum: REVERSE <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	REVERSE(1, "Reverse", "Reverse") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isReverse() {
			return true;
		}
	},
	/**
	 * The enum: BIDIRECTIONAL <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	BIDIRECTIONAL(2, "Bidirectional", "Bidirectional") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isBidirectional() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>CopyDirection</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final CopyDirection[] VALUES_ARRAY = new CopyDirection[] {
			DIRECT, REVERSE, BIDIRECTIONAL };

	/**
	 * A public read-only list of all the '<em><b>CopyDirection</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<CopyDirection> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CopyDirection</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the CopyDirection, the literal enum class
	 * @generated
	 */
	public static CopyDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CopyDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CopyDirection</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the CopyDirection, the literal enum class
	 * @generated
	 */
	public static CopyDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CopyDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CopyDirection</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the CopyDirection, the literal enum
	 * @generated
	 */
	public static CopyDirection get(int value) {
		for (CopyDirection enumInstance : VALUES_ARRAY) {
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
	private CopyDirection(int value, String name, String literal) {
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
	public boolean isDirect() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isReverse() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isBidirectional() {
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
