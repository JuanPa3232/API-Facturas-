package com.api.facturas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.facturas.models.MetodopModel;

@Repository
public interface MetodopRepository extends JpaRepository<MetodopModel, Long>{
    
}