package com.Shadi.Shadi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
    @Id
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("qualification")
    private String qualification;


    @JsonProperty("dob")
    private String dob;

    @JsonProperty("occupation")
    private String occupation;

    @JsonProperty("gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
