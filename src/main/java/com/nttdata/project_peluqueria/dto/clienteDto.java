package com.nttdata.project_peluqueria.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ClienteDto {

    private String nombre;
    private String email;
    private String genero;
}
