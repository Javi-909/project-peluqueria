package com.nttdata.project_peluqueria.mapper;

import com.nttdata.project_peluqueria.dto.PeluqueriaDto;
import com.nttdata.project_peluqueria.entity.Peluqueria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PeluqueriaMapper {

    //PeluqueriaMapper mapper = Mappers.getMapper(PeluqueriaMapper.class);

    PeluqueriaDto toDto(Peluqueria peluqueria);
    Peluqueria toEntity(PeluqueriaDto peluqueriaDto);


}
