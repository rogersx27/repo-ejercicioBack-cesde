package org.example.helpers.messages;

public enum MerchandiseMessages {
    INVALID_MERCHANDISE_ID("We do not accept negative ids"),
    INVALID_CHARACTERS("INVALID - Check the entered characters"),
    LENGTH_ERROR("Error in the length of the characters"),
    NEGATIVE_VALUE("The entered value cannot be less than 0"),
    OCCUPIED_VOLUME_EXCEEDS("The occupied volume cannot be greater than 100"),
    WEIGHT_EXCEEDS("The weight cannot be greater than 1,000")
    ;

    private String errorMessage;

    MerchandiseMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
