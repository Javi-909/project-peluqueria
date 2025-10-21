package com.nttdata.project_peluqueria.repository;

import com.nttdata.project_peluqueria.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface servicioRepository extends JpaRepository<Servicio, String>{

    //hacer métodos save(servicio), findAll(), deleteById(id)

}
