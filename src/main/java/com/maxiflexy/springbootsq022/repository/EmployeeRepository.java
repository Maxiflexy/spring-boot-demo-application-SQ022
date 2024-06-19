package com.maxiflexy.springbootsq022.repository;

import com.maxiflexy.springbootsq022.entity.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

    boolean existByEmail(String email);

}
