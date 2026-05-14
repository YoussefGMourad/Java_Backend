package vehicle.registration.service;

import vehicle.registration.model.Vehicle;

import java.util.*;

public interface RegistrationService {


    public void registerVehicle(Vehicle v);

    public Vehicle findByPlate(String plate);

    public void deleteVehicle(String plate);

    public void updateOwner(String plate, String newOwner);

    public List<Vehicle> getAllVehicles();
}
