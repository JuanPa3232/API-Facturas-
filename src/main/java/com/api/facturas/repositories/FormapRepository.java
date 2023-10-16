package com.api.facturas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.facturas.models.FormapModel;

@Repository
public interface FormapRepository extends JpaRepository<FormapModel, Long>{
    
}