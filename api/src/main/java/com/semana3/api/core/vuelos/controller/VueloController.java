package com.semana3.api.core.vuelos.controller;

import com.semana3.api.core.vuelos.services.IVueloService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Vuelos/V1/")
@Log4j2
public class VueloController {

    @Autowired
    IVueloService vueloService;

    @GetMapping(value = "/findAll", consumes = "application/json")
    public ResponseEntity<Object> index(){
        return ResponseEntity.ok(vueloService.findAll());
    }

}
