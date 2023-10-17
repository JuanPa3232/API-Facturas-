package com.api.facturas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.facturas.models.ProductosModel;

@Repository
public interface ProductosRepository extends JpaRepository<ProductosModel, Long>{
    
}