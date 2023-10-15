package org.ncu.hirewheels.servicesimpl;

import org.ncu.hirewheels.entities.Vehicle;
import org.ncu.hirewheels.services.AdminService;
import org.ncu.hirewheels.dao.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    private final VehicleRepository vehicleRepository;

    @Autowired
    public AdminServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) {
        // Set availability_status to 1 by default when registering a new vehicle
        vehicle.setAvailabilityStatus(1);
        // Save the vehicle to the database
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle changeAvailability(Long vehicleId, boolean available) {
        // Find the vehicle by its ID
        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));

        // Update the availability_status based on the 'available' parameter
        if (available) {
            vehicle.setAvailabilityStatus(1); // Set as available
        } else {
            vehicle.setAvailabilityStatus(0); // Set as unavailable
        }

        // Save the updated vehicle to the database
        return vehicleRepository.save(vehicle);
    }
}
