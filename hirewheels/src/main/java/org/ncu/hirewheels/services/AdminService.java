package org.ncu.hirewheels.services;

import org.ncu.hirewheels.entities.Vehicle;

public interface AdminService {
    Vehicle registerVehicle(Vehicle vehicle);

	Vehicle changeAvailability(Long vehicleId, boolean available);
}
