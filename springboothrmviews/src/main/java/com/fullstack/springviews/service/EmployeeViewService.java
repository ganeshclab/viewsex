package com.fullstack.springviews.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.springviews.repository.EmployeeViewRepository;
import com.fullstack.springviews.view.EmployeeView;

@Service
public class EmployeeViewService {
	@Autowired
	private EmployeeViewRepository employeeViewRepository;

	public List<EmployeeView> findAll() {
		return employeeViewRepository.findAll();
	}
}
