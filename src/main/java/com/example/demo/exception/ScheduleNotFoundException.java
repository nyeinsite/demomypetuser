package com.example.demo.exception;

public class ScheduleNotFoundException extends Exception{
	
public ScheduleNotFoundException(int id) {
	super(String.format("Schedule with id :"+id+"Not Found!"));
}
}
