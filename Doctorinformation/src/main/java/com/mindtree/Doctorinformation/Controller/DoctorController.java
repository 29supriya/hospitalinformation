package com.mindtree.Doctorinformation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Doctorinformation.Entity.Doctor;
import com.mindtree.Doctorinformation.Service.DoctorService;

@RestController
@RequestMapping("/doctors")
@CrossOrigin(origins="http://localhost:4200/")
public class DoctorController {
	
	@Autowired
	private DoctorService docserv;
	
	@PostMapping("/doctor")
	public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor d){
		return docserv.addDoctor(d);
		
	}
	
	@GetMapping("/doctor")
	public List<Doctor> getAll(){
		return docserv.getAllDoctors();
	}
	
	@GetMapping("/doctor/{id}")
	public Doctor getDoctor(@PathVariable int id) {
		return docserv.getDoctorById(id);
	}
	
	@GetMapping("/doctorNames")
	public List<String> getAllDoctorNames(){
		return docserv.getAllDoctorNames();
	}
	
	@GetMapping("/doctorname/{name}")
	public Doctor getDoctorUsingName(@PathVariable String name) {
		return docserv.getDoctorByNames(name);
	}
	
	//@GetMapping("/docnamebyid/{id}")
	//public String getDoctorNameById(@PathVariable int id) {
		//return docserv.getDoctorNameById(id);
	//}
	
	}
	
	
