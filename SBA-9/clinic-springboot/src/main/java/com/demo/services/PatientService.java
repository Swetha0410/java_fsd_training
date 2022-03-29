package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Patient;
import com.demo.repository.PatientRepository;



@Service
public class PatientService {
	
	@Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
    
    public List<Patient> addAllPatients(List<Patient> patients) {
        return  patientRepository.saveAll(patients);
    }

    public Patient getPatientByID(int id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient getPatientByName(String name) {
        return  patientRepository.findByName(name);
    }

    public Patient updatePatient(Patient patient) {
        Patient existingPTN = patientRepository.findById(patient.getId()).orElse(null);
        System.out.println(patient);
        if(existingPTN == null) {
            System.out.println("Ptn not found");
            return  patientRepository.save(patient);
        }else  {
            existingPTN.setName(patient.getName());
            existingPTN.setMobile(patient.getMobile());
            existingPTN.setAge(patient.getAge());
            existingPTN.setGender(patient.getGender());
            existingPTN.setDoctor(patient.getDoctor());
            existingPTN.setVaccine(patient.getVaccine());
            patientRepository.save(existingPTN);
        }
        return patient;
    }

    public boolean deletePatientByID(int id) {
        Patient existingPTN = patientRepository.getById(id);
        if(existingPTN != null) {
            patientRepository.deleteById(id);
            return true;
        }
        return false;
    }

   
   
    
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

}
