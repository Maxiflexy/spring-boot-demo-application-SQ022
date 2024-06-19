package com.maxiflexy.springbootsq022.service.impl;

import com.maxiflexy.springbootsq022.entity.model.Attendance;
import com.maxiflexy.springbootsq022.entity.model.Employee;
import com.maxiflexy.springbootsq022.exception.EmployeeNotFoundException;
import com.maxiflexy.springbootsq022.payload.request.AttendanceRequest;
import com.maxiflexy.springbootsq022.payload.response.ApiResponse;
import com.maxiflexy.springbootsq022.payload.response.AttendanceResponse;
import com.maxiflexy.springbootsq022.repository.AttendanceRepository;
import com.maxiflexy.springbootsq022.repository.EmployeeRepository;
import com.maxiflexy.springbootsq022.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttendanceServiceImpl implements AttendanceService {

    private final EmployeeRepository employeeRepository;
    private final AttendanceRepository attendanceRepository;

    @Override
    public ResponseEntity<ApiResponse<AttendanceResponse>> markAttendance(Long id, AttendanceRequest attendanceRequest) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with ID " + id + " does not exists"));

        Attendance markAttendance = Attendance.builder()
                                .present(attendanceRequest.getPresent())
                                .reasons(attendanceRequest.getReasons())
                                .employee(employee)
                                .build();

        attendanceRepository.save(markAttendance);

        AttendanceResponse response = AttendanceResponse.builder()
                                .present(attendanceRequest.getPresent())
                                .reasons(attendanceRequest.getReasons())
                                .build();

        return ResponseEntity.status(HttpStatus.CREATED)
                                .body(new ApiResponse<>("Attendance Mark Successfully", response));
    }
}
