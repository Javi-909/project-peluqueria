package com.nttdata.project_peluqueria.entity;


import lombok.*;

@Entity
@Table(name = "servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String descripcion;


}
