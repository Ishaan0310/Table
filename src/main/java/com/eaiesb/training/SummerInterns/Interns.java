package com.eaiesb.training.SummerInterns;

import org.springframework.data.annotation.Id;

public class Interns {
	
	@Id
	public String _id;
	
	
	private String firstName;
	private String lastName;
	private String studentNumber;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	

}
