package com.nttdata.project_peluqueria.mapper;

import com.nttdata.project_peluqueria.dto.ServicioDto;
import com.nttdata.project_peluqueria.entity.Servicio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServicioMapper {

    //ServicioMapper mapper = Mappers.getMapper(ServicioMapper.class);

    ServicioDto toDto(Servicio servicio);
    Servicio toEntity(ServicioDto servicioDto);


}
