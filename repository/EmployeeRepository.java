package com.mongodb.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongodb.employee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
