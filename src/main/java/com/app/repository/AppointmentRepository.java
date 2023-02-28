package com.app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Appointment;
import com.app.pojos.Child;
import com.app.pojos.Doctor;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	//To list to appointments taken by that child
    List<Appointment> findByChild(Child child);
    
    //To find list of confirmed status and by which doctor
    List<Appointment> findByDoctorAndIsConfirmed(Doctor doctor, boolean isConfirmed);
    
    //To find appointment on that date.
    List<Appointment> findByDate(Date appointmentDate);

    //To find appointments between 2 dates.
    List<Appointment> findByDate(Date startDate, Date endDate);
}

