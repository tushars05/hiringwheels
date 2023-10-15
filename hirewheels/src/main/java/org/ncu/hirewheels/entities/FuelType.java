package org.ncu.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "fuel_type")
public class FuelType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fuel_type_id")
    private Long fuelTypeId;

    @Column(name = "fuel_type", nullable = false, unique = true)
    private String fuelType;

    // Constructors, getters, setters, and other methods

    // Constructors
    public FuelType() {
        // Default constructor
    }

    public FuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Getters and setters
    public Long getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(Long fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

	public FuelType getFuelTypeById(FuelType fuelType2) {
		// TODO Auto-generated method stub
		return null;
	}

    // Additional methods, if needed
}
