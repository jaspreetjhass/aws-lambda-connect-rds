package com.springbank.lambdas;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbank.domains.Employee;
import com.springbank.repositories.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class PersistEmployee implements Function<Employee, String> {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String apply(final Employee employee) {
		employeeRepository.save(employee);
		log.info("employee with id : {} is saved successfully.", employee.getEmpid());
		return "success";
	}

}
