package com.maxiflexy.springbootsq022.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDetails {

    private LocalDateTime timeStamp;

    private String errorMessage;

    private String errorDetails;

}
