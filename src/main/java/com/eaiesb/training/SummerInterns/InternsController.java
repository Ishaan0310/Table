package com.eaiesb.training.SummerInterns;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public Interns saveStudent( @RequestBody Interns interns)
	
	{
		
		return internsRepo.save(interns);
		
	}
	
	@PutMapping("/interns/{id}")
	public Interns updateStudent( @RequestBody Interns intern, @PathVariable String id)
	
	{
		Interns currentIntern;
		currentIntern = internsRepo.findById(id).get();
		currentIntern.setFirstName(intern.getFirstName());
		currentIntern.setLastName(intern.getLastName());
		currentIntern.setStudentNumber(intern.getStudentNumber());
		return internsRepo.save(currentIntern);
		
	}
	
	@DeleteMapping("/interns/{id}")
	public void deletestudentsbyid(@PathVariable String id)
	{
		internsRepo.deleteById(id);
	}
}
