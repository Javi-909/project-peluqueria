package com.nttdata.project_peluqueria.controller;

import com.nttdata.project_peluqueria.dto.ServicioDto;
import com.nttdata.project_peluqueria.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cliente")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @GetMapping("/findAll")
    public List<Servicio> findAll() {
        return servicioService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Servicio> mostrarServicioPorId(@PathVariable Long id){
        return servicioService.mostrarServicioPorId(id);
    }

    @PostMapping("/create")
    public Cliente createServicio(@RequestBody ServicioDto servicioDto) {
        return servicioService.createServicio(servicio);
    }

    @DeleteMapping("/delete")
    public void deleteServicio(@PathVariable Long id){
        servicioService.deleteServicio(id);
    }

}
