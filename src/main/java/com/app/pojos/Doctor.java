package com.app.pojos;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;


@Entity
@Table(name = "doctor")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "firstName", nullable = false)
    @NotBlank(message = "First Name is mandatory")
    private String firstName;
    
    @Column(name = "lastName", nullable = false)
    @NotBlank(message = "Last Name is mandatory")
    private String lastName;
    
    @Column(name = "gender", nullable = false)
    @NotBlank(message = "Gender is mandatory")
    private String gender;

    @Column(name = "speciality", nullable = false)
    @NotBlank(message = "Speciality is mandatory")
    private String speciality;

//    @Column(name = "available_days", nullable = false)
//    @NotBlank(message = "Available days are mandatory")
//    private String availableDays;
//
//    @Column(name = "start_time", nullable = false)
//    @NotBlank(message = "Start time is mandatory")
//    private String startTime;
//
//    @Column(name = "end_time", nullable = false)
//    @NotBlank(message = "End time is mandatory")
//    private String endTime;
    
    @NotNull(message = "Verified is mandatory")
    private Boolean verified;

    @Column(name = "active", nullable = false)
    private boolean active;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "child_id")
    private Child child;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clinic_id")
    @NotNull(message = "Clinic is mandatory")
    private Clinic clinic;
    
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private Set<Notification> notifications;
       
}

