package com.mongodb.employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TypeAlias("Employee")
@Document(collection = "Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private String employeeID;

    @Field("EmployeeName")
    private String employeeName;

    @Field("EmployeeEmail")
    private String employeeEmail;

    @Field("Location")
    private String location;

}
