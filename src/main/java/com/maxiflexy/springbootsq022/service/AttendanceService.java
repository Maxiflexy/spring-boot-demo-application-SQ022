package com.maxiflexy.springbootsq022.service;

import com.maxiflexy.springbootsq022.payload.request.AttendanceRequest;
import com.maxiflexy.springbootsq022.payload.response.ApiResponse;
import com.maxiflexy.springbootsq022.payload.response.AttendanceResponse;
import org.springframework.http.ResponseEntity;

public interface AttendanceService {

    ResponseEntity<ApiResponse<AttendanceResponse>> markAttendance(Long id, AttendanceRequest attendanceRequest);
}
