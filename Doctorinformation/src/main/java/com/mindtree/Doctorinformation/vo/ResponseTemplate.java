package com.mindtree.Doctorinformation.vo;

import java.util.List;

import com.mindtree.Doctorinformation.Entity.Doctor;

public class ResponseTemplate {
	private Doctor doctor;
	private List<Patient> patients;
	public ResponseTemplate() {
		super();
	}
	
	public ResponseTemplate(Doctor doctor, List<Patient> patients) {
		super();
		this.doctor = doctor;
		this.patients = patients;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	

}
