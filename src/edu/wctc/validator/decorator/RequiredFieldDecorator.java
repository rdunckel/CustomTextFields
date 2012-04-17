package edu.wctc.validator.decorator;

import javax.swing.JTextField;

/**
 * This class represents a decorated JTextField that provides validation for
 * inputs that are required.
 * 
 * @author jlombardo
 */
public class RequiredFieldDecorator extends ValidatedJTextFieldDecorator {
	private ValidatedJTextField textComponent;
	private String errorMsg;

	/**
	 * Custom constructor to decorate a component.
	 * 
	 * @param textComponent
	 *            - the object to be decorated. Note that the object's setName
	 *            method must be called first if the name of the object should
	 *            be included in any error message.
	 */
	public RequiredFieldDecorator(ValidatedJTextField textComponent) {
		this.textComponent = textComponent;
		errorMsg = textComponent.getName() + ": field is required.";
	}

	@Override
	public boolean isValid() {

		boolean valid = super.isValid();

		if (!(textComponent == null)) {
			if (textComponent.isValid() && isValidInput()) {
				valid = true;
			} else {
				valid = false;
			}
		}

		return valid;

	}

	@Override
	public boolean isValidInput() {

		// if (!textComponent.isValidInput()) {
		// return false;
		// }

		if (getText() == null || getText().length() > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String getName() {

		boolean valid = false;
		String name = null;

		if (textComponent.isValid() && isValidInput()) {
			valid = true;
		}

		if (valid) {
			name = super.getName();
		} else {
			name = super.getName() + ", " + getErrorMsg();
		}

		return name;

	}

	@Override
	public String getErrorMsg() {
		return errorMsg;
	}
}
