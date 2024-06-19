package com.maxiflexy.springbootsq022.repository;

import com.maxiflexy.springbootsq022.entity.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long>{
}
