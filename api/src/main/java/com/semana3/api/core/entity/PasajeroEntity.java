package com.semana3.api.core.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pasajeros")
@Getter @Setter
public class PasajeroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nm_id")
    private Integer id;

    @Column(name = "nm_id_vuelo")
    private Integer idVuelo;

    @Column(name = "ds_nombres")
    private String nombres;

    @Column(name = "ds_apellidos")
    private String apellidos;

    @Column(name = "ds_genero")
    private String tipoIdentificacion;

    @Column(name = "ds_identificacion")
    private String identificacion;

    @Column(name = "ds_celular")
    private String celular;

    @Column(name = "ds_email")
    private String email;

}
