package com.semana3.api.core.controller;

import com.semana3.api.config.response.ApiResponse;
import com.semana3.api.core.controller.dto.PasajeroBuilder;
import com.semana3.api.core.controller.dto.PasajeroDTO;
import com.semana3.api.core.entity.PasajeroEntity;
import com.semana3.api.core.services.PasajeroService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Pasajeros/V1")
@Log4j2
public class PasajeroController {

    PasajeroService pasajeroService;

    public PasajeroController(PasajeroService pasajeroService){this.pasajeroService = pasajeroService;}

    @PostMapping(path = "", consumes = "application/json")
    public ResponseEntity<ApiResponse> post(@RequestBody PasajeroDTO pasajeroDTO){
        PasajeroEntity pasajeroEntity = PasajeroBuilder
    }
}
