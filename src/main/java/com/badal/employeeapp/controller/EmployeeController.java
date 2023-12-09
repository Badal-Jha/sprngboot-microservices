package com.badal.employeeapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.badal.employeeapp.dto.EmployeeResponse;
import com.badal.employeeapp.services.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

	private final EmployeeService empService;

	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {
		return ResponseEntity.status(HttpStatus.OK).body(empService.getEmployee(id));
	}
}
