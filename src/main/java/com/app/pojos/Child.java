package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;

@Data
@Entity
@Table(name = "child")
@NoArgsConstructor
@AllArgsConstructor
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long childId;
    
    @NotBlank(message = "First name is required")
    @Size(max = 20, message = "Maximum first name length is 20 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(max = 20, message = "Maximum last name length is 20 characters")
    private String lastName;
    
    @Column(name = "active", nullable = false)
    private boolean active;
    
    @NotNull(message = "Gender is mandatory")
    private String gender;
    
//    @NotNull(message = "Date of birth is required")
//    private LocalDate dateOfBirth;
    
    @Column(name = "dob", nullable = false)
    private LocalDate dateOfBirth;
    
//    @NotBlank(message = "Blood group is mandatory")
//    @Pattern(regexp = "^(A|B|AB|O)[+-]$", message = "Invalid blood group")
//    private String bloodGroup;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "blood_group", nullable = false)
    private BloodGroup bloodGroup;
    
    @Column(name = "allergies")
    private String allergies;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "child")
    private MedicalHistory medicalHistory;
    
//    @Column(name = "med_history") //Use this If we do not want to create another class for medical history  
//    private String medicalHistory;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Parent parent;
    


    
    
}

   
