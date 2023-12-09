package com.badal.employeeapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.badal.employeeapp.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
