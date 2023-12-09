package com.badal.addressapp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressAppConfig {

	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
