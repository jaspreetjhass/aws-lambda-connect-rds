package com.springbank.handlers;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.springbank.domains.EmpGetDetailRequest;

public class EmployeeDetailHandler extends SpringBootRequestHandler<EmpGetDetailRequest, String> {

}
