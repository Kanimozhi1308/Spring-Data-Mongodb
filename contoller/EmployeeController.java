package com.mongodb.employee.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mongodb.employee.model.Employee;
import com.mongodb.employee.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    // Fetch all employees
    @GetMapping("/employees")
    public ResponseEntity<?> getAllEmployees() {
        return ResponseEntity.ok(repository.findAll());
    }

    // Fetch employee by id
    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable String id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Insert new employee
    @PostMapping("/employees")
    public ResponseEntity<?> insertEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(repository.save(employee));
    }

    // Update employee
    @PutMapping("/employees/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable String id, @RequestBody Employee updated) {
        return repository.findById(id)
                .map(emp -> {
                    emp.setEmployeeName(updated.getEmployeeName());
                    emp.setEmployeeEmail(updated.getEmployeeEmail());
                    emp.setLocation(updated.getLocation());
                    return ResponseEntity.ok(repository.save(emp));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete employee
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable String id) {
        repository.deleteById(id);
        return ResponseEntity.ok("Id deleted successfully");
    }
}
