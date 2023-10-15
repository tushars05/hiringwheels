package org.ncu.hirewheels.services;

import java.sql.Date;
import java.util.List;

import org.ncu.hirewheels.entities.Vehicle;

public interface VehicleService {
    List<Vehicle> getAllVehicles();
    List<Vehicle> getAvailableVehicles(String vehicleCategory, Date pickupDate, Date dropoffDate, Long locationId);
    Vehicle registerVehicle(Vehicle vehicle);
    void changeAvailability(Long vehicleId, int availabilityStatus);
	List<Vehicle> getAvailableVehicles(int i);
	List<Vehicle> getVehiclesByAvailability(int availabilityStatus);
	List<Vehicle> getAllVehiclesByAvailability(int availabilityStatus);
}
