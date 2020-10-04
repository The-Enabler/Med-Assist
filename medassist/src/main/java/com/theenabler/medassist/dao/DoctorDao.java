package com.theenabler.medassist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.theenabler.medassist.models.Doctor;

public interface DoctorDao extends JpaRepository<Doctor, Long> {

	@Query(value = "Select * from doctor where username = ?1 and password = ?2", nativeQuery = true)
	Doctor findDoctorbyUsernameAndPassword(String username, String password);
	
	@Query(value = "Select * from doctor where username = ?1", nativeQuery = true)
	Doctor findDoctorbyUsername(String username);
}
