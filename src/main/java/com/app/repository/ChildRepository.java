package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long>{

	List<Child> findByParent(Long parentId);
	
	
	Child findByFirstName(String fname);
	
	Child findByLastName(String lname);
	
	Child findByFirstNameAndLastName(String fname,String lname);

    Child findByParentAndChildId(Long parentId, Long childId);

//    List<Child> findByClinicIdAndVaccinationIdIsNull(Long clinicId);
//
//    List<Child> findByClinicIdAndVaccinationIdIsNotNull(Long clinicId);
}
