package com.igraffe.onboardingpatientservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igraffe.onboardingpatientservice.entity.PatientRegistration;
import com.igraffe.onboardingpatientservice.service.PatientRegistrationService;

@RestController
@RequestMapping("/patientRegistration")
public class PatientRegistrationController {
	
	private PatientRegistrationService patientRegistrationService;
	
	public PatientRegistrationController(PatientRegistrationService patientRegistrationService) {
		this.patientRegistrationService = patientRegistrationService;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public PatientRegistration addDPatientRegistrations(@RequestBody PatientRegistration patientRegistration) {
		return patientRegistrationService.addDPatientRegistrations(patientRegistration);
		//return patientRegistrationRepository.save(patientRegistration);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<PatientRegistration> listPatientRegistrations() {
		return patientRegistrationService.listPatientRegistrations();
	}

}
