package edu.wctc.validator.decorator;

import javax.swing.JTextField;

/**
 * TBD.
 *
 * @author Ryan Dunckel <rdunckel@my.wctc.edu>
 */
public abstract class ValidatedJTextField extends JTextField {

    public abstract boolean isValidInput();

    public abstract String getErrorMsg();
}
