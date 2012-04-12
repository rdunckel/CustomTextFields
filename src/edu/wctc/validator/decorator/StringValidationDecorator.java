package edu.wctc.validator.decorator;

/**
 * Interface for building decorator components, used to validate the text
 * content of strings.
 *
 * @author Ryan Dunckel <rdunckel@my.wctc.edu>
 */
public interface StringValidationDecorator {

    public abstract boolean isValid();

    public abstract String getErrorMessage();
}
