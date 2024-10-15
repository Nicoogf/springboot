package com.api.crud.models.dao;

import com.api.crud.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente , Integer> {

}
