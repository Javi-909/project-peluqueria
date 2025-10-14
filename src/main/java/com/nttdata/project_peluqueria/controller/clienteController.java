package com.nttdata.project_peluqueria.controller;


@RestController
@RequestMapping("/cliente")
public class clienteController {

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
        clienteService.deleteClientePorId(id);
    }


    // ...otros métodos (mostrarClienteId,actualizarClienteId...)
}
