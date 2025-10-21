package com.nttdata.project_peluqueria.mapper;

import com.nttdata.project_peluqueria.dto.ServicioPeluDto;
import com.nttdata.project_peluqueria.entity.ServicioPelu;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServicioPeluMapper {

    ServicioPeluMapper mapper = Mappers.getMapper(ServicioPeluMapper.class);

    ServicioPeluDto toDto(ServicioPelu servicioPelu);
    ServicioPelu toEntity(ServicioPeluDto servicioPeluDto);


}
