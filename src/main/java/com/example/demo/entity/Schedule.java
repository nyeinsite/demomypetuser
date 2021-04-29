package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
public class Schedule {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(length = 50,nullable = false)
private String dayname;
@Column(length = 50,nullable = false)
private String starttime;
@Column(length = 50,nullable = false)
private String endtime;
@Column(length=50,nullable=false)
private int doctorid;


public Schedule( String dayname, String starttime, String endtime, int doctorid) {
	
	this.dayname = dayname;
	this.starttime = starttime;
	this.endtime = endtime;
	this.doctorid = doctorid;
}
public Schedule() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDayname() {
	return dayname;
}
public void setDayname(String dayname) {
	this.dayname = dayname;
}
public String getStarttime() {
	return starttime;
}
public void setStarttime(String starttime) {
	this.starttime = starttime;
}
public String getEndtime() {
	return endtime;
}
public void setEndtime(String endtime) {
	this.endtime = endtime;
}
public int getDoctorid() {
	return doctorid;
}
public void setDoctorid(int doctorid) {
	this.doctorid = doctorid;
}
}