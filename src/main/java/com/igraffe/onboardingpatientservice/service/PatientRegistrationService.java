package com.igraffe.onboardingpatientservice.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.igraffe.onboardingpatientservice.entity.PatientRegistration;

public interface PatientRegistrationService {

	public PatientRegistration addDPatientRegistrations(@RequestBody PatientRegistration patientRegistration);
	
	public List<PatientRegistration> listPatientRegistrations();
}
