package com.fullstack.springviews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.springviews.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
