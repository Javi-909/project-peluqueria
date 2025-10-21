package com.nttdata.project_peluqueria.repository;

import com.nttdata.project_peluqueria.entity.Peluqueria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface peluqueriaRepository extends JpaRepository<Peluqueria, String>{

    //hacer métodos save(peluqueria), findAll(), deleteById(id)

}
