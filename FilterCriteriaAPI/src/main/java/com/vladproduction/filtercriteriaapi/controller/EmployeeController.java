package com.vladproduction.filtercriteriaapi.controller;

import com.vladproduction.filtercriteriaapi.exception.NoValuesFoundForDatesException;
import com.vladproduction.filtercriteriaapi.model.Employee;
import com.vladproduction.filtercriteriaapi.model.SpecificationInput;
import com.vladproduction.filtercriteriaapi.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/byName")
    public List<Employee> getByName(){
        return employeeService.getEmployeeByName();
    }

    //byEquals_name; byEquals_salary; byEquals_skill; byEquals_doh
    @GetMapping("/byEquals")
    public List<Employee> getByEquals(@RequestBody SpecificationInput specificationInput){
        return employeeService.getEmployeeData(specificationInput);
    }

    @GetMapping("/byBetweenDates")
    List<Employee> getByBetweenDates(@RequestBody SpecificationInput specificationInput) throws NoValuesFoundForDatesException {
        return employeeService.getEmployeesBetweenDates(specificationInput);
    }

    @GetMapping("/byLike")
    List<Employee> getByLikeOperation(@RequestBody SpecificationInput specificationInput) {
        return employeeService.getEmployeeByLike(specificationInput);
    }



}