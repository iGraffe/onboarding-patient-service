package com.igraffe.onboardingpatientservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "patient_registration")
public class PatientRegistration {

	@Id
	private long mobileNumber;

	private String name;
	
	private int houseNo;
	
	private String street;
	
	private String city;
	
	private int pinCode;
	
	private int age;
	
	private String emailId;
	
	private long medicalRecordNo;
	
	private long identityCardNo;
	
	private String photographicImage;

	private String gender;
	
	private int height;
	
	private int bmi;
	
	private String bloodGroup;
	
	private String language;
	
	private String dieaseInformation;
	
	private String insuranceInformation;
	
	private String medicalHistory;
	
}
