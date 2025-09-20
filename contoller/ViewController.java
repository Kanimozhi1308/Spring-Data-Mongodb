package com.mongodb.employee.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @Autowired
    EmployeeController employee;

    @GetMapping("/view")
    public String index() {
        return "index.html";
    }

}
