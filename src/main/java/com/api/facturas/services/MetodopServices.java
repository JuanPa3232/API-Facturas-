package com.api.facturas.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facturas.models.MetodopModel;
import com.api.facturas.repositories.MetodopRepository;

@Service
public class MetodopServices {

    @Autowired
    MetodopRepository metodoRepo;

    public ArrayList<MetodopModel> getMetodoPago(){
        return (ArrayList<MetodopModel>) metodoRepo.findAll();
        
    }

    public MetodopModel saveMetodoPago(MetodopModel metodo){
        return metodoRepo.save(metodo);
    }

    public Optional<MetodopModel> getById(Long id){
        return metodoRepo.findById(id);
    }

    public MetodopModel updateById(MetodopModel request, Long id){
        MetodopModel metodopago = metodoRepo.findById(id).get();
        
        metodopago.setDescripcion(request.getDescipcion());

        return metodoRepo.save(metodopago);
    }

    public Boolean deleteMetodoPago(Long id){
        try {
            metodoRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
}