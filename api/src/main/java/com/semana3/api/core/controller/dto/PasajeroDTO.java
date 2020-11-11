package com.semana3.api.core.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class PasajeroDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private Integer idVuelo;

    @Getter @Setter
    private String nombres;

    @Getter @Setter
    private String apellidos;

    @Getter @Setter
    private String genero;

    @Getter @Setter
    private String tipoIdentificacion;

    @Getter @Setter
    private String identificacion;

    @Getter @Setter
    private String celular;

    @Getter @Setter
    private String correo;

}
