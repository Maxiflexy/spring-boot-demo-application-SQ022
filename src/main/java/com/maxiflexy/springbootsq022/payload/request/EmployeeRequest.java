package com.maxiflexy.springbootsq022.payload.request;

import com.maxiflexy.springbootsq022.entity.enums.Designation;
import com.maxiflexy.springbootsq022.entity.enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeRequest {

    @NotBlank(message = "FirstName cannot be empty")
    private String firstName;


    @NotBlank(message = "LastName cannot be empty")
    private String lastName;


    @Email(message = "Email must be valid")
    @NotBlank(message = "Email cannot be empty")
    private String email;


    @NotBlank(message = "Password cannot be empty")
    private String password;


    @Enumerated(EnumType.STRING)
    private Designation designation;


    @Enumerated(EnumType.STRING)
    private Gender gender;


}
