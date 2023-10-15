package org.ncu.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_subcategory")
public class VehicleSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_subcategory_id")
    private Long vehicleSubcategoryId;

    @Column(name = "vehicle_subcategory_name", nullable = false)
    private String vehicleSubcategoryName;

    @ManyToOne
    @JoinColumn(name = "vehicle_category_id", nullable = false)
    private VehicleCategory vehicleCategory;

    @Column(name = "price_per_day", nullable = false)
    private double pricePerDay;

    // Constructors, getters, setters, and other methods

    // Constructors
    public VehicleSubcategory() {
        // Default constructor
    }

    public VehicleSubcategory(String vehicleSubcategoryName, VehicleCategory vehicleCategory, double pricePerDay) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
        this.vehicleCategory = vehicleCategory;
        this.pricePerDay = pricePerDay;
    }

    // Getters and setters
    public Long getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(Long vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public String getVehicleSubcategoryName() {
        return vehicleSubcategoryName;
    }

    public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    // Additional methods, if needed
}
