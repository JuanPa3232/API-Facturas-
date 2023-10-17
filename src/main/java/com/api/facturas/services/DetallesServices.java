package com.api.facturas.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facturas.models.DetallesModel;
import com.api.facturas.repositories.DetalleRepository;

@Service
public class DetallesServices {
    
    @Autowired
    DetalleRepository detalleRepo;

    public ArrayList<DetallesModel> getClientes(){
        return (ArrayList<DetallesModel>) detalleRepo.findAll();
        
    }

    public DetallesModel saveCliente(DetallesModel detalle){
        return detalleRepo.save(detalle);
    }

    public Optional<DetallesModel> getById(Long id){
        return detalleRepo.findById(id);
    }
}