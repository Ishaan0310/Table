package com.example.demo.SummerInterns;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Interns {
	
	@Id
	public String _id;
	
	private String employee_id;
	private String start_date;
	private String end_date;
	private String job_id;
	private String department_id;

	

}
