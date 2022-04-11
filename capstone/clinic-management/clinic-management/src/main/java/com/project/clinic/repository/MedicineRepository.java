package com.project.clinic.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.clinic.entity.Medicine;

@Repository
public interface MedicineRepository  extends MongoRepository<Medicine, String>{


}
