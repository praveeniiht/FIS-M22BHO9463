package com.examples.crud.fisemployeecrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examples.crud.fisemployeecrud.model.Fisemployee;
import com.examples.crud.fisemployeecrud.service.FisemployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	FisemployeeService service;
	
	
	@GetMapping("/all")
	public List<Fisemployee> showAllEmps(){
		return service.getAllEmployees();
	}
	
	@PostMapping("/add")
	public Fisemployee insertEmp(@RequestBody Fisemployee employee) {
		return service.insertEmployee(employee);
	}
	
	@DeleteMapping("/delete")
	public String deleteEmp(@RequestBody Fisemployee employee) {
		return service.deleteEmployee(employee);
	}
	
	@GetMapping("/search/{empid}")
	public Optional<Fisemployee> searchByEmpid(@PathVariable("empid") Integer empid){
		
		return service.searchById(empid);
	}

}
