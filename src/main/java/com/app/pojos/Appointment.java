package com.app.pojos;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "appointment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "Date is mandatory")
    private LocalDate date;
    
    @NotNull(message = "Time is mandatory")
    private LocalTime time;
    
    @NotNull(message = "Reason is mandatory")
    private String reason;
    
    private LocalDate startTime;
    private LocalDate endTime;
    
//    @NotNull(message = "Status is mandatory")
//    @Enumerated(EnumType.STRING)
//    private String status;
    
    @Column(name = "is_confirmed")
    private boolean isConfirmed;
    
    @NotNull(message = "Doctor is mandatory")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Doctor doctor;
    
    @NotNull(message = "Child is mandatory")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "child_id")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Child child;
    
    @NotNull(message = "parent is mandatory")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentId")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Parent parent;
    
    
}
