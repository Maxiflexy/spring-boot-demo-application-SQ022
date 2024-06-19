package com.maxiflexy.springbootsq022.service.impl;

import com.maxiflexy.springbootsq022.entity.enums.Role;
import com.maxiflexy.springbootsq022.entity.model.Employee;
import com.maxiflexy.springbootsq022.exception.EmailAlreadyExistException;
import com.maxiflexy.springbootsq022.payload.request.EmployeeRequest;
import com.maxiflexy.springbootsq022.payload.response.ApiResponse;
import com.maxiflexy.springbootsq022.payload.response.EmployeeResponse;
import com.maxiflexy.springbootsq022.repository.EmployeeRepository;
import com.maxiflexy.springbootsq022.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public ResponseEntity<ApiResponse<EmployeeResponse>> registerEmployee(EmployeeRequest employeeRequest) {

        boolean isEmailPresent = employeeRepository.existByEmail(employeeRequest.getEmail());  // check if email is already in our DB,

        if(isEmailPresent){
            throw new EmailAlreadyExistException("Email already exists. Login to your account");
        }

        Employee newEmployee = Employee.builder().firstName(employeeRequest.getFirstName())
                                .lastName(employeeRequest.getLastName())
                                .email(employeeRequest.getEmail())
                                .password(employeeRequest.getPassword())
                                .gender(employeeRequest.getGender())
                                .designation(employeeRequest.getDesignation())
                                .role(Role.USER)
                                .build();

        employeeRepository.save(newEmployee);

        // send email alert
        EmployeeResponse response = EmployeeResponse.builder()
                                .firstName(employeeRequest.getFirstName())
                                .lastName(employeeRequest.getLastName())
                                .designation(employeeRequest.getDesignation())
                                .gender(employeeRequest.getGender())
                                .build();


        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>("Account created successfully", response));
    }



}
