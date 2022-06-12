package com.example.demo.SummerInterns;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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
	public List <Interns> getAllinterns()
	{
		return internsRepo.findAll();
	}
	
	@GetMapping("/interns/{id}")
	public Optional<Interns> getstudentsbyid(@PathVariable String id)
	{
		return internsRepo.findById(id);
	}
	
	@PostMapping("/interns")
	public Interns saveStudent(@Valid @RequestBody Interns interns)
	{
		return internsRepo.save(interns);
	}
	
	@PutMapping("/interns/{id}")
	public Interns updateStudent( @RequestBody Interns interns, @PathVariable String id)
	
	{
		Interns currentInterns;
		currentInterns = internsRepo.findById(id).get();
		currentInterns.setEmployee_id(interns.getEmployee_id());
		currentInterns.setStart_date(interns.getStart_date());
		currentInterns.setEnd_date(interns.getEnd_date());
		currentInterns.setJob_id(interns.getJob_id());
		currentInterns.setDepartment_id(interns.getDepartment_id());
		return internsRepo.save(currentInterns);
		
	}
	
	@DeleteMapping("/interns/{id}")
	public void deletestudentsbyid(@PathVariable String id)
	{
		internsRepo.deleteById(id);
	
	}
}

