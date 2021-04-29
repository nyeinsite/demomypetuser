package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Report;
import com.example.demo.entity.Schedule;
import com.example.demo.entity.Treatment;
import com.example.demo.exception.ScheduleNotFoundException;
import com.example.demo.repository.ReportRepository;

@RestController
@RequestMapping("/report")
public class ReportController {
@Autowired
private ReportRepository repository;

@GetMapping("/GET/all")
public List<Report> getAllReport(){
	return repository.findAll();
}
@PostMapping("/POST")
public Report saveTreatment(@RequestBody Report reqReport) {
	return repository.save(reqReport);
}
@PutMapping("/PUT/id/{id}")
public Report overrideSchedule(@PathVariable("id")int id,@RequestBody Report reqReport) throws ScheduleNotFoundException {
	Report report=repository.findById(id).orElseThrow(()->new ScheduleNotFoundException(id));
	return repository.save(reqReport);
	
}


}
