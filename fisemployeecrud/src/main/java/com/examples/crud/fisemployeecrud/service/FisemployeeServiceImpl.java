package com.examples.crud.fisemployeecrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.crud.fisemployeecrud.model.Fisemployee;
import com.examples.crud.fisemployeecrud.repo.EmployeeDao;

@Service
public class FisemployeeServiceImpl implements FisemployeeService{
	
	
	@Autowired
	EmployeeDao dao;

	@Override
	public List<Fisemployee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Fisemployee insertEmployee(Fisemployee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
		
	}

	@Override
	public String deleteEmployee(Fisemployee employee) {
		// TODO Auto-generated method stub
		dao.delete(employee);
		return "Record Deleted";
	}

	@Override
	public Optional<Fisemployee> searchById(int empid) {
		// TODO Auto-generated method stub
		return dao.findById(empid);
	}

}
