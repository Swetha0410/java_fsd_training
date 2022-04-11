package com.project.clinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.clinic.entity.Medicine;
import com.project.clinic.repository.MedicineRepository;

@Service
public class MedicineService {
	@Autowired
	private MedicineRepository mrepo;
	
	public void addMed(Medicine m) {
		mrepo.save(m);
	}
	
	public List<Medicine> getAllMed() {
		return mrepo.findAll();
	}
	
	public Medicine getMedById(String mid) {
		Optional<Medicine> m= mrepo.findById(mid);
		if(m.isPresent()) {
			return m.get();
		}
		return null;
	}
	
	public void deleteMed(String mid) {
		mrepo.deleteById(mid);
	}


}
