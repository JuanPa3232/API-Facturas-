package com.api.facturas.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facturas.models.DatosEmpresaModel;
import com.api.facturas.repositories.DatosEmpresaRepository;

@Service
public class DatosEmpresaServices {
    
    @Autowired
    DatosEmpresaRepository datosRepo;

    public ArrayList<DatosEmpresaModel> getClientes(){
        return (ArrayList<DatosEmpresaModel>) datosRepo.findAll();
        
    }

    public DatosEmpresaModel saveCliente(DatosEmpresaModel datos_empresa){
        return datosRepo.save(datos_empresa);
    }

    public Optional<DatosEmpresaModel> getById(Long id){
        return datosRepo.findById(id);
    }
}