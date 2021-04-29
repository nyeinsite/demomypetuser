package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Treatment;

public interface TreatmentRepository extends JpaRepository<Treatment,Integer>{

	@Query(value="select * from treament where doctorname=?",nativeQuery=true)
	public List<Treatment> selectTreatmentBydoctorName(String name);
	
	
}
