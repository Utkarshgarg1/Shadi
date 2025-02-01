package com.Shadi.Shadi.service;

import com.Shadi.Shadi.model.Person;
import com.Shadi.Shadi.repository.ShadiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShadiService {

    @Autowired
    private ShadiRepo shadirepo;
    public List<Person> getProfiles() {
        return shadirepo.findAll();
    }

    public void add(Person p) {
        shadirepo.save(p);
    }
}
