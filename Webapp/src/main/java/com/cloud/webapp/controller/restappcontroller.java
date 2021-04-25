package com.cloud.webapp.controller;


import com.cloud.webapp.model.employees;

import com.cloud.webapp.service.Employee;
import com.cloud.webapp.service.Employee.*;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/users")
public class restappcontroller {

    @Autowired
    private Employee employee;


//private static List<employees> employeesList =new ArrayList<>(   Arrays.asList(new employees(1,"jake","will","banker",100,23,100),
//        new employees(2,"mike","will","banker",100,23,100),
//new employees(3,"nike","will","banker",100,23,100)));


@GetMapping
    public List<employees> getEmployeesList(){

    return employee.findAll();
}
    @PostMapping
    public List<employees> postEmployeesList( @RequestBody employees employees){
        this.employee.save(employees);
        return employee.findAll();
    }

    @GetMapping("/{id}")
    public Optional< employees> getaemployee(@NotNull @PathVariable int id){
        return employee.getOne(id);
    }

    @DeleteMapping("/{id}")
    public  List<employees> deleteemploye( @PathVariable int id){
    employee.deleteById(id);
    return employee.findAll();
    }

}
