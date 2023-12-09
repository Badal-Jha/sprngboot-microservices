package com.badal.addressapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.badal.addressapp.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	@Query(nativeQuery = true, value = "Select ea.id,ea.lane1,ea.lane2,ea.state,ea.zip from microservices.address ea join microservices.employee e on ea.id=e.id where ea.employee_id=:employeeId")
	Address findAddressByEmployeeId(@Param("employeeId") int id);
}
