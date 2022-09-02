package com.example.patientinformation.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient<DATE> {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patId;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="dateOfVisit")
	private String dateOfVisit;
	@Column(name="docId")
	private int docId;
	@Column(name="prescription")
	private String prescription;
	@Column(name="doctorname")
	private String doctorname;
	
	
	public Patient() {
		super();
	}


	public Patient(int patId, String name, int age, String gender, String dateOfVisit, int docId, String prescription,
			String doctorname) {
		super();
		this.patId = patId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dateOfVisit = dateOfVisit;
		this.docId = docId;
		this.prescription = prescription;
		this.doctorname = doctorname;
	}


	public int getPatId() {
		return patId;
	}


	public void setPatId(int patId) {
		this.patId = patId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDateOfVisit() {
		return dateOfVisit;
	}


	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}


	public int getDocId() {
		return docId;
	}


	public void setDocId(int docId) {
		this.docId = docId;
	}


	public String getPrescription() {
		return prescription;
	}


	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}


	public String getDoctorname() {
		return doctorname;
	}


	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}


	@Override
	public String toString() {
		return "Patient [patId=" + patId + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dateOfVisit="
				+ dateOfVisit + ", docId=" + docId + ", prescription=" + prescription + ", doctorname=" + doctorname
				+ "]";
	}

  
	
	
	

}
