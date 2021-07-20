package com.springbank.lambdas;

import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbank.domains.EmpGetDetailRequest;
import com.springbank.domains.Employee;
import com.springbank.repositories.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class FetchEmployeeDetail implements Function<EmpGetDetailRequest, String> {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String apply(final EmpGetDetailRequest lambdaRequest) {
		final Optional<Employee> employeeOptional = employeeRepository.findById(lambdaRequest.getEmpId());
		Employee employee = null;
		if (employeeOptional.isPresent())
			employee = employeeOptional.get();
		log.info("emp detail is : {}", employee);
		return employee.toString();
	}

}
