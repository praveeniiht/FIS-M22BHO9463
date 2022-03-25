package com.examples.crud.fisemployeecrud.service;

import java.util.List;
import java.util.Optional;

import com.examples.crud.fisemployeecrud.model.Fisemployee;



public interface FisemployeeService {
	
	public List<Fisemployee> getAllEmployees();
	public Fisemployee insertEmployee(Fisemployee employee);
	public String deleteEmployee(Fisemployee employee);
	public Optional<Fisemployee> searchById(int empid);
	
}
