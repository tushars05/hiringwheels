package org.ncu.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_category")
public class VehicleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_category_id")
    private Long vehicleCategoryId;

    @Column(name = "vehicle_category_name", nullable = false, unique = true)
    private String vehicleCategoryName;

    // Constructors, getters, setters, and other methods

    // Constructors
    public VehicleCategory() {
        // Default constructor
    }

    public VehicleCategory(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    // Getters and setters
    public Long getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    public void setVehicleCategoryId(Long vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }

    public String getVehicleCategoryName() {
        return vehicleCategoryName;
    }

    public void setVehicleCategoryName(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    // Additional methods, if needed
}
