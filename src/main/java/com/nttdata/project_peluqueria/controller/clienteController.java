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
    public List<ClienteDto> findAll() {
        return clienteService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> mostrarClientePorId(@PathVariable Long id){
        return clienteService.mostrarClientePorId(id);
    }

    @PostMapping("/create")
    public ClienteDto createCliente(@RequestBody ClienteDto clienteDto) {
        return clienteService.createCliente(clienteDto);
    }

    @DeleteMapping("/delete")
    public void deleteCliente(@PathVariable Long id){
        clienteService.deleteCliente(id);
    }


    // ...otros métodos (mostrarClienteId,actualizarClienteId...)
}
