package org.novosoft.task.base.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>ErrorID</b></em>
 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum ErrorID {

	/**
	 * The enum: SUCCESS <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	SUCCESS(0, "SUCCESS", "SUCCESS") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isSUCCESS() {
			return true;
		}
	},
	/**
	 * The enum: FAILED <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	FAILED(1, "FAILED", "FAILED") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isFAILED() {
			return true;
		}
	},
	/**
	 * The enum: CRITICAL <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CRITICAL(2, "CRITICAL", "CRITICAL") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isCRITICAL() {
			return true;
		}
	},
	/**
	 * The enum: PATH_NOT_FOUND <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	PATH_NOT_FOUND(3, "PATH_NOT_FOUND", "PATH_NOT_FOUND") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isPATH_NOT_FOUND() {
			return true;
		}
	},
	/**
	 * The enum: ACCESS_DENIED <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ACCESS_DENIED(4, "ACCESS_DENIED", "ACCESS_DENIED") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isACCESS_DENIED() {
			return true;
		}
	},
	/**
	 * The enum: HANDLE_EOF <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	HANDLE_EOF(5, "HANDLE_EOF", "HANDLE_EOF") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isHANDLE_EOF() {
			return true;
		}
	},
	/**
	 * The enum: NOT_SUPPORTED <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	NOT_SUPPORTED(6, "NOT_SUPPORTED", "NOT_SUPPORTED") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isNOT_SUPPORTED() {
			return true;
		}
	},
	/**
	 * The enum: DISK_FULL <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DISK_FULL(7, "DISK_FULL", "DISK_FULL") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDISK_FULL() {
			return true;
		}
	},
	/**
	 * The enum: SESSION_LIMIT <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	SESSION_LIMIT(8, "SESSION_LIMIT", "SESSION_LIMIT") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isSESSION_LIMIT() {
			return true;
		}
	},
	/**
	 * The enum: STOPPED <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	STOPPED(9, "STOPPED", "STOPPED") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isSTOPPED() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>ErrorID</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ErrorID[] VALUES_ARRAY = new ErrorID[] { SUCCESS,
			FAILED, CRITICAL, PATH_NOT_FOUND, ACCESS_DENIED, HANDLE_EOF,
			NOT_SUPPORTED, DISK_FULL, SESSION_LIMIT, STOPPED };

	/**
	 * A public read-only list of all the '<em><b>ErrorID</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ErrorID> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ErrorID</b></em>' literal with the specified literal
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the ErrorID, the literal enum class
	 * @generated
	 */
	public static ErrorID get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorID result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ErrorID</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the ErrorID, the literal enum class
	 * @generated
	 */
	public static ErrorID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ErrorID</b></em>' literal with the specified integer
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the ErrorID, the literal enum
	 * @generated
	 */
	public static ErrorID get(int value) {
		for (ErrorID enumInstance : VALUES_ARRAY) {
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
	private ErrorID(int value, String name, String literal) {
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
	public boolean isSUCCESS() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isFAILED() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isCRITICAL() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isPATH_NOT_FOUND() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isACCESS_DENIED() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isHANDLE_EOF() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isNOT_SUPPORTED() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isDISK_FULL() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isSESSION_LIMIT() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isSTOPPED() {
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
