package org.example.models;

import org.example.helpers.validations.VehicleValidation;

public class Vehicle {

    // Injecting a dependency of the VehicleValidation class
    private final VehicleValidation vehicleValidation = new VehicleValidation();

    // id
    private Integer id; // only positive numbers

    // brand
    private String brand; // only letters and spaces, maximum 50 characters, no special characters

    // model
    private String model; // formatted according to specified rules

    // mileage
    private Double mileage; // only positive numbers, maximum 100,000

    // color
    private String color; // only letters and spaces, maximum 20 characters

    // description
    private String description; // maximum 100 characters

    // type
    private String type; // only letters, no spaces

    // autonomy
    private Integer autonomy; // only positive numbers, maximum 72

    // loadCapacity
    private Double loadCapacity; // only positive numbers, maximum 1000

    // appraisal
    private Integer appraisal; // only positive numbers

    public Vehicle() {
    }

    public Vehicle(Integer id, String brand, String model, Double mileage, String color, String description, String type, Integer autonomy, Double loadCapacity, Integer appraisal) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.description = description;
        this.type = type;
        this.autonomy = autonomy;
        this.loadCapacity = loadCapacity;
        this.appraisal = appraisal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {
            this.vehicleValidation.validateId(id);
            this.id = id;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        try {
            this.vehicleValidation.validateBrand(brand);
            this.brand = brand;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        try {
            this.vehicleValidation.validateModel(model);
            this.model = model;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        try {
            this.vehicleValidation.validateMileage(mileage);
            this.mileage = mileage;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        try {
            this.vehicleValidation.validateColor(color);
            this.color = color;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        try {
            this.vehicleValidation.validateDescription(description);
            this.description = description;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        try {
            this.vehicleValidation.validateType(type);
            this.type = type;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(Integer autonomy) {
        try {
            this.vehicleValidation.validateAutonomy(autonomy);
            this.autonomy = autonomy;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        try {
            this.vehicleValidation.validateLoadCapacity(loadCapacity);
            this.loadCapacity = loadCapacity;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(Integer appraisal) {
        try {
            this.vehicleValidation.validateAppraisal(appraisal);
            this.appraisal = appraisal;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
