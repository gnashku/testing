package com.cloud.webapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@NoArgsConstructor
public class employees {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employee_id;
    private String first_name;
    private String last_name;
    private String job_title;
    private int salary;
    private Integer reports_to;

    public employees(int employee_id, String first_name, String last_name, String job_title, int salary, int reports_to, Integer office_id) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.job_title = job_title;
        this.salary = salary;
        this.reports_to = reports_to;
        this.office_id = office_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer getReports_to() {
        return reports_to;
    }

    public void setReports_to(Integer reports_to) {
        this.reports_to = reports_to;
    }

    public Integer getOffice_id() {
        return office_id;
    }

    public void setOffice_id(Integer office_id) {
        this.office_id = office_id;
    }

    private Integer office_id;

    public employees(String first_name, String last_name, String job_title, int salary, Integer reports_to, int office_id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.job_title = job_title;
        this.salary = salary;
        this.reports_to = reports_to;
        this.office_id = office_id;
    }
}
