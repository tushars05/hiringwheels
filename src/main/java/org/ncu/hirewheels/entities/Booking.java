package org.ncu.hirewheels.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @Column(name = "pickup_date", nullable = false)
    private Date pickupDate;

    @Column(name = "dropoff_date", nullable = false)
    private Date dropoffDate;

    @Column(name = "booking_date", nullable = false)
    private Date bookingDate;

    @Column(name = "amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    // Constructors, getters, and setters

    public Booking() {
        // Default constructor
    }

    public Booking(User user, Vehicle vehicle, Date pickupDate, Date dropoffDate, Date bookingDate, BigDecimal amount, Location location) {
        this.user = user;
        this.vehicle = vehicle;
        this.pickupDate = pickupDate;
        this.dropoffDate = dropoffDate;
        this.bookingDate = bookingDate;
        this.amount = amount;
        this.location = location;
    }

    // Getters and setters for all fields

    // Other methods as needed

}
