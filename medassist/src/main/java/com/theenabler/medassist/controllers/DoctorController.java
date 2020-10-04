package com.theenabler.medassist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.theenabler.medassist.models.Doctor;
import com.theenabler.medassist.services.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping(path = "/doctor", consumes = "application/json")
	public Doctor createDoctorForSignUp(@RequestBody Doctor doctor) {
		
		return doctorService.createDoctor(doctor);
	}
	
	@GetMapping(path = "/doctor/check/{username}/{password}")
	public Boolean isDoctorRegisteredForSignIn(@PathVariable String username, @PathVariable String password) {
		
		return doctorService.isUsernameAndPasswordExists(username, password);
	}
	
	@GetMapping(path = "/doctor/{username}")
	public Doctor getDoctorForSignIn(@PathVariable String username) {
		
		return doctorService.getDoctor(username);
	}
	
	@GetMapping(path = "/doctor/all")
	public List<Doctor> getAllDoctors() {
		
		return doctorService.getAllDoctors();
	}
	
	@PutMapping(path = "/doctor", consumes = "application/json")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		
		return doctorService.updateDoctor(doctor);
	}
	
	@DeleteMapping(path = "/doctor/{username}")
	public void deleteDoctorForSignIn(@PathVariable String username) {
		
		doctorService.deleteDoctor(username);
	}
}
