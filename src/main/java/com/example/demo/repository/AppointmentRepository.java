package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Appointment;
public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{

@Query(value="select * from appointment where doctorname=? && appoint=?",nativeQuery=true)
public List<Appointment> selectAppointBydoctorName(String name,String appoint);

@Query(value="select * from appointment where doctorid=?",nativeQuery=true)
public List<Appointment> selectAppointBydoctorId(int doctorid);

@Query(value="select * from appointment where userid=?",nativeQuery=true)
public List<Appointment> selectAppointByuserId(int userid);

@Query(value="select * from appointment where appoint=?",nativeQuery=true)
public List<Appointment> findAllTreatmented(String appoint);
}
