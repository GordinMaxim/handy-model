package org.novosoft.task.base.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>DiffCondition</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum DiffCondition {

	/**
	 * The enum: DCNEWER <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DCNEWER(0, "dcNewer", "dcNewer") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDcNewer() {
			return true;
		}
	},
	/**
	 * The enum: DCOLDER <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DCOLDER(0, "dcOlder", "dcOlder") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDcOlder() {
			return true;
		}
	},
	/**
	 * The enum: DCSMALLER <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DCSMALLER(0, "dcSmaller", "dcSmaller") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDcSmaller() {
			return true;
		}
	},
	/**
	 * The enum: DCLARGER <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DCLARGER(0, "dcLarger", "dcLarger") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDcLarger() {
			return true;
		}
	},
	/**
	 * The enum: DCNEVER <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DCNEVER(0, "dcNever", "") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDcNever() {
			return true;
		}
	},
	/**
	 * The enum: DCALWAYS <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DCALWAYS(0, "dcAlways", "dcAlways") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDcAlways() {
			return true;
		}
	},
	/**
	 * The enum: DCCHANGED <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DCCHANGED(0, "dcChanged", "dcChanged") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDcChanged() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>DiffCondition</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final DiffCondition[] VALUES_ARRAY = new DiffCondition[] {
			DCNEWER, DCOLDER, DCSMALLER, DCLARGER, DCNEVER, DCALWAYS, DCCHANGED };

	/**
	 * A public read-only list of all the '<em><b>DiffCondition</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<DiffCondition> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DiffCondition</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the DiffCondition, the literal enum class
	 * @generated
	 */
	public static DiffCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiffCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DiffCondition</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the DiffCondition, the literal enum class
	 * @generated
	 */
	public static DiffCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiffCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DiffCondition</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the DiffCondition, the literal enum
	 * @generated
	 */
	public static DiffCondition get(int value) {
		for (DiffCondition enumInstance : VALUES_ARRAY) {
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
	private DiffCondition(int value, String name, String literal) {
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
	public boolean isDcNewer() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isDcOlder() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isDcSmaller() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isDcLarger() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isDcNever() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isDcAlways() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isDcChanged() {
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
