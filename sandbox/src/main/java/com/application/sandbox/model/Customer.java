package com.application.sandbox.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@Data
@Entity
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @NonNull
    @Column(name = "customer_name")
    private String customerName;

    @NonNull
    @Column(name = "customer_last_name")
    private String customerLastName;

    @NonNull
    @Column(name = "phone_number")
    private String phoneNumber;
}
