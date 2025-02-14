package com.crud.crudClientes.services;

import com.crud.crudClientes.models.ClientModel;
import com.crud.crudClientes.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientModel> getAllClients() {
        List<ClientModel> clients = clientRepository.findAll();
        return clients;
    }
}
