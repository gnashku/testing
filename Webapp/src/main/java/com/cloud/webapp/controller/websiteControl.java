package com.cloud.webapp.controller;

import com.cloud.webapp.doa.JpaRepo;
import com.cloud.webapp.model.employees;
import com.cloud.webapp.service.Employee;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class websiteControl {

    @Autowired
    private Employee repo;

    @GetMapping("/")
    public ModelAndView getfirstpage(){
        List<employees> employeesList = repo.findAll();
        System.out.println(employeesList.toString());
        ModelAndView view = new ModelAndView("hello");
        view.addObject("listCustomer",employeesList);
        return view;
    }

}
