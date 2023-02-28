package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Appointment;
import com.app.pojos.Child;
import com.app.pojos.Parent;
import com.app.pojos.Vaccination;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
    
    // Custom query to find a parent by email
    Parent findByEmail(String email);
    
    // Custom query to find all children of a parent
    List<Child> findAllChildrenByParent(Parent parent);
    
    // Custom query to find all appointments of a parent's children
    List<Appointment> findAllAppointmentsByParent(Parent parent);
    
    // Custom query to find all vaccination records of a parent's children
    List<Vaccination> findAllVaccinationRecordsByParent(Parent parent);
    
}
