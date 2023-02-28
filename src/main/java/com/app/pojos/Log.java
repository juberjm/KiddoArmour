package com.app.pojos;

import java.sql.Timestamp;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long logId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "event")
    private String event;

    @Column(name = "event_details")
    private String eventDetails;

    @Column(name = "timestamp")
    private Timestamp timestamp;
    
//    @Column(name="admin_log")
    @ManyToOne
    @JoinColumn(name = "adminId")
    private Admin admin;
}

