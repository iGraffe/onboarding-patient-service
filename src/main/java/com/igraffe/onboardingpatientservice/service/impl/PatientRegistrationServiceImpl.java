package com.igraffe.onboardingpatientservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.igraffe.onboardingpatientservice.entity.PatientRegistration;
import com.igraffe.onboardingpatientservice.repository.PatientRegistrationRepository;
import com.igraffe.onboardingpatientservice.service.PatientRegistrationService;

@Service
public class PatientRegistrationServiceImpl implements PatientRegistrationService{

	private PatientRegistrationRepository patientRegistrationRepository;
	
	public PatientRegistrationServiceImpl(PatientRegistrationRepository patientRegistrationRepository) {
		this.patientRegistrationRepository = patientRegistrationRepository;
	}

	@Override
	public PatientRegistration addDPatientRegistrations(PatientRegistration patientRegistration) {
		Optional<PatientRegistration> optionalPatientRegistration = patientRegistrationRepository.findById(patientRegistration.getMobileNumber());
		if(optionalPatientRegistration.isPresent()) {
			PatientRegistration newPatientRegistration = optionalPatientRegistration.get();
			newPatientRegistration.setName(patientRegistration.getName());
			newPatientRegistration.setHouseNo(patientRegistration.getHouseNo());
			newPatientRegistration.setStreet(patientRegistration.getStreet());
			newPatientRegistration.setCity(patientRegistration.getCity());
			newPatientRegistration.setPinCode(patientRegistration.getPinCode());
			newPatientRegistration.setAge(patientRegistration.getAge());
			newPatientRegistration.setEmailId(patientRegistration.getEmailId());
			newPatientRegistration.setMedicalRecordNo(patientRegistration.getMedicalRecordNo());
			newPatientRegistration.setIdentityCardNo(patientRegistration.getIdentityCardNo());
			newPatientRegistration.setPhotographicImage(patientRegistration.getPhotographicImage());
			newPatientRegistration.setGender(patientRegistration.getGender());
			newPatientRegistration.setHeight(patientRegistration.getHeight());
			newPatientRegistration.setBmi(patientRegistration.getBmi());
			newPatientRegistration.setBloodGroup(patientRegistration.getBloodGroup());
			newPatientRegistration.setLanguage(patientRegistration.getLanguage());
			newPatientRegistration.setDieaseInformation(patientRegistration.getDieaseInformation());
			newPatientRegistration.setInsuranceInformation(patientRegistration.getInsuranceInformation());
			newPatientRegistration.setMedicalHistory(patientRegistration.getMedicalHistory());
			return patientRegistrationRepository.save(newPatientRegistration);
		}
		else
			return patientRegistrationRepository.save(patientRegistration);
	}

	@Override
	public List<PatientRegistration> listPatientRegistrations() {
		// TODO Auto-generated method stub
		return patientRegistrationRepository.findAll();
	}

}
