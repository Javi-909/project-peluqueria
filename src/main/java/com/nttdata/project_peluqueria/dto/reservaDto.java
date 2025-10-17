package com.nttdata.project_peluqueria.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ReservaDto {

    private Date fecha;
    private Time hora;
    private Enum estado;
}
