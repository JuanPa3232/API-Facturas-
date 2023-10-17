package com.api.facturas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.facturas.models.FacturasModel;

@Repository
public interface FacturaRepository extends JpaRepository<FacturasModel, Long>{
    
}