package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule,Integer> {

	@Query(value="select * from schedule where doctorid=?",nativeQuery=true)
	public List<Schedule> selectScheduleBydoctorId(int id);
}
