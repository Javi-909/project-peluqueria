package com.nttdata.project_peluqueria.service;
import com.nttdata.project_peluqueria.entity.Servicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServicioService {

    List<Servicio> findAll();

    ResponseEntity<ServicioDto> mostrarServicioPorId(Integer id);

    Servicio createServicio(ServicioDto servicioDto);

    void deleteServicio(Integer id);

}