package com.demo;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface PatientRepository extends MongoRepository<Patient, Long> {

}
