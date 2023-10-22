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

    public ArrayList<DetallesModel> getDetalles(){
        return (ArrayList<DetallesModel>) detalleRepo.findAll();
        
    }

    public DetallesModel saveDetalles(DetallesModel detalle){
        return detalleRepo.save(detalle);
    }

    public Optional<DetallesModel> getById(Long id){
        return detalleRepo.findById(id);
    }

    public DetallesModel updateById(DetallesModel request, Long id){
        DetallesModel detalles = detalleRepo.findById(id).get();
        
        detalles.setCantidad(request.getCantidad());
        detalles.setPrecio(request.getPrecio());
        detalles.setId_factura(request.getId_factura());
        detalles.setId_producto(request.getId_producto());

        return detalleRepo.save(detalles);
    }

    public Boolean deleteDetalles(Long id){
        try {
            detalleRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
}