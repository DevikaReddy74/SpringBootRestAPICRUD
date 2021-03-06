package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Student;
import com.cts.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repository;
	
	@RequestMapping(value = "/student", method = RequestMethod.POST )
	private Student addStudent(@RequestBody Student student) {
		return repository.save(student);
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.PUT)
	private Student updateStudent(@RequestBody Student student) {
		return repository.save(student);
	}
	
	@RequestMapping(value="/student", method = RequestMethod.GET)
	private List<Student> gatAllStudent(){
		return repository.findAll();
	}
	
	@RequestMapping(value="/student/{id}", method = RequestMethod.GET)
	private Student getByIdStudent(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
}
