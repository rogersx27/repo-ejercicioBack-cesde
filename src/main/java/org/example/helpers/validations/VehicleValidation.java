package org.example.helpers.validations;

import org.example.helpers.generals.RegexValidator;
import org.example.helpers.messages.VehicleMessages;
import org.example.helpers.messages.RegexExpressions;

public class VehicleValidation {

    private final RegexValidator regexValidator = new RegexValidator();

    public boolean validateId(Integer id) throws Exception {
        if (id < 0) {
            throw new Exception(VehicleMessages.INVALID_VEHICLE_ID.getErrorMessage());
        }
        return true;
    }

    public boolean validateBrand(String brand) throws Exception {
        if (!regexValidator.validateRegex(brand, RegexExpressions.ONLY_LETTERS_AND_SPACES.getPattern())) {
            throw new Exception(VehicleMessages.INVALID_CHARACTERS.getErrorMessage());
        }
        if (brand.length() > 50) {
            throw new Exception(VehicleMessages.LENGTH_ERROR.getErrorMessage());
        }
        return true;
    }

    public boolean validateModel(String model) throws Exception {
        if (!regexValidator.validateRegex(model, RegexExpressions.DATE_MM_YY.getPattern())) {
            throw new Exception(VehicleMessages.DATE_FORMAT_ERROR.getErrorMessage());
        }
        return true;
    }

    public boolean validateMileage(Double mileage) throws Exception {
        if (mileage < 0) {
            throw new Exception(VehicleMessages.NEGATIVE_VALUE.getErrorMessage());
        }
        if (mileage > 100000) {
            throw new Exception(VehicleMessages.MILEAGE_EXCEEDS.getErrorMessage());
        }
        return true;
    }

    public boolean validateColor(String color) throws Exception {
        if (!regexValidator.validateRegex(color, RegexExpressions.ONLY_LETTERS_AND_SPACES.getPattern())) {
            throw new Exception(VehicleMessages.INVALID_CHARACTERS.getErrorMessage());
        }
        if (color.length() > 20) {
            throw new Exception(VehicleMessages.LENGTH_ERROR.getErrorMessage());
        }
        return true;
    }

    public boolean validateDescription(String description) throws Exception {
        if (!regexValidator.validateRegex(description, RegexExpressions.ONLY_LETTERS_AND_SPACES.getPattern())) {
            throw new Exception(VehicleMessages.INVALID_CHARACTERS.getErrorMessage());
        }
        if (description.length() > 100) {
            throw new Exception(VehicleMessages.LENGTH_ERROR.getErrorMessage());
        }
        return true;
    }

    public boolean validateType(String type) throws Exception {
        if (!regexValidator.validateRegex(type, RegexExpressions.LETTERS_WITHOUT_SPACES.getPattern())) {
            throw new Exception(VehicleMessages.INVALID_CHARACTERS.getErrorMessage());
        }
        return true;
    }

    public boolean validateAutonomy(Integer autonomy) throws Exception {
        if (autonomy < 0) {
            throw new Exception(VehicleMessages.NEGATIVE_VALUE.getErrorMessage());
        }
        if (autonomy > 72) {
            throw new Exception(VehicleMessages.AUTONOMY_EXCEEDS.getErrorMessage());
        }
        return true;
    }

    public boolean validateLoadCapacity(Double loadCapacity) throws Exception {
        if (loadCapacity < 0) {
            throw new Exception(VehicleMessages.NEGATIVE_VALUE.getErrorMessage());
        }
        if (loadCapacity > 1000) {
            throw new Exception(VehicleMessages.LOAD_CAPACITY_EXCEEDS.getErrorMessage());
        }
        return true;
    }

    public boolean validateAppraisal(Integer appraisal) throws Exception {
        if (appraisal < 0) {
            throw new Exception(VehicleMessages.NEGATIVE_VALUE.getErrorMessage());
        }
        return true;
    }
}
