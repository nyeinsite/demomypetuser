package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Schedule;
import com.example.demo.exception.ScheduleNotFoundException;
import com.example.demo.repository.ScheduleRepository;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
@Autowired
private ScheduleRepository repository;

@PostMapping("/POST/param")
public Schedule saveScheduleParam(@RequestParam("dayname")String dayname,@RequestParam("starttime")String starttime,@RequestParam("endtime")String endtime,@RequestParam("doctorid")int doctorid)
{
	Schedule schedule=new Schedule(dayname,starttime,endtime,doctorid);
	return repository.save(schedule);
	}

@PostMapping("/POST/{dayname}/{starttime}/{endtime}/{doctorid}")
public Schedule saveSchedulePath(@PathVariable("dayname")String dayname,@PathVariable("starttime")String starttime,@PathVariable("endtime")String endtime,@PathVariable("doctorid")int doctorid) {
	Schedule schedule=new Schedule(dayname,starttime,endtime,doctorid);
	return repository.save(schedule);
}

@PostMapping("/POST")
public Schedule saveSchedule(@RequestBody Schedule reqSchedule) {
	return repository.save(reqSchedule);
}

@GetMapping("/GET/all")
public List<Schedule> getAllUser(){
	return repository.findAll();
}


@GetMapping("/GET/id/{id}")
public Schedule getById(@PathVariable("id") int id) throws ScheduleNotFoundException {
    return repository.findById(id).orElseThrow(() -> new ScheduleNotFoundException(id));
}

@GetMapping("/GET/doctorid/{doctorid}")
public List<Schedule> getByDoctorId(@PathVariable("doctorid")int id){
	return repository.selectScheduleBydoctorId(id);
}

@PutMapping("/PUT/id/{id}")
public Schedule overrideSchedule(@PathVariable("id")int id,@RequestBody Schedule reqSchedule) throws ScheduleNotFoundException {
	Schedule schedule=repository.findById(id).orElseThrow(()->new ScheduleNotFoundException(id));
	return repository.save(reqSchedule);
	
}

@DeleteMapping("/DELETE/id/{id}")
public ResponseEntity<?> deleteUser(@PathVariable("id")int id)throws ScheduleNotFoundException{
	Schedule schedule=repository.findById(id).orElseThrow(()->new ScheduleNotFoundException(id));
	repository.delete(schedule);
	return ResponseEntity.ok().build();
}
}

