package com.maxiflexy.springbootsq022.service;

import com.maxiflexy.springbootsq022.payload.request.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
}
