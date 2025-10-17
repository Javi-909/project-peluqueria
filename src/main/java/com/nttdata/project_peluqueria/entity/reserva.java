package com.nttdata.project_peluqueria.entity;


import lombok.*;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Date fecha;
    private Time hora;
    private Enum estado; //Pendiente, Confirmada, Cancelada
    private int idServicioPelu;

}
