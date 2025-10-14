package com.nttdata.project_peluqueria.service;




@Service
public interface ClienteService {

    List<Cliente> findAll();

    ResponseEntity<Cliente> mostrarClientePorId(Integer id);

    Cliente createCliente(Cliente cliente);

    void deleteCliente(Integer id);

}