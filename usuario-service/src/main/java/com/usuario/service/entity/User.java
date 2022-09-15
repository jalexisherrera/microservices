package com.usuario.service.entity;

import javax.persistence.Entity;

@Data
@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GnerationType.IDENTITY)
    private int id;
    private String nombre;
    private String email;

}