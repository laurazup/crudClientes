package com.crud.crudClientes.controllers;

import com.crud.crudClientes.dtos.ClientDTO;
import com.crud.crudClientes.models.ClientModel;
import com.crud.crudClientes.services.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    private final ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<ClientDTO> getAllClients() {
        List<ClientDTO> clients = clientService.getAllClients();
        return clients;
    }
}
