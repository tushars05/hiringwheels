package org.ncu.hirewheels.servicesimpl;

import java.util.List;

import org.ncu.hirewheels.dao.VehicleRepository;
import org.ncu.hirewheels.entities.Vehicle;
import org.ncu.hirewheels.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) {
        // Implement logic to register a new vehicle
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void changeAvailability(Long vehicleId, int availabilityStatus) {
        // Implement logic to change availability status
        // You can use vehicleRepository to update the availabilityStatus field
    }

    @Override
    public List<Vehicle> getAvailableVehicles(int availabilityStatus) {
        // Implement logic to find available vehicles based on availabilityStatus
        // You may need to use custom query methods
        return vehicleRepository.findByAvailabilityStatus(availabilityStatus); // Implement your custom query here
    }

	@Override
	public List<Vehicle> getAvailableVehicles(String vehicleCategory, java.sql.Date pickupDate,
			java.sql.Date dropoffDate, Long locationId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Vehicle> getAllVehiclesByAvailability(int availabilityStatus) {
	    return vehicleRepository.findByAvailabilityStatus(availabilityStatus);
	}

	@Override
	public List<Vehicle> getVehiclesByAvailability(int availabilityStatus) {
		// TODO Auto-generated method stub
		return null;
	}
}
