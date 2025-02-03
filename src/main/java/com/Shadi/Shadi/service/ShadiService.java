package com.Shadi.Shadi.service;

import com.Shadi.Shadi.model.Gender;
import com.Shadi.Shadi.model.Person;
import com.Shadi.Shadi.repository.ShadiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShadiService {

    @Autowired
    private ShadiRepo shadirepo;

    //------------------------------------------------------------------------------------------------------------------
    public List<Person> getProfiles() {
        return shadirepo.findAll();
    }

    //------------------------------------------------------------------------------------------------------------------
    public void add(List<Person> p) {
        shadirepo.saveAll(p);
    }

    //------------------------------------------------------------------------------------------------------------------

    public List<Person> filterByGender(Gender gender) {
        return  shadirepo.filterByGender(gender);
    }
}
