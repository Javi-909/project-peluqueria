package com.nttdata.project_peluqueria.entity;


import lombok.*;

@Entity
@Table(name = "serviciopelu")
public class ServicioPelu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int peluqueria_id;
    private int servicio_id;
    private int precio;
    private int duracion;

}
