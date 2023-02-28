package com.app.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Reminder;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {

    // custom method to find reminders for a specific child
    List<Reminder> findByChild(Long childId);
    
    // custom method to find reminders for a specific parent
    List<Reminder> findByParent(Long parentId);
    
    // custom method to find all reminders for a specific doctor
    List<Reminder> findByDoctor(Long doctorId);
    
    // custom method to find reminders for a specific appointment
    // Optional<Reminder> findByAppointmentId(Long appointmentId);
    
    // custom method to find reminders that are due on or before the specified date
    List<Reminder> findByReminderDateBefore(LocalDate date);
    
    // custom method to find reminders that are due between the specified start and end dates
    List<Reminder> findByReminderDateBetween(LocalDate startDate, LocalDate endDate);
    
    // custom method to find all reminders that have not been completed
    List<Reminder> findByIsSentFalse();
    
    // custom method to find all reminders that have been completed
    List<Reminder> findIsSentTrue();
    
    // custom method to find reminders that are due on the specified date and have not been completed
    // List<Reminder> findByDueDateAndCompletedFalse(LocalDate date);
}
