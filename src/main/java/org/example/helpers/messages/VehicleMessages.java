package org.example.helpers.messages;

public enum VehicleMessages {
    INVALID_VEHICLE_ID("We do not accept negative ids"),
    LENGTH_ERROR("Error in the length of the characters"),
    INVALID_CHARACTERS("INVALID - Check the entered characters"),
    NEGATIVE_VALUE("The entered value cannot be less than 0"),
    MILEAGE_EXCEEDS("The mileage cannot be greater than 100"),
    AUTONOMY_EXCEEDS("The autonomy cannot be greater than 72"),
    LOAD_CAPACITY_EXCEEDS("The load capacity cannot be greater than 1,000"),
    DATE_FORMAT_ERROR("The date format is invalid"),
    ;

    private String errorMessage;

    VehicleMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
