package com.fullstack.springviews.view;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE_ADDRESS_VIEW")
public class EmployeeView {

	@Id
	@Column(name = "employee_id")
	private long employeeId;
	
	private String name;
	
	private String city;
}
