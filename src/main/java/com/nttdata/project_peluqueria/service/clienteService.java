package com.nttdata.project_peluqueria.service;
import com.nttdata.project_peluqueria.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ClienteService {

    List<Cliente> findAll();

    ResponseEntity<Cliente> mostrarClientePorId(Integer id);

    Cliente createCliente(Cliente cliente);

    void deleteCliente(Integer id);

}