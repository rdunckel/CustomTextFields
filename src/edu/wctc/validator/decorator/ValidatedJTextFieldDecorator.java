package edu.wctc.validator.decorator;

/**
 * This class serves as a general contract for any JTextField components that
 * are decorated for validation.
 * 
 * @author Ryan Dunckel
 */
public abstract class ValidatedJTextFieldDecorator extends ValidatedJTextField {

	public boolean isValid() {
		return super.isValid();
	}

	public abstract boolean isValidInput();

	public abstract String getErrorMsg();
}
