package com.api.crud.service;
import com.api.crud.models.entity.Cliente;

public interface ICliente {

    Cliente save ( Cliente cliente) ;

    Cliente findById (Integer id) ;

    void delete ( Cliente cliente) ;
}
