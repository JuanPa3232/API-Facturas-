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

    public ArrayList<MetodopModel> getClientes(){
        return (ArrayList<MetodopModel>) metodoRepo.findAll();
        
    }

    public MetodopModel saveCliente(MetodopModel metodo){
        return metodoRepo.save(metodo);
    }

    public Optional<MetodopModel> getById(Long id){
        return metodoRepo.findById(id);
    }

    public Boolean deleteUser(Long id){
        try {
            metodoRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
}