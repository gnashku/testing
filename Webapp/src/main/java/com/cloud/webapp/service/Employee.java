package com.cloud.webapp.service;

import com.cloud.webapp.doa.JpaRepo;
import com.cloud.webapp.model.employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Employee {


    @Autowired
    private JpaRepo repo;


    public List<employees> findAll(){
       return   repo.findAll();

    }
    public Optional<employees> getOne(int id){
        return   repo.findById(id);
    }

     public List<employees> save(employees employees){
        repo.save(employees);
        return repo.findAll();
    }
    public List<employees>  deleteById(int id){
        repo.deleteById(id);
        return repo.findAll();
    }

}
