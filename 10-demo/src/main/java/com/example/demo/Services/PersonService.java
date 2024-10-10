package com.example.demo.Services;


import com.example.demo.Repository.IPersonRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private IPersonRepositoy iPersonRepositoy ;

    public void deletePerson(String id) {
        iPersonRepositoy.deleteById(id);
    }
}
