package com.fullstack.springviews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.springviews.view.EmployeeView;

@Repository
public interface EmployeeViewRepository extends JpaRepository<EmployeeView, Long> {

}
