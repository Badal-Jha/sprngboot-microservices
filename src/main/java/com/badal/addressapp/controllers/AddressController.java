package com.badal.addressapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.badal.addressapp.dto.AddressResponse;
import com.badal.addressapp.services.AddressService;

@RestController
public class AddressController {
	@Autowired
	private AddressService addressService;

	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressById(@PathVariable("employeeId") int id) {
		AddressResponse addressResponse = addressService.findAddressByEmployeeId(id);

		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}
}
