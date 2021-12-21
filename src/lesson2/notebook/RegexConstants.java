package lesson2.notebook;

/**
 * Represents regex constants for validating notebook fields.
 */
public interface RegexConstants {
    /**
     * Regex to validate name.
     */
    String REGEX_NAME = "^([a-z]|[A-Z]){1,20}";
    /**
     * Regex to validate second name
     */
    String REGEX_SECOND_NAME = "^([a-z]|[A-Z]| ){1,20}";
    /**
     * Regex to validate surname.
     */
    String REGEX_SURNAME = "^([a-z]|[A-Z]){1,20}";

    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";

}
