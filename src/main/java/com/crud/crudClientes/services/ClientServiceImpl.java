package com.crud.crudClientes.services;

import com.crud.crudClientes.dtos.ClientDTO;
import com.crud.crudClientes.models.ClientModel;
import com.crud.crudClientes.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientDTO> getAllClients() {
        List<ClientModel> clientsEntity = clientRepository.findAll();
        List<ClientDTO> clientsDTO = clientsEntity.stream()
                .map(clientModel -> {
                    ClientDTO dto = new ClientDTO();
                    dto.setName(clientModel.getName());
                    dto.setEmail(clientModel.getEmail());
                    dto.setPhone(clientModel.getPhone());
                    dto.setId(clientModel.getId());
                    return dto;
                })
                .toList();
        return clientsDTO;
    }
}
