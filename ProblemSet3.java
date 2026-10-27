
package edu.monmouth.problemSet3; // 8a

import edu.monmouth.campusvehicle.CampusVehicle;

import edu.monmouth.campusvehicle.Color;

public class ProblemSet3 {

    public static void main(String[] args) {

       
        CampusVehicle vehicle1 = new CampusVehicle(); // 8b.

       
        System.out.println("default values:"); // 8c prints defaults
        System.out.println(vehicle1.getId());
        System.out.println(vehicle1.getLocation());
        System.out.println(vehicle1.isAvailable());
        System.out.println(vehicle1.getColor());
        
        
        vehicle1.setId("MU_Kamp2026"); // 8d update values
        vehicle1.setLocation("Parking Lot");
        vehicle1.setAvailable(false);
        vehicle1.setColor(Color.BLUE);
        

        System.out.println("new values:"); // 8e Print
        System.out.println(vehicle1.getId());
        System.out.println(vehicle1.getLocation());
        System.out.println(vehicle1.isAvailable());
        System.out.println(vehicle1.getColor());

        
        // 8f
        CampusVehicle vehicle2 = new CampusVehicle("MU_DiLeo", "Library", true, Color.BLUE);
        System.out.println("second vehicle:"); // 8g
        System.out.println(vehicle2.getId());
        System.out.println(vehicle2.getLocation());
        System.out.println(vehicle2.isAvailable());
        System.out.println(vehicle2.getColor());
        
        vehicle2.setColor(Color.GREEN); // 8h
        
        System.out.println("Vehicle 2 updated color:");
        System.out.println(vehicle2.getId());
        System.out.println(vehicle2.getLocation());
        System.out.println(vehicle2.isAvailable());
        System.out.println(vehicle2.getColor());
        
        
        //// 8j - one correct two invalid
        

        CampusVehicle vehicle3 = new CampusVehicle(
            "MU2026", "Spruce Hall", true, Color.BLACK);

        System.out.println("Vehicle 3: ");
        System.out.println(vehicle3.getId());
        System.out.println(vehicle3.getLocation());
        System.out.println(vehicle3.isAvailable());
        System.out.println(vehicle3.getColor());


       
        CampusVehicle vehicle4 = new CampusVehicle(
            "ABC123456789101112", "Library", false, Color.WHITE);

        System.out.println("Vehicle 4: ");
        System.out.println(vehicle4.getId());
        System.out.println(vehicle4.getLocation());
        System.out.println(vehicle4.isAvailable());
        System.out.println(vehicle4.getColor());


        
        CampusVehicle vehicle5 = new CampusVehicle(
            "MU10012", "Gym", true, Color.SILVER);

        System.out.println("Vehicle 5: ");
        System.out.println(vehicle5.getId());
        System.out.println(vehicle5.getLocation());
        System.out.println(vehicle5.isAvailable());
        System.out.println(vehicle5.getColor());
    }
}
