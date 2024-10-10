package com.example.demo.Repository;

import com.example.demo.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepositoy extends JpaRepository<Persona,String> {

}
