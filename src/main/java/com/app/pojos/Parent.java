package com.app.pojos;

import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.*;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "parent")
public class Parent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parentId;
    
    @NotBlank(message = "First name is required")
    @Size(max = 20, message = "Maximum first name length is 20 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(max = 20, message = "Maximum last name length is 20 characters")
    private String lastName;
    
    @NotBlank
    private String email;
    
    @NotBlank(message = "Phone number is required")
    @Size(min = 10, max = 10, message = "Phone number should have 10 digits")
    private String phoneNumber;
    
    @NotBlank
    private String address;
    
    private boolean active;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

//    @OneToOne(mappedBy = "parent")
//    private Child child;
    
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Child> children;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Appointment> appointments;
    
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private Set<Notification> notifications;
    
}

