package edu.wctc.validator.decorator;

import javax.swing.JTextField;

/**
 * This class represents a decorated JTextField that provides validation for
 * inputs that are required.
 *
 * @author jlombardo
 */
public class RequiredFieldDecorator extends JTextFieldValidatorDecorator {

    private JTextFieldValidatorDecorator textComponent;
    private String errorMsg;

    /**
     * Custom constructor to decorate a component.
     *
     * @param textComponent - the object to be decorated. Note that the object's
     * setName method must be called first if the name of the object should be
     * included in any error message.
     */
    public RequiredFieldDecorator(JTextFieldValidatorDecorator textComponent) {
        this.textComponent = textComponent;
        errorMsg = "The field " + textComponent.getName() + " is required.";
    }

    @Override
    public boolean isValidInput() {

        boolean valid;

        if (getText() == null
                || getText().length() > 0) {
            valid = true;
        } else {
            valid = false;
        }

        if (textComponent.getClass().getSimpleName().equals("JTextField")) {
            valid = true;
        } else if (textComponent.isValidInput() && valid) {
            return true;
        } else {
            return false;
        }

        return valid;
    }

    @Override
    public String getErrorMsg() {
        return errorMsg;
    }
}
