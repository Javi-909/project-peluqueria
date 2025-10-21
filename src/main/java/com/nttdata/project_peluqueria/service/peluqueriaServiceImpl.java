package com.nttdata.project_peluqueria.service;

import com.nttdata.project_peluqueria.dto.PeluqueriaDto;
import com.nttdata.project_peluqueria.entity.Peluqueria;
import com.nttdata.project_peluqueria.mapper.PeluqueriaMapper;
import com.nttdata.project_peluqueria.repository.PeluqueriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeluqueriaServiceImpl implements PeluqueriaService {

    @Autowired
    private PeluqueriaRepository peluqueriaRepository;

    @Autowired
    PeluqueriaMapper peluqueriaMapper;

    @Override
    public List<PeluqueriaDto> findAll() {
        List<Peluqueria> peluqueria = peluqueriaRepository.findAll();
        return peluqueria.stream()
                .map(peluqueriaMapper::toDto)
                .collect(Collectors.toList());
    }


    @Override
    public PeluqueriaDto createPeluqueria(PeluqueriaDto peluqueriaDto) {
        Peluqueria peluqueria = peluqueriaMapper.toEntity(peluqueriaDto);
        peluqueriaRepository.save(peluqueria);
        return peluqueria;
    }
    @Override
    public ResponseEntity<PeluqueriaDto> mostrarPeluqueriaPorId(Integer id) {
        List<Peluqueria> peluquerias = peluqueriaRepository.findAll();
        return peluquerias.stream().map(peluqueriaMapper::toDto).collect(Collectors.toList())
            }
        return System.out.print("No existe dicha peluqueria");
    }

    @Override
    public void deletePeluqueria(String id) {
        peluqueriaRepository.deleteById(id);
    }
}
