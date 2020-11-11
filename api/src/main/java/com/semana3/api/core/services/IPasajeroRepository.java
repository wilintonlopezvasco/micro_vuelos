package com.semana3.api.core.services;

import com.semana3.api.core.entity.PasajeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPasajeroRepository extends JpaRepository <PasajeroEntity, Integer>{
}
