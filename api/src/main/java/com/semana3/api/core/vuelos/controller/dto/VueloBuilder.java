package com.semana3.api.core.vuelos.controller.dto;

import com.semana3.api.core.vuelos.entity.VueloEntity;

import java.util.ArrayList;
import java.util.List;

public class VueloBuilder {

    public static VueloDTO getVueloDTOFromEntity(VueloEntity vueloEntity){
        VueloDTO vueloDTO = new VueloDTO();
        vueloDTO.setId(vueloEntity.getId());
        vueloDTO.setIdPasajero(vueloEntity.getIdPasajero());
        vueloDTO.setNumeroVuelo(vueloEntity.getNumeroVuelo());
        vueloDTO.setOrigen(vueloEntity.getOrigen());
        vueloDTO.setDestino(vueloEntity.getDestino());
        vueloDTO.setHora(vueloEntity.getHora());
        vueloDTO.setFecha(vueloEntity.getFecha());

        return vueloDTO;
    }

    public static VueloEntity getVueloEntityFromDTO(VueloDTO vueloDTO){
        VueloEntity vueloEntity = new VueloEntity();
        vueloEntity.setId(vueloDTO.getId());
        vueloEntity.setIdPasajero(vueloDTO.getIdPasajero());
        vueloEntity.setNumeroVuelo(vueloDTO.getNumeroVuelo());
        vueloEntity.setOrigen(vueloDTO.getOrigen());
        vueloEntity.setDestino(vueloDTO.getDestino());
        vueloEntity.setHora(vueloDTO.getHora());
        vueloEntity.setFecha(vueloDTO.getFecha());

        return vueloEntity;
    }

    public static List<VueloEntity> getListVueloListFromDTO(List<VueloDTO> listVueloDTO){
        List<VueloEntity> listVueloEntity = new ArrayList<>();
        for(VueloDTO vueloDTO : listVueloDTO){
        }
        return listVueloEntity;
    }
}
