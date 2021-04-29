package com.example.demo.exception;

public class AppointmentNotFoundException extends Exception {
	public AppointmentNotFoundException(int id) {
		super(String.format("Appointment with id :"+id+"Not Found!"));
	}
}
