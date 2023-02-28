package com.app.repository;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {
    
    // Custom query to get all logs for a specific date
    // List<Log> findAllByDate(LocalDateTime date);
    
    // Custom query to get all logs for a specific user type
    // List<Log> findAllByUserType(String userType);
    
    // Custom query to get all logs for a specific user id
    // List<Log> findAllByUserId(Long userId);
    
    // Custom query to get all logs for a specific user type and user id
    // List<Log> findAllByUserTypeAndUserId(String userType, Long userId);
}

