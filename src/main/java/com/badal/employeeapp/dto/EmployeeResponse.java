package com.badal.employeeapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {

	private int id;
	private String name;
	private String email;
	private String bloodgroup;
	private AddressResponse addressResponse;
}
