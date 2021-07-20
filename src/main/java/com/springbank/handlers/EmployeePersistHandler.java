package com.springbank.handlers;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.springbank.domains.Employee;

public class EmployeePersistHandler extends SpringBootRequestHandler<Employee, String> {

}
