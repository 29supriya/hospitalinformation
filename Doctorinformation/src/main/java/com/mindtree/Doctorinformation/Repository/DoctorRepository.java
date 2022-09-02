package com.mindtree.Doctorinformation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.Doctorinformation.Entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{
	
	@Query(value="SELECT D.NAME FROM doctor d",nativeQuery=true)
	List<String> findAllByDoctorName();
	
	@Query(value="SELECT d.name FROM doctor d where d.name=:name",nativeQuery=true)
	Doctor getDoctorByName(String name);
	
	

}
