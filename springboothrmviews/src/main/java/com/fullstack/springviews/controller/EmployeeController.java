package com.fullstack.springviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.springviews.entity.Employee;
import com.fullstack.springviews.service.EmployeeService;
import com.fullstack.springviews.service.EmployeeViewService;
import com.fullstack.springviews.view.EmployeeView;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmployeeViewService employeeViewService;

	@PostMapping("/save")
	public ResponseEntity<Employee> save(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeService.save(employee));
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<EmployeeView>> findAll() {
		return ResponseEntity.ok(employeeViewService.findAll());
	}

}
