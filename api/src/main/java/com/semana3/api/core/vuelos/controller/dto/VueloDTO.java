package com.semana3.api.core.vuelos.controller.dto;

import lombok.Getter;
import lombok.Setter;

public class VueloDTO {

    private static final long serialVersionUID = 1L;

    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private Integer idPasajero;

    @Getter @Setter
    private Integer numeroVuelo;

    @Getter @Setter
    private String origen;

    @Getter @Setter
    private String destino;

    @Getter @Setter
    private String hora;

    @Getter @Setter
    private String fecha;

}
