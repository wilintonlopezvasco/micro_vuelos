package com.semana3.api.core.vuelos.services;

import com.semana3.api.core.vuelos.entity.VueloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface IVueloRepository extends JpaRepository<VueloEntity, Integer>{
}
