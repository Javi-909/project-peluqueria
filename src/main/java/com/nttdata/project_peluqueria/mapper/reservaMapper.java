package com.nttdata.project_peluqueria.mapper;

import com.nttdata.project_peluqueria.dto.ReservaDto;
import com.nttdata.project_peluqueria.entity.Reserva;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservaMapper {

    ReservaMapper mapper = Mappers.getMapper(ReservaMapper.class);

    ReservaDto toDto(Reserva reserva);
    Reserva toEntity(ReservaDto reservaDto);


}
