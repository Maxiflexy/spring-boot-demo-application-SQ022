package com.maxiflexy.springbootsq022.payload.response;

import com.maxiflexy.springbootsq022.utils.DateUtils;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class ApiResponse<T> {

    private String responseMessage;

    private T responseData;

    private String responseTime = DateUtils.toDateString(LocalDateTime.now());


    public ApiResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }


    public ApiResponse(T responseData, String responseMessage) {
        this.responseData = responseData;
        this.responseMessage = responseMessage;
    }


}
