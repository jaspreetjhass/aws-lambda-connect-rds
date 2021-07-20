package com.springbank.lambdas;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbank.domains.Employee;
import com.springbank.repositories.EmployeeRepository;

@Component
public class FetchAllEmployees implements Supplier<List<Employee>> {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> get() {
		return employeeRepository.findAll();
	}

}
