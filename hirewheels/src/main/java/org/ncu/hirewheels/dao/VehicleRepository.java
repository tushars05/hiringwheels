package org.ncu.hirewheels.dao;

import java.util.List;

import org.ncu.hirewheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	List<Vehicle> findByAvailabilityStatus(int availabilityStatus);
    // Custom query methods go here if needed
}
