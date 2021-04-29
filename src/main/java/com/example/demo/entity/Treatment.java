package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="treatment")
public class Treatment {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(length=50,nullable=false)
private String treatmentdate;
@Column(length=50,nullable=false)
private String customername;
@Column(length=50,nullable=false)
private String doctorname;
@Column(length=50,nullable=false)
private String petname;
@Column(length=50,nullable=false)
private String petage;
@Column(length=50,nullable=false)
private String report;
public Treatment() {
	super();
}
public Treatment(String treatmentdate, String customername, String doctorname, String petname, String petage,
		String report) {
	super();
	this.treatmentdate = treatmentdate;
	this.customername = customername;
	this.doctorname = doctorname;
	this.petname = petname;
	this.petage = petage;
	this.report = report;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTreatmentdate() {
	return treatmentdate;
}
public void setTreatmentdate(String treatmentdate) {
	this.treatmentdate = treatmentdate;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
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
public String getPetage() {
	return petage;
}
public void setPetage(String petage) {
	this.petage = petage;
}
public String getReport() {
	return report;
}
public void setReport(String report) {
	this.report = report;
}

}
