package com.semana3.api.core.vuelos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "vuelos")
@Getter @Setter
public class VueloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nm_id")
    private Integer id;

    @Column(name = "nm_id_pasajero")
    private Integer idPasajero;

    @Column(name = "nm_numero_vuelo")
    private Integer numeroVuelo;

    @Column(name = "ds_origen")
    private String origen;

    @Column(name = "ds_destino")
    private String destino;

    @Column(name = "ds_hora")
    private String hora;

    @Column(name = "fe_fecha")
    private String fecha;

}
