package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Treatment;
import com.example.demo.repository.TreatmentRepository;

@RestController
@RequestMapping("/treatment")
public class TreatmentController {
@Autowired
private TreatmentRepository repository;

@PostMapping("/POST")
public Treatment saveTreatment(@RequestBody Treatment reqTreatment) {
	return repository.save(reqTreatment);
}


}
