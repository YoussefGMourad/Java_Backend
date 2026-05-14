package vehicle.registration;

import vehicle.registration.exception.VehicleNotFoundException;
import vehicle.registration.model.*;
import vehicle.registration.service.RegistrationService;
import vehicle.registration.service.Implementation.RegistrationServiceImplementation;

import java.security.Provider;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static RegistrationServiceImplementation Service = new RegistrationServiceImplementation();

    public static void main(String[] args) {
        boolean work = true;
        while (work) {

            System.out.println("========================================");
            System.out.println("   VEHICLE REGISTRATION SYSTEM v1.0    ");
            System.out.println("========================================");
            System.out.println("1. Register New Vehicle");
            System.out.println("2. Search Vehicle by Plate");
            System.out.println("3. Update Owner Name");
            System.out.println("4. Delete Vehicle");
            System.out.println("5. List All Vehicles");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Add a new car ");
                    registerNewVehicle(input, Service);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Search Vehicle by Plate");
                    searchForPlate(input, Service);
                    break;
                case 3:
                    System.out.println("Update Owner Name");
                    updateOwner(input,Service);
                    break;
                case 4:
                    System.out.println("Delete Vehicle");
                    deleteVehicle(input,Service);
                    break;
                case 5:
                    System.out.println("List All Vehicles");
                    listAllVehicles(Service);
                    break;
                case 0:
                    work = false;
                    break;
                default:
                    System.out.println("⚠ Invalid option. Please enter 1, 2, 3....");

            }
        }
        System.out.println("Thank You for using our system");
    }

    public static void registerNewVehicle(Scanner input, RegistrationServiceImplementation service) {
//        RegistrationServiceImplementation Service = new RegistrationServiceImplementation();
        try {
            System.out.println("Enter plate number: ");
            String plateNumber = input.nextLine();
            System.out.println("Enter owner name: ");
            String ownerName = input.nextLine();
            System.out.println("Enter vehicle type (Car / Truck / Motorcycle): ");
            String vehicleType = input.nextLine();
            System.out.println("Enter registration year: ");
            int registrationYear = input.nextInt();
            input.nextLine();
            String status = "ACTIVE";

            if (vehicleType.equalsIgnoreCase("Car")) {
                System.out.println("Enter number of doors");
                int numberOfDoors = input.nextInt();
                input.nextLine();
                Vehicle vehicle = new Car(plateNumber, ownerName, vehicleType, registrationYear, status, numberOfDoors);
                service.registerVehicle(vehicle);
                System.out.println("✅ Car registered successfully!");

            } else if (vehicleType.equalsIgnoreCase("Truck")) {
                System.out.println("Enter cargo capacity (tons): ");
                double capacityInTons = input.nextDouble();
                input.nextLine();
                Vehicle truck = new Truck(plateNumber, ownerName, vehicleType, registrationYear, status, capacityInTons);
                service.registerVehicle(truck);
                System.out.println("✅ Truck registered successfully!");

            } else {
                System.out.println("Enter engine type (Sport / Cruiser / Off-Road) :");
                String engineType = input.next();
                input.nextLine();
                Vehicle motorcycle = new Motorcycle(plateNumber, ownerName, vehicleType, registrationYear, status, engineType);
                service.registerVehicle(motorcycle);
                System.out.println("✅ Motorcycle registered successfully!");
            }

        } catch (InputMismatchException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    public static void searchForPlate(Scanner input, RegistrationServiceImplementation service) {
        System.out.println("Please enter the plate number: ");
        String plateNumber = input.nextLine();
        try {
            Vehicle found = service.findByPlate(plateNumber);
            System.out.println(found);
        } catch (VehicleNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }

    private static void updateOwner(Scanner input, RegistrationServiceImplementation service) {
        System.out.println("Please enter the plate number: ");
        String plateNumber = input.nextLine();
        System.out.println("Please enter the new owner name: ");
        String newOwnerName = input.nextLine();

        try {
            service.updateOwner(plateNumber, newOwnerName);
            System.out.println("✅ Owner updated successfully!");
        } catch (VehicleNotFoundException e) {
            System.err.println("❌ " + e.getMessage());
        }

    }

    private static void deleteVehicle(Scanner input, RegistrationServiceImplementation service) {
        System.out.println("Please enter the plate number: ");
        String plateNumber = input.nextLine();
        try {
            service.deleteVehicle(plateNumber);
            System.out.println("✅ Vehicle deleted successfully!"); // ← add this
        } catch (VehicleNotFoundException e) {
            System.err.println("❌ " + e.getMessage());
        }
    }

    private static void listAllVehicles(RegistrationServiceImplementation service) {
        List<Vehicle> vehicles = service.getAllVehicles();
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles registered yet");
        } else {
            vehicles.stream()
                    .forEach(System.out::println);
        }
    }
}