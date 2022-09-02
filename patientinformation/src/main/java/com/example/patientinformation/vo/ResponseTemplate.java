package com.example.patientinformation.vo;

import com.example.patientinformation.Entity.Patient;

public class ResponseTemplate {
	private Patient patient;
	private Doctor doctor;
	
	public ResponseTemplate() {
		super();
	}
	
	public ResponseTemplate(Patient patient, Doctor doctor) {
		super();
		this.patient= patient;
		this.doctor= doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	}
