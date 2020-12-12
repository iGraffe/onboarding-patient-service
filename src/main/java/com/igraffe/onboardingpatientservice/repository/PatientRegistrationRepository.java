package com.igraffe.onboardingpatientservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.igraffe.onboardingpatientservice.entity.PatientRegistration;

@Repository
public interface PatientRegistrationRepository extends MongoRepository<PatientRegistration, Long> {

}
