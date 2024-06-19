package com.maxiflexy.springbootsq022.entity.model;

import com.maxiflexy.springbootsq022.entity.enums.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "employee")
public class Employee extends BaseClass{

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Designation designation;
    private Gender gender;
    private Role role;


}
