package com.nttdata.project_peluqueria.mapper;

import com.nttdata.project_peluqueria.dto.HorarioDto;
import com.nttdata.project_peluqueria.entity.Horario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HorarioMapper {

    //HorarioMapper mapper = Mappers.getMapper(HorarioMapper.class);

    HorarioDto toDto(Horario horario);
    Horario toEntity(HorarioDto horarioDto);


}
