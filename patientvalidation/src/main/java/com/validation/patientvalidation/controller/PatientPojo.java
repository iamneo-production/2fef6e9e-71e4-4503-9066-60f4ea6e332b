package com.validation.patientvalidation.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PatientPojo {
    private long id;
    private String name;
    private String mail;
    private String password;
    private int age;
    private String address;
    private Double weight;
    
}
