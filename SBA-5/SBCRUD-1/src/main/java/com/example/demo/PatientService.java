package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService 
{
@Autowired
PatientRepository patientRepository;
//getting all books record by using the method findaAll() of CrudRepository
public List<Patient> getAllPatient() 
{
List<Patient> patient = new ArrayList<Patient>();
patientRepository.findAll().forEach(patient1 -> patient.add(patient1));
return patient;
}
//getting a specific record by using the method findById() of CrudRepository
public Patient getPatientById(int id) 
{
return patientRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Patient patient) 
{
patientRepository.save(patient);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
patientRepository.deleteById(id);
}
//updating a record
public void update(Patient patient, int patientid) 
{
patientRepository.save(patient);
}
}
