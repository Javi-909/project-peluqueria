package com.nttdata.project_peluqueria.service;
import com.crude.crude.entity.Peluqueria;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public interface PeluqueriaService {

    List<Peluqueria> findAll();

    ResponseEntity<Peluqueria> mostrarPeluqueriaPorId(Integer id);

    Peluqueria createPeluqueria(Peluqueria peluqueria);

    void deletePeluqueria(Integer id);

}