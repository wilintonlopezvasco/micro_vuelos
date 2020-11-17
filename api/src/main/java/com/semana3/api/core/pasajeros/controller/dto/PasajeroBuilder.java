package com.semana3.api.core.pasajeros.controller.dto;

import com.semana3.api.core.pasajeros.entity.PasajeroEntity;

public class PasajeroBuilder {

    public static PasajeroDTO getPasajeroDTOFromEntity(PasajeroEntity pasajeroEntity){
        PasajeroDTO pasajeroDTO = new PasajeroDTO();
        pasajeroDTO.setId(pasajeroEntity.getId());
        pasajeroDTO.setIdVuelo(pasajeroEntity.getIdVuelo());
        pasajeroDTO.setNombres(pasajeroEntity.getNombres());
        pasajeroDTO.setApellidos(pasajeroEntity.getApellidos());
        pasajeroDTO.setGenero(pasajeroEntity.getGenero());
        pasajeroDTO.setTipoIdentificacion(pasajeroEntity.getTipoIdentificacion());
        pasajeroDTO.setIdentificacion(pasajeroEntity.getIdentificacion());
        pasajeroDTO.setCelular(pasajeroEntity.getCelular());
        pasajeroDTO.setEmail(pasajeroEntity.getEmail());

        return pasajeroDTO;
    }

    public static PasajeroEntity getPasajeroEntityFromDTO(PasajeroDTO pasajeroDTO){
        PasajeroEntity pasajeroEntity = new PasajeroEntity();
        pasajeroEntity.setId(pasajeroDTO.getId());
        pasajeroEntity.setIdVuelo(pasajeroDTO.getIdVuelo());
        pasajeroEntity.setNombres(pasajeroDTO.getNombres());
        pasajeroEntity.setApellidos(pasajeroDTO.getApellidos());
        pasajeroEntity.setGenero(pasajeroDTO.getGenero());
        pasajeroEntity.setTipoIdentificacion(pasajeroDTO.getTipoIdentificacion());
        pasajeroEntity.setIdentificacion(pasajeroDTO.getIdentificacion());
        pasajeroEntity.setCelular(pasajeroDTO.getCelular());
        pasajeroEntity.setEmail(pasajeroDTO.getEmail());

        return pasajeroEntity;
    }



}
