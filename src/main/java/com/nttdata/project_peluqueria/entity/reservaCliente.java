package com.nttdata.project_peluqueria.entity;


import lombok.*;

@Entity
@Table(name = "reservacliente")
public class ReservaCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private int cliente_id;
    private int reserva_id;


}
