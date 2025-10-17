package com.nttdata.project_peluqueria.service;
import com.crude.crude.entity.Servicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServicioService {

    List<Servicio> findAll();

    ResponseEntity<Servicio> mostrarServicioPorId(Integer id);

    Servicio createServicio(Servicio servicio);

    void deleteServicio(Integer id);

}