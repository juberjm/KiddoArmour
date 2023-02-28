package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Doctor;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctor, Long> {
    
	
	/* ---- These will be present by Default ---
	save(entity) to create or update a doctor
	findById(id) to find a doctor by ID
	findAll() to get all doctors
	delete(entity) to delete a doctor
	deleteById(id) to delete a doctor by ID
	 */
	//Shows List of all doctors
//	List<Doctor> findAll();
	
	//If doctor with given ID is present will return true, or else return false
//    Optional<Doctor> findByDoctorId(Long id);
        
    //Save doctor to the Database and returns the doctor.
//    Doctor save(Doctor doctor);
    
    //Deletes doctor by ID.
//    void deleteByDoctorId(Long id);
    
    //List of verified Doctors
    List<Doctor> findByVerified(Boolean verified);
    
    // find all doctors by specialization
    List<Doctor> findBySpeciality(String speciality);
    
    // find all doctors by clinic id
    List<Doctor> findByClinic(Long clinicId);
    
    // find all doctors by first name or last name
    List<Doctor> findByFirstNameOrLastName(String firstName, String lastName);
    
 // find all doctors by gender and specialization
    List<Doctor> findByGenderAndSpeciality(String gender, String speciality);
    
//     find a doctor by email
//    Optional<Doctor> findByEmail(String email);
    
//  List of verified Doctors
//  List<Doctor> findByUnVerified(Boolean Verified);
        
//     find all doctors by availability
//    List<Doctor> findByAvailability(Boolean availability);
    
//     find all doctors by rating
//    List<Doctor> findByRatingGreaterThan(Double rating);
}
