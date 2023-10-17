package com.api.facturas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.facturas.models.DetallesModel;

@Repository
public interface DetalleRepository extends JpaRepository<DetallesModel, Long>{
    
}