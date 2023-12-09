package com.badal.addressapp.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badal.addressapp.dto.AddressResponse;
import com.badal.addressapp.entities.Address;
import com.badal.addressapp.repositories.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepo;
	@Autowired
	private ModelMapper modelMapper;

	public AddressResponse findAddressByEmployeeId(int id) {
		Address address = addressRepo.findAddressByEmployeeId(id);

		AddressResponse response = modelMapper.map(address, AddressResponse.class);

		return response;
	}
}
