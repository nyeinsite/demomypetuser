package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="report")
public class Report {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(length=50,nullable=false)
private String customername;
@Column(length=50,nullable=false)
private String reportdate;
@Column(length=50,nullable=false)
private String description;
@Column(length=50,nullable=false)
private int treatmentid;
@Column(length=50,nullable=false)
private String report;
public Report() {
	super();
}
public Report(String customername, String reportdate, String description, int treatmentid, String report) {
	super();
	this.customername = customername;
	this.reportdate = reportdate;
	this.description = description;
	this.treatmentid = treatmentid;
	this.report = report;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getReportdate() {
	return reportdate;
}
public void setReportdate(String reportdate) {
	this.reportdate = reportdate;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getTreatmentid() {
	return treatmentid;
}
public void setTreatmentid(int treatmentid) {
	this.treatmentid = treatmentid;
}
public String getReport() {
	return report;
}
public void setReport(String report) {
	this.report = report;
}

}
