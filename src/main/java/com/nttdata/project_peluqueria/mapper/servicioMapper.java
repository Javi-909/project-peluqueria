package com.nttdata.project_peluqueria.mapper;

import com.nttdata.project_peluqueria.dto.servicioDto;
import com.nttdata.project_peluqueria.entity.servicio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServicioMapper {

    ServicioMapper mapper = Mappers.getMapper(ServicioMapper.class);

    ServicioDto toDto(Servicio servicio);
    Servicio toEntity(ServicioDto servicioDto);


}
