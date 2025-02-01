package com.Shadi.Shadi.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Person")
public class Person {
    @Id
    private int id;
    private String name;
    private int age;
    private String qualification;
    private String dateOfBirth;

    private String occupation;

//    @Enumerated(EnumType.STRING)
//    private Gender gender;



}
