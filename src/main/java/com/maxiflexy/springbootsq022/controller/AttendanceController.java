package com.maxiflexy.springbootsq022.controller;

import com.maxiflexy.springbootsq022.payload.request.AttendanceRequest;
import com.maxiflexy.springbootsq022.payload.response.ApiResponse;
import com.maxiflexy.springbootsq022.payload.response.AttendanceResponse;
import com.maxiflexy.springbootsq022.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AttendanceController {

    private final AttendanceService attendanceService;

    @PostMapping("/mark-attendance/{id}")
    public ResponseEntity<ApiResponse<AttendanceResponse>> markAttendance(@PathVariable("id") Long id,
                                                                          @RequestBody AttendanceRequest attendanceRequest){

        return attendanceService.markAttendance(id, attendanceRequest);
    }
}
