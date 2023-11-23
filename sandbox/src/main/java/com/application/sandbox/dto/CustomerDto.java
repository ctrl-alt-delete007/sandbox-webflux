package com.application.sandbox.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
public class CustomerDto {
    private UUID id;
    private String customerName;
    private String customerLastName;
    private String phoneNumber;
}
