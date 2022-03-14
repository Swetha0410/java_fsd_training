package com.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public Patient savePatient(Patient patient) {
		
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getPatients() {
		
		return patientRepository.findAll();
	}

	@Override
	public Patient updatePatient(Long id, Patient patient) {
		Optional<Patient> findById  = patientRepository.findById(id);
		if(findById.isPresent())
		{
			Patient patientEntity = findById.get();
			if(patient.getName() != null && !patient.getName().isEmpty())
			{
				patientEntity.setName(patient.getName());
			}
			
			if(patient.getAge() != null)
			{
				patientEntity.setAge(patient.getAge());
			}
			patientRepository.save(patientEntity);
		}
		return null;
	}

	@Override
	public void deletePatient(Long id) {
		patientRepository.deleteById(id);
		
	}

}
