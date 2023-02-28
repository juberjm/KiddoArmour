package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "clinic")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clinic {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinic_id")
    private Long clinicId;

    @NotBlank(message = "Clinic name is mandatory")
    @Column(name = "clinic_name")
    private String clinicName;

    @NotBlank(message = "Clinic address is mandatory")
    @Column(name = "clinic_address")
    private String clinicAddress;

    @NotBlank(message = "City is mandatory")
    @Column(name = "city")
    private String city;

    @NotBlank(message = "State is mandatory")
    @Column(name = "state")
    private String state;

    @NotBlank(message = "Zip code is mandatory")
    @Column(name = "zip_code")
    private String zipCode;

    @NotBlank(message = "Clinic email is mandatory")
    @Email(message = "Invalid email format")
    @Column(name = "clinic_email")
    private String clinicEmail;

    @Column(name = "clinic_website")
    private String clinicWebsite;

    @NotBlank(message = "Clinic contact is mandatory")
    @Column(name = "clinic_contact")
    private String clinicContact;
    
    @OneToMany(mappedBy = "clinic", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClinicHours> operatingHours = new ArrayList<>();
    
    
}

