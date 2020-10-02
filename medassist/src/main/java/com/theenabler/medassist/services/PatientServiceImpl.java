package com.theenabler.medassist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theenabler.medassist.dao.PatientDao;
import com.theenabler.medassist.models.Patient;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientDao patientDao;
	
	@Override
	public Patient createPatient(Patient patient) {
		
		return patientDao.save(patient);
	}

	@Override
	public Patient getPatient(String username) {
	
		return patientDao.findPatientbyUsername(username);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		
		return patientDao.save(patient);
	}

	@Override
	public void deletePatient(String username) {
		
		patientDao.delete(patientDao.findPatientbyUsername(username));
	}

	@Override
	public Boolean isUsernameAndPasswordExists(String username, String password) {
		
		Patient patient = patientDao.findPatientbyUsernameAndPassword(username, password);
		
		return (patient != null);
	}

	@Override
	public List<Patient> getAllPatients() {
		
		return patientDao.findAll();
	}

}
