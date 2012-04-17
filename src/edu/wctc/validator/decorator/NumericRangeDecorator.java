package edu.wctc.validator.decorator;

import javax.swing.JTextField;

/**
 * This class represents a decorated JTextField that provides validation for
 * inputs between a given numeric range.
 * 
 * @author jlombardo
 */
public class NumericRangeDecorator extends ValidatedJTextFieldDecorator {
	private ValidatedJTextField textComponent;
	private String errorMsg;
	private int startRange;
	private int endRange;

	/**
	 * Custom constructor to decorate a component.
	 * 
	 * @param textComponent
	 *            - the object to be decorated. Note that the object's setName
	 *            method must be called first if the name of the object should
	 *            be included in any error message.
	 * @param startRange
	 *            - the start of the numeric range, inclusive.
	 * @param endRange
	 *            - the end of the numeric range, inclusive.
	 */
	public NumericRangeDecorator(ValidatedJTextField textComponent,
			int startRange, int endRange) {

		this.textComponent = textComponent;
		this.startRange = startRange;
		this.endRange = endRange;
		errorMsg = "The field " + textComponent.getName()
				+ " requires a whole number between 20 and 50 inclusive.";
	}

	@Override
	public boolean isValid() {
		super.isValid();
		if (!(textComponent == null)) {
			System.out.println("got in is valid method");
		}

		return true;
	}

	@Override
	public boolean isValidInput() {

		if (!textComponent.isValidInput() || getText().length() == 0) {
			return false;
		}

		int number = 0;

		try {
			/*
			 * This will throw an exception under a few scenarios:
			 * 
			 * 1. getText returns an empty string - can't happen since its
			 * handled above.
			 * 
			 * 2. getText returns a non-integer - this should fail since this is
			 * a numeric validation.
			 */
			number = Integer.parseInt(getText());
		} catch (RuntimeException e) {
			return false;
		}

		if (number >= startRange && number <= endRange) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String getErrorMsg() {
		return errorMsg;
	}
}
