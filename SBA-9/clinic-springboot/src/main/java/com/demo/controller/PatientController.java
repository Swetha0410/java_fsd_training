package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Patient;
import com.demo.services.PatientService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/ptn")
public class PatientController {
	
	@Autowired
    private PatientService patientService;
	
	@PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }
	
	@PostMapping("/addPatients")
    public List<Patient> addAllPatients(@RequestBody List<Patient> patients) {
        return patientService.addAllPatients(patients);
    }


    @GetMapping("/getPatientByID/{id}")
    public Patient getPatientById(@PathVariable int id) {
        return patientService.getPatientByID(id);
    }

  
    @GetMapping("/getPatientByName/{name}")
    public Patient getPatientByName(@PathVariable String name) {
        return  patientService.getPatientByName(name);
    }

  
    @PutMapping("/updatePatient")
    public Patient updatePAtient(@RequestBody Patient patient) {
        return patientService.updatePatient(patient);
    }

  
    @DeleteMapping("/deletePatientById/{id}")
    public boolean deletePatientByID(@PathVariable int id) {
        return patientService.deletePatientByID(id);
    }

     
    
    @GetMapping("/getAll")
    public List<Patient> getAllPatient() {
        return patientService.getAllPatients();
    }

}
