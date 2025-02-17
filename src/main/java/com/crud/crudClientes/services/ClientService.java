package com.crud.crudClientes.services;

import com.crud.crudClientes.dtos.ClientDTO;

import java.util.List;

public interface ClientService {
    List<ClientDTO> getAllClients();
}
