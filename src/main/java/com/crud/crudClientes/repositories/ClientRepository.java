package com.crud.crudClientes.repositories;

import com.crud.crudClientes.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
