package com.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	// Find a user with Email.
    User findByEmail(String email);
    
    //Find all users by their Role
    List<User> findByRole(String role);
}
