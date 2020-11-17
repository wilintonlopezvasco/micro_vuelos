package com.semana3.api.core.pasajeros.services;

import com.semana3.api.core.pasajeros.entity.PasajeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface IPasajeroRepository extends JpaRepository<PasajeroEntity, Integer>{

    public PasajeroEntity findByIdentificacion(String identificacion);

}
