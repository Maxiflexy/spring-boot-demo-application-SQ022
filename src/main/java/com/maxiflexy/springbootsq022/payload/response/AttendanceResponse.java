package com.maxiflexy.springbootsq022.payload.response;

import com.maxiflexy.springbootsq022.entity.enums.Present;
import com.maxiflexy.springbootsq022.entity.enums.Reasons;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttendanceResponse {

    private Present present;

    private Reasons reasons;
}
