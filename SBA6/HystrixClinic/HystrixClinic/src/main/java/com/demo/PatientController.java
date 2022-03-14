package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/save")
	@HystrixCommand(fallbackMethod = "fallbackDisplay")
//	public Patient savePatient(@RequestBody Patient patient)
//	{
//		return patientService.savePatient(patient);
//	}
//	
	
	public String fallbackDisplay() 
	{
		return "Save is not working, please try after sometime....";
	}
	
	@GetMapping("/list")
	public List<Patient> getPatients(@RequestBody Patient patient)
	{
		return patientService.getPatients();
	}
	
	@PutMapping("/update/{patient_id}")
	public Patient updatePatient(@RequestBody Patient patient, @PathVariable("patient_id") Long id)
	{
		return patientService.updatePatient(id, patient);
	}
	
	@PutMapping("/delete/{patient_id}")
	public String deletePatient(@PathVariable("patient_id") Long id)
	{
		 patientService.deletePatient(id);
		 return "deleted successfully";
	}
	
}
