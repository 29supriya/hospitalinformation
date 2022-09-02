package com.mindtree.Doctorinformation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mindtree.Doctorinformation.Entity.Doctor;
import com.mindtree.Doctorinformation.Repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository docRepo;
	
	
	
	
	public List<Doctor> getAllDoctors(){
		return docRepo.findAll();
	}
	
	public ResponseEntity<Doctor> addDoctor(Doctor d){
		return new ResponseEntity<Doctor>(docRepo.save(d),HttpStatus.CREATED);
	}
	
	public Doctor getDoctorById(int id) {
		Doctor d = docRepo.findById(id).get();
		if(d!=null) {
			return d;
		}
		return null;
	}
	
	public List<String> getAllDoctorNames(){
		return docRepo.findAllByDoctorName();
	}
	
	public Doctor getDoctorByNames(String name) {
		return docRepo.getDoctorByName(name);
	}
	
	
	
		
	}

