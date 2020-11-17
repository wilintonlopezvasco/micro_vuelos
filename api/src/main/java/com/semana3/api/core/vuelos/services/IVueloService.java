package com.semana3.api.core.vuelos.services;

import com.semana3.api.core.vuelos.controller.dto.VueloDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IVueloService {

    public List<VueloDTO> findAll();

}
