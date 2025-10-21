package com.nttdata.project_peluqueria.service;
import com.nttdata.project_peluqueria.entity.Peluqueria;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public interface PeluqueriaService {

    List<Peluqueria> findAll();

    ResponseEntity<Peluqueria> mostrarPeluqueriaPorId(Integer id);

    Peluqueria createPeluqueria(PeluqueriaDto peluqueriaDto);

    void deletePeluqueria(Integer id);

}