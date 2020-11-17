package com.semana3.api.core.vuelos.services;

import com.semana3.api.core.vuelos.controller.dto.VueloBuilder;
import com.semana3.api.core.vuelos.controller.dto.VueloDTO;
import com.semana3.api.core.vuelos.entity.VueloEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VueloService implements IVueloService{

    @Autowired
    private IVueloRepository vueloRepository;

    @Override
    public List<VueloDTO> findAll() {
       List<VueloDTO> listVuelos = new ArrayList<>();
       Iterable<VueloEntity> vuelos = vueloRepository.findAll();
       for (VueloEntity vueloEntity : vuelos){
           VueloDTO vueloDTO = VueloBuilder.getVueloDTOFromEntity(vueloEntity);
           listVuelos.add(vueloDTO);
       }
       return listVuelos;
    }
}
