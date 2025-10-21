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
public class PeluqueriaController {

    @Autowired
    private PeluqueriaService peluqueriaService;

    @GetMapping("/findAll")
    public List<PeluqueriaDto> findAll() {
        return peluqueriaService.findAll(); //esto devuelve la lista de peluqueriaDto
    }

    @GetMapping("/{id}")
    public ResponseEntity<PeluqueriaDto> mostrarPeluqueriaPorId(@PathVariable Long id){
        return peluqueriaService.mostrarPeluqueriaPorId(id);
    }

    @PostMapping("/create")
    public PeluqueriaDto createPeluqueria(@RequestBody PeluqueriaDto peluqueriaDto) {
        return peluqueriaService.createPeluqueria(peluqueria);
    }

    @DeleteMapping("/delete")
    public void deletePeluqueria(@PathVariable Long id) {
        peluqueriaService.deletePeluqueria(id);
    }



    // ...otros métodos (mostrarClienteId,actualizarClienteId...)
}
