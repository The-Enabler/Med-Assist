package com.theenabler.medassist.services;

import java.util.List;

import com.theenabler.medassist.models.Patient;

public interface PatientService {

	Patient createPatient(Patient patient);
	Patient getPatient(String username);
	List<Patient> getAllPatients();
	Patient updatePatient(Patient patient);
	void deletePatient(String username);
	Boolean isUsernameAndPasswordExists(String username, String password);
}
