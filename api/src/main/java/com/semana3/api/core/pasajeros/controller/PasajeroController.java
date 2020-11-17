package com.semana3.api.core.pasajeros.controller;

import com.semana3.api.config.response.ApiResponse;
import com.semana3.api.core.pasajeros.controller.dto.PasajeroBuilder;
import com.semana3.api.core.pasajeros.controller.dto.PasajeroDTO;
import com.semana3.api.core.pasajeros.controller.dto.PasajeroRequestDTO;
import com.semana3.api.core.pasajeros.entity.PasajeroEntity;
import com.semana3.api.core.pasajeros.services.PasajeroService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Pasajeros/V1/")
@Log4j2
public class PasajeroController {

    PasajeroService pasajeroService;


    @Autowired
    public PasajeroController(PasajeroService pasajeroService){this.pasajeroService = pasajeroService;}

    @PostMapping(path = "", consumes = "application/json")
    public ResponseEntity<ApiResponse> post(@RequestBody PasajeroDTO pasajeroDTO){
        PasajeroEntity pasajeroEntity = PasajeroBuilder.getPasajeroEntityFromDTO(pasajeroDTO);
        pasajeroService.savePasajero(pasajeroEntity);

        return ResponseEntity.ok(new ApiResponse("Pasajero registrado correctamente", PasajeroBuilder.getPasajeroDTOFromEntity(pasajeroEntity)));
    }

    @GetMapping(path = "/getByIdentificacion/{identificacion}", consumes = "application/json")
    public ResponseEntity<ApiResponse> findByIdentificacion(@PathVariable("identificacion")String identificacion){
        PasajeroEntity pasajeroEntity = pasajeroService.getPasajeroByIdentificacion(identificacion);
        return ResponseEntity.ok(new ApiResponse("Consulta correcta", PasajeroBuilder.getPasajeroDTOFromEntity(pasajeroEntity)));
    }

    @GetMapping(value = "/findAll", consumes = "application/json")
    public ResponseEntity<Object> index(){
        return ResponseEntity.ok(pasajeroService.findAll());
    }

    @DeleteMapping(value = "/id/{id}", consumes = "application/json")
    public ResponseEntity<Object> delete(@PathVariable Integer id) throws Exception{
        pasajeroService.deleteById(id);
        return ResponseEntity.ok("Pasajero eliminado correctamente");
    }

    @PostMapping(value = "/id/{id}", consumes = "application/json")
    public ResponseEntity<Object> update(@RequestBody PasajeroRequestDTO requestDTO, @PathVariable Integer id) throws Exception{
        pasajeroService.update(requestDTO,id);
        return  ResponseEntity.ok("Se ha actualizado Correctamente");
    }

}