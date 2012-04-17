package edu.wctc.validator.decorator;

import javax.swing.JTextField;
import javax.swing.text.Document;

public abstract class ValidatedJTextField extends JTextField {

	public ValidatedJTextField() {
		super();
	}

	public ValidatedJTextField(Document doc, String text, int columns) {
		super(doc, text, columns);
	}

	public ValidatedJTextField(int columns) {
		super(columns);
	}

	public ValidatedJTextField(String text, int columns) {
		super(text, columns);
	}

	public ValidatedJTextField(String text) {
		super(text);
	}

	public boolean isValid() {
		return super.isValid();
	}

	public abstract boolean isValidInput();

	public abstract String getErrorMsg();

}
