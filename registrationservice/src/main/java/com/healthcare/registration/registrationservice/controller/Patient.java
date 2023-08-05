package com.healthcare.registration.registrationservice.controller;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    private long id;
     private String name;
     private String mail;
     private String password;
     private int age;
     private String address;
     private Double weight;
    
}
