package vehicle.registration.service;

import vehicle.registration.model.Vehicle;

import java.util.*;
import java.util.stream.Collectors;

public interface RegistrationService {


    public void registerVehicle(Vehicle v);

    public Vehicle findByPlate(String plate);

    public void deleteVehicle(String plate);

    public void updateOwner(String plate, String newOwner);

    public List<Vehicle> getAllVehicles();

    List<Vehicle> filterByType(String type);
    List<Vehicle> getVehiclesByOwner(String ownerName);
    List<Vehicle> getExpiredRegistrations(int currentYear);
    List<Vehicle> getSortedByYear(boolean ascending);


}
