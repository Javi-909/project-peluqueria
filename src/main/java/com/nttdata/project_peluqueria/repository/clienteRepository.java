package com.nttdata.project_peluqueria.repository;

import com.nttdata.project_peluqueria.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepository extends JpaRepository<Cliente, String>{

    //hacer métodos save(cliente), findAll(), deleteById(id)

}
