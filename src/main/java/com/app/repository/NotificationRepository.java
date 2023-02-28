package com.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
	
//    List<Notification> findByRecipientAndStatus(User recipient, NotificationStatus status);
}
