package com.badal.employeeapp.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.badal.employeeapp.dto.AddressResponse;

@FeignClient(name = "address-service", url = "localhost:8082", path = "/address-app/api")
public interface AddressClient {

	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressById(@PathVariable("employeeId") int id);
}
