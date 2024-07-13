package org.example.models;

import org.example.helpers.validations.MerchandiseValidation;

public class Merchandise {

    private final MerchandiseValidation merchandiseValidation = new MerchandiseValidation();

    // id (int) // only positive integers
    private Integer id;
    // occupiedVolume (double)  // only positive and maximum 100
    private Double occupiedVolume;
    // type (string) // only letters without spaces
    private String type;
    // weight (double) // only positive and maximum 1000
    private Double weight;
    // description (string) // maximum 100
    private String description;
    // appraisal (int) // only positive
    private Integer appraisal;
    // senderAddress (string) // maximum 200
    private String senderAddress;
    // recipientAddress (string) // maximum 200
    private String recipientAddress;

    public Merchandise() {
    }

    public Merchandise(Integer id, Double occupiedVolume, String type, Double weight, String description, Integer appraisal, String senderAddress, String recipientAddress) {
        this.id = id;
        this.occupiedVolume = occupiedVolume;
        this.type = type;
        this.weight = weight;
        this.description = description;
        this.appraisal = appraisal;
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {
            this.merchandiseValidation.validateId(id);
            this.id = id;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Double getOccupiedVolume() {
        return occupiedVolume;
    }

    public void setOccupiedVolume(Double occupiedVolume) {
        try {
            this.merchandiseValidation.validateOccupiedVolume(occupiedVolume);
            this.occupiedVolume = occupiedVolume;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        try {
            this.merchandiseValidation.validateType(type);
            this.type = type;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        try {
            this.merchandiseValidation.validateWeight(weight);
            this.weight = weight;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        try {
            this.merchandiseValidation.validateDescription(description);
            this.description = description;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(Integer appraisal) {
        try {
            this.merchandiseValidation.validateAppraisal(appraisal);
            this.appraisal = appraisal;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        try {
            this.merchandiseValidation.validateSenderAddress(senderAddress);
            this.senderAddress = senderAddress;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        try {
            this.merchandiseValidation.validateRecipientAddress(recipientAddress);
            this.recipientAddress = recipientAddress;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
