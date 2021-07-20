package com.springbank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbank.domains.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByName(String name);
	
}
