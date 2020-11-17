package com.semana3.api.core.pasajeros.services;

import com.semana3.api.core.pasajeros.controller.dto.PasajeroBuilder;
import com.semana3.api.core.pasajeros.controller.dto.PasajeroDTO;
import com.semana3.api.core.pasajeros.controller.dto.PasajeroRequestDTO;
import com.semana3.api.core.pasajeros.entity.PasajeroEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PasajeroService implements IPasajeroService {

    @Autowired
    IPasajeroRepository pasajeroRepository;

    public void savePasajero(PasajeroEntity pasajeroEntity){
        pasajeroRepository.save(pasajeroEntity);
    }

    public PasajeroEntity getPasajeroByIdentificacion(String identificacion){

        return pasajeroRepository.findByIdentificacion(identificacion);
    }

    @Override
    public List<PasajeroDTO> findAll() {
        List<PasajeroDTO> listPasajeros = new ArrayList<>();
        Iterable<PasajeroEntity> pasajeros = pasajeroRepository.findAll();
        for (PasajeroEntity pasajeroEntity : pasajeros){
            PasajeroDTO pasajeroDTO = PasajeroBuilder.getPasajeroDTOFromEntity(pasajeroEntity);
            listPasajeros.add(pasajeroDTO);
        }
        return listPasajeros;
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        Optional<PasajeroEntity> optionalPasajeroEntity = pasajeroRepository.findById(id);
        if (!optionalPasajeroEntity.isPresent()){
            throw new Exception("Id de pasajero no existe");
        } pasajeroRepository.deleteById(id);
    }

    @Override
    public void update(PasajeroRequestDTO pasajeroRequestDTO, Integer id) {
        Optional<PasajeroEntity> optionalPasajeroEntity = pasajeroRepository.findById(id);
            if (optionalPasajeroEntity.isPresent()){
                PasajeroEntity pasajeroEntity = optionalPasajeroEntity.get();
                pasajeroEntity.setNombres(pasajeroRequestDTO.getNombres());
                pasajeroEntity.setApellidos(pasajeroRequestDTO.getApellidos());
                pasajeroEntity.setGenero(pasajeroRequestDTO.getGenero());
                pasajeroEntity.setCelular(pasajeroRequestDTO.getCelular());
                pasajeroEntity.setEmail(pasajeroRequestDTO.getEmail());
                pasajeroRepository.save(pasajeroEntity);
            }

    }

}
