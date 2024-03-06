package com.springboot.thymeleaf.poc.controller;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springboot.thymeleaf.poc.entity.Employee;

@Controller
@RequestMapping("/controller")
public class ControllerForRESTClient
{

    List<Employee> employeeList =Arrays.asList(
            Employee.builder().emp_id(1).emp_email("1@gmail.com").emp_name("1").emp_salary(1.0).build(),
            Employee.builder().emp_id(2).emp_email("2@gmail.com").emp_name("2").emp_salary(2.0).build(),
            Employee.builder().emp_id(3).emp_email("3@gmail.com").emp_name("3").emp_salary(3.0).build());

    @GetMapping("/employee")
    public String getEmployeeList(Model model) {
        model.addAttribute("something","List of Accounts");
        model.addAttribute("employeeList", employeeList);
        return "employees";
    }

    @GetMapping("/employee/{ID}")
    public String getAccountsList(@PathVariable("ID") Integer ID, Model model) {
        model.addAttribute("something","Account Information");
        Optional<Employee> first = employeeList.stream().filter(e -> e.getEmp_id().equals(ID)).findFirst();
        model.addAttribute("Account", first.isPresent() ? first.get() : Employee.builder().build());
        return "account";
    }


}
