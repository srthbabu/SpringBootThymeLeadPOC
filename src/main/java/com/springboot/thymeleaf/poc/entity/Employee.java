package com.springboot.thymeleaf.poc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee
{
    private Integer emp_id;
    private String emp_name;
    private Double emp_salary;
    private String emp_email;

}