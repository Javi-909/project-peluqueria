package com.nttdata.project_peluqueria.entity;

import lombok.*;

@Entity
@Table(name = "peluqueria")
public class Peluqueria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;
    private String email;
    private String direccion;
    private int telefono;


}