package com.maxiflexy.springbootsq022.entity.model;

import com.maxiflexy.springbootsq022.entity.enums.Present;
import com.maxiflexy.springbootsq022.entity.enums.Reasons;
import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "attendance")
public class Attendance extends BaseClass{

    @Enumerated(EnumType.STRING)
    private Present present;

    @Enumerated(EnumType.STRING)
    private Reasons reasons;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
