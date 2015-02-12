package org.novosoft.task.base.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>ScheduleType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum ScheduleType {

	/**
	 * The enum: STONESHOT <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	STONESHOT(0, "stOneShot", "stOneShot") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isStOneShot() {
			return true;
		}
	},
	/**
	 * The enum: STEVERYDAY <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	STEVERYDAY(0, "stEveryday", "stEveryday") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isStEveryday() {
			return true;
		}
	},
	/**
	 * The enum: STWEEKDAYS <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	STWEEKDAYS(0, "stWeekDays", "stWeekDays") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isStWeekDays() {
			return true;
		}
	},
	/**
	 * The enum: STMONTHDAYS <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	STMONTHDAYS(0, "stMonthDays", "stMonthDays") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isStMonthDays() {
			return true;
		}
	},
	/**
	 * The enum: STPERIOD <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	STPERIOD(0, "stPeriod", "stPeriod") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isStPeriod() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>ScheduleType</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ScheduleType[] VALUES_ARRAY = new ScheduleType[] {
			STONESHOT, STEVERYDAY, STWEEKDAYS, STMONTHDAYS, STPERIOD };

	/**
	 * A public read-only list of all the '<em><b>ScheduleType</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ScheduleType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ScheduleType</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the ScheduleType, the literal enum class
	 * @generated
	 */
	public static ScheduleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScheduleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ScheduleType</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the ScheduleType, the literal enum class
	 * @generated
	 */
	public static ScheduleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScheduleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ScheduleType</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the ScheduleType, the literal enum
	 * @generated
	 */
	public static ScheduleType get(int value) {
		for (ScheduleType enumInstance : VALUES_ARRAY) {
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
	private ScheduleType(int value, String name, String literal) {
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
	public boolean isStOneShot() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isStEveryday() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isStWeekDays() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isStMonthDays() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isStPeriod() {
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
