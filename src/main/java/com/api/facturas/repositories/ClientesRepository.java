package com.api.facturas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.facturas.models.ClientesModel;

@Repository
public interface ClientesRepository extends JpaRepository<ClientesModel,Long>{
    
}