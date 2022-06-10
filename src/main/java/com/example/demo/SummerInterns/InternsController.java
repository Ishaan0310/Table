package com.example.demo.SummerInterns;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class InternsController {
	@Autowired
	private InternsRepository internsRepo;
	@GetMapping("/interns")
	public List <Interns> getAllInterns()
	{
		return internsRepo.findAll();
	}
	@GetMapping("/interns/{employee_id}")
	public Optional<Interns> getstudentsbyid(@PathVariable String employee_id)
	{
		return internsRepo.findById(employee_id);
	}
	@PostMapping("/interns")
	public Interns saveStudent(@RequestBody Interns interns)
	{
		return internsRepo.save(interns);
	}
	
	@DeleteMapping("/interns/{employee_id}")
	public void deletestudentsbyid(@PathVariable String employee_id)
	{
		internsRepo.deleteById(employee_id);
	
	}
	@PutMapping("/interns/{employee_id}")
	public Interns updateStudent( @RequestBody Interns interns, @PathVariable String employee_id)
	
	{
		Interns currentInterns;
		currentInterns = internsRepo.findById(employee_id).get();
		currentInterns.setEmployee_id(interns.getEmployee_id());
		currentInterns.setStart_date(interns.getStart_date());
		currentInterns.setEnd_date(interns.getEnd_date());
		currentInterns.setJob_id(interns.getJob_id());
		currentInterns.setDepartment_id(interns.getDepartment_id());
		return internsRepo.save(currentInterns);
		
	}
}
