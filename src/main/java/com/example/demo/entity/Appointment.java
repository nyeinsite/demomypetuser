package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=50,nullable=false)
	private String appointmentdate;
	@Column(length=50,nullable=false)
	private String appointmentime;
	@Column(length=50,nullable=false)
	private String username;
	@Column(length=50,nullable=false)
	private String doctorname;
	@Column(length=50,nullable=false)
	private String petname;
	@Column(length=50,nullable=false)
	private String age;
	@Column(length=50,nullable=false)
	private String type;
	@Column(length=50,nullable=false)
	private String bloodtype;
	@Column(length=50,nullable=false)
	private String species;
	@Column(length=50,nullable=false)
	private String appoint;
	@Column(length=50,nullable=false)
	private String report;
	@Column(length=50,nullable=false)
	private int doctorid;
	@Column(length=50,nullable=false)
	private int userid;
	public Appointment() {
		super();
	}
	public Appointment(String appointmentdate, String appointmentime, String username, String doctorname,
			String petname, String age, String type, String bloodtype, String species, String appoint, String report,
			int doctorid, int userid) {
		super();
		this.appointmentdate = appointmentdate;
		this.appointmentime = appointmentime;
		this.username = username;
		this.doctorname = doctorname;
		this.petname = petname;
		this.age = age;
		this.type = type;
		this.bloodtype = bloodtype;
		this.species = species;
		this.appoint = appoint;
		this.report = report;
		this.doctorid = doctorid;
		this.userid = userid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public String getAppointmentime() {
		return appointmentime;
	}
	public void setAppointmentime(String appointmentime) {
		this.appointmentime = appointmentime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBloodtype() {
		return bloodtype;
	}
	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getAppoint() {
		return appoint;
	}
	public void setAppoint(String appoint) {
		this.appoint = appoint;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

	
}
