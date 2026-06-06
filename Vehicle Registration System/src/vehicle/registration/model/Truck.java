package vehicle.registration.model;


public class Truck extends Vehicle {

    private double cargoCapacityTons;

    public Truck(String plateNumber, String ownerName, String vehicleType, int registrationYear, String status, double cargoCapacityTons) {
        super(plateNumber, ownerName, vehicleType, registrationYear, status);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    @Override
    public String getRegistrationLabel() {
        return "Truck | Capacity : " + cargoCapacityTons;
    }

    @Override
    public String toString() {
        return super.toString() + " | Cargo Capacity in Tons is : " + cargoCapacityTons;
    }
}