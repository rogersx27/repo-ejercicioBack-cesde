package org.example.helpers.messages;

public enum RegexExpressions {

    ONLY_LETTERS_AND_SPACES("^[a-zA-Z\\s]*$", "Allows only letters and spaces"),
    LETTERS_WITHOUT_SPACES("^[a-zA-Z]+$", "Allows only letters without spaces"),
    DATE_MM_YY("^(0[1-9]|1[0-2])-\\d{2}$", "Validates date in MM-YY format")
    ;

    private final String pattern;
    private final String description;

    RegexExpressions(String pattern, String description) {
        this.pattern = pattern;
        this.description = description;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDescription() {
        return description;
    }
}
