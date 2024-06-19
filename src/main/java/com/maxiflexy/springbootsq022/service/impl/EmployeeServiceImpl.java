package com.maxiflexy.springbootsq022.service.impl;

import com.maxiflexy.springbootsq022.payload.request.EmployeeRequest;
import com.maxiflexy.springbootsq022.payload.response.ApiResponse;
import com.maxiflexy.springbootsq022.payload.response.EmployeeResponse;
import com.maxiflexy.springbootsq022.repository.EmployeeRepository;
import com.maxiflexy.springbootsq022.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public ResponseEntity<ApiResponse<EmployeeResponse>> registerEmployee(EmployeeRequest employeeRequest) {

        boolean isEmailPresent = employeeRepository.existByEmail(employeeRequest.getEmail());  // check if email is already in our DB,

        return null;
    }



}
