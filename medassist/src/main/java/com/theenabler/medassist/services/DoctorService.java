package com.theenabler.medassist.services;

import java.util.List;

import com.theenabler.medassist.models.Doctor;

public interface DoctorService {

	Doctor createDoctor(Doctor doctor);
	Doctor getDoctor(String username);
	List<Doctor> getAllDoctors();
	Doctor updateDoctor(Doctor doctor);
	void deleteDoctor(String username);
	Boolean isUsernameAndPasswordExists(String username, String password);
	
}
