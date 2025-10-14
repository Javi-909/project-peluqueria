package com.nttdata.project_peluqueria.entity;


import lombok.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;
    private String email;
    private String genero;

}
