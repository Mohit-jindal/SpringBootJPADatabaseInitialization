package com.infotech.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infotech.app.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
