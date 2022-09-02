package com.example.patientinformation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.patientinformation.Entity.Patient;
import com.example.patientinformation.Repository.PatientRepository;
import com.example.patientinformation.vo.Doctor;
import com.example.patientinformation.vo.ResponseTemplate;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patRepo;
	
	@Autowired
	private RestTemplate rt;
	
	public ResponseEntity<Patient> addPatient(Patient p){
		return new ResponseEntity<Patient>(patRepo.save(p),HttpStatus.CREATED);
	}
	
	public List<Patient> getAllPatients(){
		return patRepo.findAll();
	}
	  
	
	public String getPatientById(int id) {
		Patient p = patRepo.findById(id).get();
		if(p!=null)
			return p.toString();
		else
			return "no such patient";
	}
	
	public ResponseTemplate getDoctorNameById(int patId) {
		Patient pat=patRepo.findById(patId).get();
		ResponseTemplate restTemp = new ResponseTemplate();
		Doctor d = rt.getForObject("http://DOCTOR-SERVICE/doctors/doctor/"+pat.getDocId(), Doctor.class);
		restTemp.setDoctor(d);
		restTemp.setPatient(pat);
		return restTemp;
	}
	}

