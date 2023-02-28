package com.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.pojos.Clinic;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Long> {

    // Custom query to find all clinics in a specific city
    @Query("SELECT c FROM Clinic c WHERE c.city = :city")
    List<Clinic> findByCity(String city);
}
