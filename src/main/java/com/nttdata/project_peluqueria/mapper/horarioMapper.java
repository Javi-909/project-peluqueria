package com.nttdata.project_peluqueria.mapper;

import com.nttdata.project_peluqueria.dto.horarioDto;
import com.nttdata.project_peluqueria.entity.horario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HorarioMapper {

    HorarioMapper mapper = Mappers.getMapper(HorarioMapper.class);

    HorarioDto toDto(Horario horario);
    Horario toEntity(HorarioDto horarioDto);


}
