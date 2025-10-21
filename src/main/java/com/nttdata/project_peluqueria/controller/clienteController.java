package com.nttdata.project_peluqueria.controller;

import com.nttdata.project_peluqueria.dto.ClienteDto;
import com.nttdata.project_peluqueria.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/findAll")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> mostrarClientePorId(@PathVariable Long id){
        return clienteService.mostrarClientePorId(id);
    }

    @PostMapping("/create")
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.createCliente(cliente);
    }

    @DeleteMapping("/delete")
    public void deleteCliente(@PathVariable Long id){
        clienteService.deleteCliente(id);
    }


    // ...otros métodos (mostrarClienteId,actualizarClienteId...)
}
