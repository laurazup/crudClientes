package com.crud.crudClientes.models;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    private String email;

    @Column(name = "telefone")
    private String phone;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Long getId() {
        return id;
    }
}
