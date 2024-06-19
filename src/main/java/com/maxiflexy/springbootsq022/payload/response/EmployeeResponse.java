package com.maxiflexy.springbootsq022.payload.response;

import com.maxiflexy.springbootsq022.entity.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeResponse {

    private String firstName;

    private String lastName;

    private String email;

    private Gender gender;

    private Designation designation;


}
