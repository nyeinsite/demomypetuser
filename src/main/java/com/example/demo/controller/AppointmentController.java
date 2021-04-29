package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Report;
import com.example.demo.entity.User;
import com.example.demo.exception.AppointmentNotFoundException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.AppointmentRepository;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	@Autowired
	private AppointmentRepository repository;

	@GetMapping("/GET/all")
	public List<Appointment> getAllAppointment() {
		return repository.findAll();
	}

	@GetMapping("/GET/appoint/{appoint}")
	public List<Appointment> getAllTreatmented(@PathVariable("appoint")String appoint){
		return repository.findAllTreatmented(appoint);
	}
	/*
	 * @PostMapping(
	 * "/POST/{appointmentdate}/{appointmentime}/{username}/{doctorname}/{petname}/{age}/{type}/{bloodtype}/{species}/{appoint}")
	 * public Appointment saveAppointmentPath(@PathVariable("appointmentdate")String
	 * appointmentdate,@PathVariable("appointmenttime")String
	 * appointmenttime,@PathVariable("username")String
	 * username,@PathVariable("doctorname")String
	 * doctorname,@PathVariable("petname")String petname,@PathVariable("age")String
	 * age,@PathVariable("type")String type,@PathVariable("bloodtype")String
	 * bloodtype,@PathVariable("species")String
	 * species,@PathVariable("appoint")String appoint) { Appointment appointment=new
	 * Appointment(appointmentdate,appointmenttime,username,doctorname,petname,age,
	 * type,bloodtype,species,appoint); return repository.save(appointment); }
	 * 
	 * @PostMapping("/POST/param") public Appointment
	 * saveAppointmentParam(@RequestParam("appointmentdate")String
	 * appointmentdate,@RequestParam("appointmentime")String
	 * appointmenttime,@RequestParam("username")String
	 * username,@RequestParam("doctorname")String
	 * doctorname,@RequestParam("petname")String petname,@RequestParam("age")String
	 * age,@RequestParam("type")String type,@RequestParam("bloodtype")String
	 * bloodtype,@RequestParam("species")String
	 * species,@RequestParam("appoint")String appoint) { Appointment appointment=new
	 * Appointment(appointmentdate,appointmenttime,username,doctorname,petname,age,
	 * type,bloodtype,species,appoint); return repository.save(appointment); }
	 */
	@PostMapping("/POST")
	public Appointment saveAppointment(@RequestBody Appointment reqAppointment) {

		return repository.save(reqAppointment);
	}

	@GetMapping("/GET/id/{id}")
	public Appointment getById(@PathVariable("id") int id) throws AppointmentNotFoundException {
		return repository.findById(id).orElseThrow(() -> new AppointmentNotFoundException(id));
	}

	@GetMapping("/GET/doctorid/{doctorid}")
	public List<Appointment> getAppointByDoctorId(@PathVariable("doctorid") int doctorid) {
		return repository.selectAppointBydoctorId(doctorid);
	}
@GetMapping("/GET/userid/{userid}")
public List<Appointment> getAppointByUserId(@PathVariable("userid")int userid){
	return repository.selectAppointByuserId(userid);
}
	@GetMapping("/GET/doctorname/{doctorname}")
	public List<Appointment> getByDoctorname(@PathVariable("doctorname") String doctorname) {
		return repository.selectAppointBydoctorName(doctorname, "make");
	}

	@PutMapping("/PUT/id/{id}")
	public Appointment overrideUser(@PathVariable("id") int id, @RequestBody Appointment reqAppointment)
			throws UserNotFoundException {
		Appointment appointment = repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
		return repository.save(reqAppointment);
	}

}
