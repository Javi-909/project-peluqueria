package com.nttdata.project_peluqueria.entity;


import lombok.*;


@Entity
@Table(name = "horario")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int peluqueria_id;
    private Time hora_apertura;
    private Time hora_cierre;
    private String dia_semana;

}
