package com.nttdata.project_peluqueria.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PeluqueriaDto {

    private String nombre;
    private String email;
    private String direccion;
    private int telefono;
}
