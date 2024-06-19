package com.maxiflexy.springbootsq022.controller;

import com.maxiflexy.springbootsq022.payload.request.EmployeeRequest;
import com.maxiflexy.springbootsq022.payload.response.ApiResponse;
import com.maxiflexy.springbootsq022.payload.response.EmployeeResponse;
import com.maxiflexy.springbootsq022.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<EmployeeResponse>> registerUser(@Valid @RequestBody EmployeeRequest employeeRequest){

        return employeeService.registerEmployee(employeeRequest);
    }
}
