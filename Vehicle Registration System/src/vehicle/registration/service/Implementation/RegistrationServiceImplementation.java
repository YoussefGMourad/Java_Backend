package vehicle.registration.service.Implementation;

import vehicle.registration.exception.DuplicatePlateException;
import vehicle.registration.exception.VehicleNotFoundException;
import vehicle.registration.model.Car;
import vehicle.registration.model.Motorcycle;
import vehicle.registration.model.Truck;
import vehicle.registration.model.Vehicle;
import vehicle.registration.service.RegistrationService;
import java.util.stream.Collectors;

import java.util.*;

public class RegistrationServiceImplementation implements RegistrationService {


    private List<Vehicle> vehicleList = new ArrayList<>();
    private Map<String, Vehicle> plateIndex = new HashMap<>();
    private Set<String> registeredPlates = new HashSet<>();

    @Override
    public void registerVehicle(Vehicle v) {
        String plate = v.getPlateNumber().toUpperCase();
        if (registeredPlates.contains(plate)) {
            throw new DuplicatePlateException(plate);
        } else {
            vehicleList.add(v);
            registeredPlates.add(plate);
            plateIndex.put(plate, v);
        }
    }

    @Override
    public Vehicle findByPlate(String plate) {
        String seacrhForPlate = plate.toUpperCase();
        if (plateIndex.containsKey(seacrhForPlate)) {
            return plateIndex.get(seacrhForPlate);
        } else {
            throw new VehicleNotFoundException(seacrhForPlate);
        }

    }

    @Override
    public void deleteVehicle(String plate) {
        String deleteForPlate = plate.toUpperCase();

        Vehicle v = findByPlate(deleteForPlate);

        vehicleList.remove(v);
        plateIndex.remove(deleteForPlate);
        registeredPlates.remove(deleteForPlate);
    }

    @Override
    public void updateOwner(String plate, String newOwner) {
        String searchPlate = plate.toUpperCase();
        Vehicle v = findByPlate(searchPlate);
        v.setOwnerName(newOwner);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return Collections.unmodifiableList(vehicleList);
    }


    @Override
    public List<Vehicle> filterByType(String type) {
        return vehicleList.stream().filter(vehicle -> vehicle.getVehicleType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    @Override
    public List<Vehicle> getVehiclesByOwner(String ownerName) {
        return vehicleList.stream().filter(vehicle -> vehicle.getOwnerName().toLowerCase().contains(ownerName.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Vehicle> getExpiredRegistrations(int currentYear) {
        return vehicleList.stream().filter(vehicle -> vehicle.getRegistrationYear()>5)
                .collect(Collectors.toList());
    }

    @Override
    public List<Vehicle> getSortedByYear(boolean ascending) {
        Comparator<Vehicle> comp = Comparator.comparingInt(Vehicle::getRegistrationYear);
        if (!ascending) comp = comp.reversed();
        return vehicleList.stream()
                .sorted(comp)
                .collect(Collectors.toList());
    }
}

