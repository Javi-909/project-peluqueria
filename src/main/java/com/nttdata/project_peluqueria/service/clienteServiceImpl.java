package com.nttdata.project_peluqueria.service;

import com.nttdata.project_peluqueria.dto.ClienteDto;
import com.nttdata.project_peluqueria.entity.Cliente;
import com.nttdata.project_peluqueria.mapper.ClienteMapper; //hacer
import com.nttdata.project_peluqueria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    ClienteMapper clienteMapper;

    @Override
    public List<ClienteDto> findAll() {
        List<Cliente> cliente = clienteRepository.findAll();
        return cliente.stream()
                .map(clienteMapper::toDto)
                .collect(Collectors.toList());
    }


    @Override
    public Cliente createCliente(ClienteDto clienteDto) {
        Cliente cliente = clienteMapper.toEntity(clienteDto);
        clienteRepository.save(cliente);
        return cliente;
    }
    @Override
    public ResponseEntity<Cliente> mostrarClientePorId(Integer id) {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes.stream().map(clienteMapper::toDto).collect(Collectors.toList())
          }
        return System.out.print("No existe dicho cliente");
    }

    @Override
    public void deleteCliente(String id) {
        clienteRepository.deleteById(id);
    }
}
