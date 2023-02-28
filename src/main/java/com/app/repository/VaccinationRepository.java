package com.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.pojos.Vaccination;

@Repository
public interface VaccinationRepository extends JpaRepository<Vaccination, Long> {
	
	//Find a vaccination by name
	List<Vaccination> findByvaccineName(String name);
    
	//Find a vaccination for an age group
    List<Vaccination> findByAgeGroup(String ageGroup);
    
    //Find Vaccination for particular disease
    List<Vaccination> findByforDisease(String disease);
}

