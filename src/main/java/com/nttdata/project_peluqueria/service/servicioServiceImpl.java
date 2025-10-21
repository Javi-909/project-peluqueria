package com.nttdata.project_peluqueria.service;

import com.nttdata.project_peluqueria.dto.ServicioDto;
import com.nttdata.project_peluqueria.entity.Servicio;
import com.nttdata.project_peluqueria.mapper.ServicioMapper; //hacer
import com.nttdata.project_peluqueria.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    @Autowired
    ServicioMapper servicioMapper;

    @Override
    public List<ServicioDto> findAll() {
        List<Servicio> servicio = servicioRepository.findAll();
        return servicio.stream()
                .map(servicioMapper::toDto)
                .collect(Collectors.toList());
    }


    @Override
    public Servicio createServicio(ServicioDto servicioDto) {
        Servicio servicio = servicioMapper.toEntity(servicioDto);
        servicioRepository.save(servicio);
        return servicio;
    }
    @Override
    public ResponseEntity<ServicioDto> mostrarServicioPorId(Integer id) {
        List<Servicio> servicios = servicioRepository.findAll();
        return servicios.stream().map(servicioMapper::toDto).collect(Collectors.toList())
            }
        return System.out.print("No existe dicho servicio");
    }

    @Override
    public void deleteServicio(String id) {
        servicioRepository.deleteById(id);
    }
}
