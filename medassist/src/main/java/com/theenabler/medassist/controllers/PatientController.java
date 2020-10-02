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

import com.theenabler.medassist.models.Patient;
import com.theenabler.medassist.services.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping(path = "/patient", consumes = "application/json")
	public Patient createPatientForSignUp(@RequestBody Patient patient) {
		
		return patientService.createPatient(patient);
	}
	
	@GetMapping(path = "/patient/check/{username}/{password}")
	public Boolean isPatientRegisteredForSignIn(@PathVariable String username, @PathVariable String password) {
		
		return patientService.isUsernameAndPasswordExists(username, password);
	}
	
	@GetMapping(path = "/patient/{username}")
	public Patient getPatientForSignIn(@PathVariable String username) {
		
		return patientService.getPatient(username);
	}
	
	@GetMapping(path = "/patient/all")
	public List<Patient> getAllPatients() {
		
		return patientService.getAllPatients();
	}
	
	@PutMapping(path = "/patient", consumes = "application/json")
	public Patient updatePatient(@RequestBody Patient patient) {
		
		return patientService.updatePatient(patient);
	}
	
	@DeleteMapping(path = "/patient/{username}")
	public void deletePatientForSignIn(@PathVariable String username) {
		
		patientService.deletePatient(username);
	}
}
