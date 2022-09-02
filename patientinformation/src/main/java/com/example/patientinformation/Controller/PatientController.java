package com.example.patientinformation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.patientinformation.Entity.Patient;
import com.example.patientinformation.Service.PatientService;
import com.example.patientinformation.vo.ResponseTemplate;

@RestController
@RequestMapping("/patients")
//@CrossOrigin(origins="http://localhost:4200/")
public class PatientController {
	
	@Autowired
	private PatientService patServ;
	
	@PostMapping("/patient")
	public  ResponseEntity<Patient> savePatient(@RequestBody Patient p) {
		return patServ.addPatient(p);
	}
	
	@GetMapping("/patient")
	public List<Patient> getAll(){
		return patServ.getAllPatients();
	}
	
	@GetMapping("/patient/{id}")
	public String getPatientById(@PathVariable int id) {
		return patServ.getPatientById(id);
		}
	
	@GetMapping("/docidwithdocName/{id}")
	public ResponseTemplate getDoctorNameById(@PathVariable int id) {
		return patServ.getDoctorNameById(id);
	}
	

}
