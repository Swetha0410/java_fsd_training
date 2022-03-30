package com.demo;

import java.util.List;



public interface PatientService {
	
	public Patient savePatient(Patient patient);
	
	public List<Patient> getPatients();
	
	public Patient updatePatient(Long id, Patient patient);
	
	public void deletePatient(Long id); 

}
