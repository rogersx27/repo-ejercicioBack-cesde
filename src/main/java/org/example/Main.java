package org.example;

import org.example.models.Merchandise;
import org.example.models.Vehicle;

public class Main {
    public static void main(String[] args) {

        // --------------- START GOOD VALIDATIONS  ----------------- //

//        // Vehicle test
//        Vehicle vehicle = new Vehicle();
//        try {
//            vehicle.setId(1);
//            vehicle.setBrand("Toyota");
//            vehicle.setModel("12-23");
//            vehicle.setMileage(50000.0);
//            vehicle.setColor("Red");
//            vehicle.setDescription("Compact car, great for city driving");
//            vehicle.setType("Sedan");
//            vehicle.setAutonomy(70);
//            vehicle.setLoadCapacity(500.0);
//            vehicle.setAppraisal(15000);
//        } catch (Exception e) {
//            System.out.println("Vehicle validation error: " + e.getMessage());
//        }
//
//        // Print vehicle details
//        System.out.println("Vehicle ID: " + vehicle.getId());
//        System.out.println("Vehicle Brand: " + vehicle.getBrand());
//        System.out.println("Vehicle Model: " + vehicle.getModel());
//        System.out.println("Vehicle Mileage: " + vehicle.getMileage());
//        System.out.println("Vehicle Color: " + vehicle.getColor());
//        System.out.println("Vehicle Description: " + vehicle.getDescription());
//        System.out.println("Vehicle Type: " + vehicle.getType());
//        System.out.println("Vehicle Autonomy: " + vehicle.getAutonomy());
//        System.out.println("Vehicle Load Capacity: " + vehicle.getLoadCapacity());
//        System.out.println("Vehicle Appraisal: " + vehicle.getAppraisal());
//
//        // Merchandise test
//        Merchandise merchandise = new Merchandise();
//        try {
//            merchandise.setId(10);
//            merchandise.setOccupiedVolume(50.0);
//            merchandise.setType("Electronics");
//            merchandise.setWeight(20.0);
//            merchandise.setDescription("High-end laptop");
//            merchandise.setAppraisal(2000);
//            merchandise.setSenderAddress("123 Main St, Anytown");
//            merchandise.setRecipientAddress("456 Elm St, Othertown");
//        } catch (Exception e) {
//            System.out.println("Merchandise validation error: " + e.getMessage());
//        }
//
//        // Print merchandise details
//        System.out.println("-----------------------------------------");
//        System.out.println("Merchandise ID: " + merchandise.getId());
//        System.out.println("Merchandise Occupied Volume: " + merchandise.getOccupiedVolume());
//        System.out.println("Merchandise Type: " + merchandise.getType());
//        System.out.println("Merchandise Weight: " + merchandise.getWeight());
//        System.out.println("Merchandise Description: " + merchandise.getDescription());
//        System.out.println("Merchandise Appraisal: " + merchandise.getAppraisal());
//        System.out.println("Sender Address: " + merchandise.getSenderAddress());
//        System.out.println("Recipient Address: " + merchandise.getRecipientAddress());

        // --------------- END GOOD VALIDATIONS ----------------- //

        // --------------- START BAD / ERROR VALIDATIONS ----------------- //

//        // Vehicle test with intentional errors
        Vehicle vehicle = new Vehicle();
        try {
            vehicle.setId(-1); // Intentional error: negative ID
            vehicle.setBrand("T0yota!"); // Intentional error: invalid characters
            vehicle.setModel("13-23"); // Intentional error: invalid month
            vehicle.setMileage(-50000.0); // Intentional error: negative mileage
            vehicle.setColor("Red123"); // Intentional error: invalid characters
            vehicle.setDescription("This description is intentionally made very long to exceed the maximum allowed length of 100 characters and should trigger an exception."); // Intentional error: description too long
            vehicle.setType("Sedan Coupe"); // Intentional error: contains spaces
            vehicle.setAutonomy(100); // Intentional error: exceeds maximum autonomy
            vehicle.setLoadCapacity(1500.0); // Intentional error: exceeds maximum load capacity
            vehicle.setAppraisal(-15000); // Intentional error: negative appraisal
        } catch (Exception e) {
            System.out.println("-------------------");
            System.out.println("Vehicle validation error: " + e.getMessage());
        }

        // Merchandise test with intentional errors
        Merchandise merchandise = new Merchandise();
        try {
            merchandise.setId(-10); // Intentional error: negative ID
            merchandise.setOccupiedVolume(150.0); // Intentional error: exceeds maximum volume
            merchandise.setType("Electronics123"); // Intentional error: invalid characters
            merchandise.setWeight(-20.0); // Intentional error: negative weight
            merchandise.setDescription("This description is intentionally made very long to exceed the maximum allowed length of 100 characters and should trigger an exception."); // Intentional error: description too long
            merchandise.setAppraisal(-2000); // Intentional error: negative appraisal
            merchandise.setSenderAddress("123 Main St, Anytown!"); // Intentional error: invalid characters
            merchandise.setRecipientAddress("456 Elm St, Othertown with a very very long address that exceeds the maximum allowed length of 200 characters and should trigger an exception to test the validation"); // Intentional error: address too long
        } catch (Exception e) {
            System.out.println("Merchandise validation error: " + e.getMessage());
        }
        // --------------- END BAD / ERROR VALIDATIONS ----------------- //
    }
}
