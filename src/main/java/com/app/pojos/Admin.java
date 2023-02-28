package com.app.pojos;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "admin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Long adminId;
    
    @Column(name = "admin_email")
    private String email;
    
    @Column(name = "admin_phone")
    private String phone;
    
    @Column(name = "admin_password")
    private String password;
    
    @Column(name = "is_superadmin")
    private Boolean isSuperadmin;
    
    @Column(name = "created_at")
    private Timestamp createdAt;
    
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL) // Connection with Log class to store logs generated as arraylist.
    private List<Log> logs = new ArrayList<>();
    
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL) //Getting notifications for doctors approval.
    private Set<Notification> notifications;

}