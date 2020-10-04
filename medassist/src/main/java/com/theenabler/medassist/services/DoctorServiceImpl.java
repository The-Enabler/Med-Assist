package com.theenabler.medassist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theenabler.medassist.dao.DoctorDao;
import com.theenabler.medassist.models.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorDao doctorDao;
	
	@Override
	public Doctor createDoctor(Doctor doctor) {
		
		return doctorDao.save(doctor);
	}

	@Override
	public Doctor getDoctor(String username) {
	
		return doctorDao.findDoctorbyUsername(username);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		
		return doctorDao.save(doctor);
	}

	@Override
	public void deleteDoctor(String username) {
		
		doctorDao.delete(doctorDao.findDoctorbyUsername(username));
	}

	@Override
	public Boolean isUsernameAndPasswordExists(String username, String password) {
		
		Doctor doctor = doctorDao.findDoctorbyUsernameAndPassword(username, password);
		
		return (doctor != null);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		
		return doctorDao.findAll();
	}

}
