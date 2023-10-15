package org.ncu.hirewheels.dao;

import org.ncu.hirewheels.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailAndPassword(String email, String password);
    // You can add custom query methods here if needed
    // For example, findUserByEmail(String email);
}
