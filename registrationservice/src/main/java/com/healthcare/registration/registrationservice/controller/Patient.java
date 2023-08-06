package com.healthcare.registration.registrationservice.controller;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Patient {
    private long id;
    private String name;
    private String mail;
    private String password;
    private int age;
    private String address;
    private Double weight;
    
}
