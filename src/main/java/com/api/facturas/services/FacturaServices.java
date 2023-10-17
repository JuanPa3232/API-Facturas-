package com.api.facturas.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facturas.models.FacturasModel;
import com.api.facturas.repositories.FacturaRepository;

@Service
public class FacturaServices {
    
    @Autowired
    FacturaRepository facturaRepo;

    public ArrayList<FacturasModel> getClientes(){
        return (ArrayList<FacturasModel>) facturaRepo.findAll();
        
    }

    public FacturasModel saveCliente(FacturasModel factura){
        return facturaRepo.save(factura);
    }

    public Optional<FacturasModel> getById(Long id){
        return facturaRepo.findById(id);
    }
}