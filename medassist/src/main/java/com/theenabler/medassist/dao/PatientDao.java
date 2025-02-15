package com.theenabler.medassist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.theenabler.medassist.models.Patient;

public interface PatientDao extends JpaRepository<Patient, Long> {

	@Query(value = "Select * from patient where username = ?1 and password = ?2", nativeQuery = true)
	Patient findPatientbyUsernameAndPassword(String username, String password);
	
	@Query(value = "Select * from patient where username = ?1", nativeQuery = true)
	Patient findPatientbyUsername(String username);
}

