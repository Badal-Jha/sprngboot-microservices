package com.badal.addressapp.dto;

import lombok.Data;

@Data
public class AddressResponse {
	private int id;
	private String lane1;
	private String lane2;
	private String zip;
	private String state;
}
