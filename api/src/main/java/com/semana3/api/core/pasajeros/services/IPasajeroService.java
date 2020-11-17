package com.semana3.api.core.pasajeros.services;

import com.semana3.api.core.pasajeros.controller.dto.PasajeroDTO;
import com.semana3.api.core.pasajeros.controller.dto.PasajeroRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPasajeroService {
    List<PasajeroDTO> findAll();

    public void deleteById(Integer id) throws Exception;

    public void update(PasajeroRequestDTO pasajeroRequestDTO, Integer id);
}
