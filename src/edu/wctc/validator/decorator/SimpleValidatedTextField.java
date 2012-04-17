package edu.wctc.validator.decorator;

import javax.swing.text.Document;

public class SimpleValidatedTextField extends ValidatedJTextField {

	public SimpleValidatedTextField() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SimpleValidatedTextField(Document doc, String text, int columns) {
		super(doc, text, columns);
		// TODO Auto-generated constructor stub
	}

	public SimpleValidatedTextField(int columns) {
		super(columns);
		// TODO Auto-generated constructor stub
	}

	public SimpleValidatedTextField(String text, int columns) {
		super(text, columns);
		// TODO Auto-generated constructor stub
	}

	public SimpleValidatedTextField(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValidInput() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getErrorMsg() {
		// TODO Auto-generated method stub
		return null;
	}

}
