package com.maxiflexy.springbootsq022.payload.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailDetails {

    private String recipient;

    private String messageBody;

    private String subject;

    private String attachment;

}
