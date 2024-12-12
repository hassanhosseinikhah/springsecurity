package com.example.springsecurity.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {

    private Long id;
    private String email;
    private String password;
    private String role;
}
