package com.app.pojos;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "vaccination")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vaccination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vaccine_id")
    private Long vaccineId;

    @Column(name = "vaccine_name", nullable = false)
    private String vaccineName;

    @Column(name = "description")
    private String description;
    
    @Column(name = "forDisease")
    private String forDisease;
    
    @Column(name = "agegroup")
    private int ageGroup;

    @Column(name = "deadline", nullable = false)
    private LocalDate deadline;

    @Column(name = "no_of_doses", nullable = false)
    private Integer noOfDoses;

    @Column(name = "dose_given", nullable = false)
    private Integer doseGiven;

    @Column(name = "priority", nullable = false)
    private String priority;

    @Column(name = "risk", nullable = false)
    private String risk;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "recommendation_status", nullable = false)
    private String recommendationStatus;
}

