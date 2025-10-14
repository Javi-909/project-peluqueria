package com.nttdata.project_peluqueria.service;




@Service
public interface PeluqueriaService {

    List<Peluqueria> findAll();

    ResponseEntity<Peluqueria> mostrarPeluqueriaPorId(Integer id);

    Peluqueria createPeluqueria(Peluqueria peluqueria);

    void deleteCliente(Integer id);

}