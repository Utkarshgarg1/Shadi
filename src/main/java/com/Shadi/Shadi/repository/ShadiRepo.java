package com.Shadi.Shadi.repository;

import com.Shadi.Shadi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShadiRepo extends JpaRepository<Person,Integer> {
}
