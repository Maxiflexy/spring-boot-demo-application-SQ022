package com.maxiflexy.springbootsq022.payload.request;


import com.maxiflexy.springbootsq022.entity.enums.Present;
import com.maxiflexy.springbootsq022.entity.enums.Reasons;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttendanceRequest {

    @Enumerated(EnumType.STRING)
    private Present present;

    @Enumerated(EnumType.STRING)
    private Reasons reasons;
}
