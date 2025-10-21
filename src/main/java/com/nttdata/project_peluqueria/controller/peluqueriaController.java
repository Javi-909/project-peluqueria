package com.nttdata.project_peluqueria.controller;

import com.nttdata.project_peluqueria.dto.PeluqueriaDto;
import com.nttdata.project_peluqueria.service.PeluqueriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peluqueria")
public class peluqueriaController {

    @Autowired
    private PeluqueriaService peluqueriaService;

    @GetMapping("/findAll")
    public List<Peluqueria> findAll() {
        return peluqueriaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Peluqueria> mostrarPeluqueriaPorId(@PathVariable Long id){
        return peluqueriaService.mostrarPeluqueriaPorId(id);
    }

    @PostMapping("/create")
    public Peluqueria createPeluqueria(@RequestBody Peluqueria peluqueria) {
        return peluqueriaService.createPeluqueria(peluqueria);
    }

    @DeleteMapping("/delete")
    public void deletePeluqueria(@PathVariable Long id) {
        peluqueriaService.deletePeluqueria(id);
    }



    // ...otros métodos (mostrarClienteId,actualizarClienteId...)
}
