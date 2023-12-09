package com.badal.employeeapp.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.badal.employeeapp.dto.AddressResponse;
import com.badal.employeeapp.dto.EmployeeResponse;
import com.badal.employeeapp.entities.Employee;
import com.badal.employeeapp.feign.AddressClient;
import com.badal.employeeapp.repositories.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {
	private final EmployeeRepository employeeRepo;
	private final ModelMapper modelMapper;
	private final AddressClient addressClient;

	public EmployeeResponse getEmployee(int id) {
		Employee employee = this.employeeRepo.findById(id).get();

//		EmployeeResponse empRes = new EmployeeResponse(employee.getId(), employee.getName(), employee.getEmail(),
//				employee.getBloodgroup());
		EmployeeResponse empRes = modelMapper.map(employee, EmployeeResponse.class);

		AddressResponse address = this.addressClient.getAddressById(id).getBody();

		empRes.setAddressResponse(address);
		return empRes;
	}
}
