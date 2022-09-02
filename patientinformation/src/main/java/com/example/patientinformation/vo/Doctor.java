package com.example.patientinformation.vo;

public class Doctor {
	private int docId;
	private String name;
	private int age;
	private String gender;
	private String specialist;
	private int noOfPatients;
	
	public Doctor() {
		super();
	}

	public Doctor(int docId, String name, int age, String gender, String specialist, int noOfPatients) {
		super();
		this.docId = docId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialist = specialist;
		this.noOfPatients = noOfPatients;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
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

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public int getNoOfPatients() {
		return noOfPatients;
	}

	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}
	}
