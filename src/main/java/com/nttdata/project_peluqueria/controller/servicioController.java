package com.nttdata.project_peluqueria.controller;


@RestController
@RequestMapping("/cliente")
public class servicioController {

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
    public Cliente createServicio(@RequestBody Servicio servicio) {
        return servicioService.createServicio(servicio);
    }

    @DeleteMapping("/delete")
    public void deleteServicio(@PathVariable Long id){
        servicioService.deleteServicio(id);
    }

}
