package org.ncu.hirewheels.Controller;

import org.ncu.hirewheels.entities.Vehicle;
import org.ncu.hirewheels.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        List<Vehicle> vehicles = vehicleService.getAllVehicles();
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }
    @GetMapping("/avstatus/{availabilityStatus}")
    public ResponseEntity<List<Vehicle>> getVehiclesByAvailability(@PathVariable int availabilityStatus) {
        List<Vehicle> vehicles = vehicleService.getAllVehiclesByAvailability(availabilityStatus);
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }


    @GetMapping("/available")
    public ResponseEntity<List<Vehicle>> getAvailableVehicles(
            @RequestParam(name = "availabilityStatus", defaultValue = "1") int availabilityStatus) {
        List<Vehicle> availableVehicles = vehicleService.getAvailableVehicles(availabilityStatus);
        return new ResponseEntity<>(availableVehicles, HttpStatus.OK);
    }


    @PostMapping("/register")
    public ResponseEntity<Vehicle> registerVehicle(@RequestBody Vehicle vehicle) {
        // Call the service method to register the vehicle
        Vehicle newVehicle = vehicleService.registerVehicle(vehicle);
        
        // Return the newly created vehicle with a status of 201 (Created)
        return new ResponseEntity<>(newVehicle, HttpStatus.CREATED);
    }

    @PutMapping("/availability/{vehicleId}")
    public ResponseEntity<Void> changeAvailability(
            @PathVariable Long vehicleId,
            @RequestParam(name = "status") int availabilityStatus) {
        vehicleService.changeAvailability(vehicleId, availabilityStatus);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
