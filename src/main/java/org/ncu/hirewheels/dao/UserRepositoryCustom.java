package org.ncu.hirewheels.dao;

import org.ncu.hirewheels.entities.User;

public interface UserRepositoryCustom {
    User findByFirstName(String firstName);
    User findByFirstNameOrLastName(String firstName, String lastName);
    User findByEmail(String email);
    User findByMobileNo(String mobileNo);
    // Add other custom query methods here if needed
}
