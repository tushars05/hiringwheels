package org.ncu.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "location_name", nullable = false)
    private String locationName;

    @Column(name = "address", nullable = false)
    private String address;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city; // Use the City entity

    @Column(name = "pincode", nullable = false)
    private String pincode;

    // Constructors

    // Getter for locationId
    public Long getLocationId() {
        return locationId;
    }

    // Setter for locationId
    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    // Getter for locationName
    public String getLocationName() {
        return locationName;
    }

    // Setter for locationName
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for city
    public City getCity() {
        return city;
    }

    // Setter for city
    public void setCity(City city) {
        this.city = city;
    }

    // Getter for pincode
    public String getPincode() {
        return pincode;
    }

    // Setter for pincode
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    
    // Additional methods

    public void addVehicle(Vehicle vehicle) {
        // Implement this method as needed
    }
}
