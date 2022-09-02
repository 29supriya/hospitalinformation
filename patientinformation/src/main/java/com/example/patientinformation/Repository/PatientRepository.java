package com.example.patientinformation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.patientinformation.Entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>{
	//@Query(value="SELECT")

}
