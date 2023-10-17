package com.api.facturas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.facturas.models.DatosEmpresaModel;

@Repository
public interface DatosEmpresaRepository extends JpaRepository<DatosEmpresaModel, Long>{
    
}