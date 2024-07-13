package org.example.helpers.validations;

import org.example.helpers.generals.RegexValidator;
import org.example.helpers.messages.MerchandiseMessages;
import org.example.helpers.messages.RegexExpressions;

public class MerchandiseValidation {

    private final RegexValidator regexValidator = new RegexValidator();

    public boolean validateId(Integer id) throws Exception {
        if (id < 0) {
            throw new Exception(MerchandiseMessages.INVALID_MERCHANDISE_ID.getErrorMessage());
        }
        return true;
    }

    public boolean validateOccupiedVolume(Double occupiedVolume) throws Exception {
        if (occupiedVolume < 0) {
            throw new Exception(MerchandiseMessages.NEGATIVE_VALUE.getErrorMessage());
        }
        if (occupiedVolume > 100) {
            throw new Exception(MerchandiseMessages.OCCUPIED_VOLUME_EXCEEDS.getErrorMessage());
        }
        return true;
    }

    public boolean validateType(String type) throws Exception {
        validateWithRegex(type, RegexExpressions.LETTERS_WITHOUT_SPACES, MerchandiseMessages.INVALID_CHARACTERS);
        return true;
    }

    public boolean validateWeight(Double weight) throws Exception {
        if (weight < 0) {
            throw new Exception(MerchandiseMessages.NEGATIVE_VALUE.getErrorMessage());
        }
        if (weight > 1000) {
            throw new Exception(MerchandiseMessages.WEIGHT_EXCEEDS.getErrorMessage());
        }
        return true;
    }

    public boolean validateDescription(String description) throws Exception {
        validateWithRegex(description, RegexExpressions.ONLY_LETTERS_AND_SPACES, MerchandiseMessages.INVALID_CHARACTERS);
        validateLength(description, 100, MerchandiseMessages.LENGTH_ERROR);
        return true;
    }

    public boolean validateAppraisal(Integer appraisal) throws Exception {
        if (appraisal < 0) {
            throw new Exception(MerchandiseMessages.NEGATIVE_VALUE.getErrorMessage());
        }
        return true;
    }

    public boolean validateSenderAddress(String senderAddress) throws Exception {
        validateWithRegex(senderAddress, RegexExpressions.ONLY_LETTERS_AND_SPACES, MerchandiseMessages.INVALID_CHARACTERS);
        validateLength(senderAddress, 200, MerchandiseMessages.LENGTH_ERROR);
        return true;
    }

    public boolean validateRecipientAddress(String recipientAddress) throws Exception {
        validateWithRegex(recipientAddress, RegexExpressions.ONLY_LETTERS_AND_SPACES, MerchandiseMessages.INVALID_CHARACTERS);
        validateLength(recipientAddress, 200, MerchandiseMessages.LENGTH_ERROR);
        return true;
    }

    private void validateWithRegex(String value, RegexExpressions regex, MerchandiseMessages errorMessage) throws Exception {
        if (!regexValidator.validateRegex(value, regex.getPattern())) {
            throw new Exception(errorMessage.getErrorMessage());
        }
    }

    private void validateLength(String value, int maxLength, MerchandiseMessages errorMessage) throws Exception {
        if (value.length() > maxLength) {
            throw new Exception(errorMessage.getErrorMessage());
        }
    }
}
