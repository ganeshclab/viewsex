package com.fullstack.springviews.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.springviews.entity.Address;
import com.fullstack.springviews.entity.Employee;
import com.fullstack.springviews.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee save(Employee employee) {
		Address address = employee.getAddress();
		address.setEmployee(employee);
		return employeeRepository.save(employee);
	}

}
