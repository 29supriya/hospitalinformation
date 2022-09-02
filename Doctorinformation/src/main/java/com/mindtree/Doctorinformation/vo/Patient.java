package com.mindtree.Doctorinformation.vo;

public class Patient {
	private int pattientId;
	private String name;
	private String dateOfVisit;
	private int doctorId;
	
	public Patient() {
		super();
	}

	public Patient(int pattientId, String name, String dateOfVisit, int doctorId) {
		super();
		this.pattientId = pattientId;
		this.name = name;
		this.dateOfVisit = dateOfVisit;
		this.doctorId = doctorId;
	}

	public int getPattientId() {
		return pattientId;
	}

	public void setPattientId(int pattientId) {
		this.pattientId = pattientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	

}
