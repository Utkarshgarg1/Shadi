package com.Shadi.Shadi.repository;

import com.Shadi.Shadi.model.Gender;
import com.Shadi.Shadi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShadiRepo extends JpaRepository<Person,Integer> {


    @Query("Select p from Person p where p.gender = :gender")

    List<Person> filterByGender(Gender gender);
}
