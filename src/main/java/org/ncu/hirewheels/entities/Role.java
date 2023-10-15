package org.ncu.hirewheels.entities;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name", nullable = false, unique = true)
    private String roleName;

    // Define the relationship with User entity
    @OneToMany(mappedBy = "role") // Assuming a field named 'role' exists in the User entity
    private List<User> users;

    // Constructors, getters, and setters
}
