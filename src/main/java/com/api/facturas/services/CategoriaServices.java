package com.api.facturas.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facturas.models.CategoriaModel;
import com.api.facturas.repositories.CategoriaRepository;

@Service
public class CategoriaServices {

    @Autowired
    CategoriaRepository categRepo;

    public ArrayList<CategoriaModel> getClientes(){
        return (ArrayList<CategoriaModel>) categRepo.findAll();
        
    }

    public CategoriaModel saveCliente(CategoriaModel categoria){
        return categRepo.save(categoria);
    }

    public Optional<CategoriaModel> getById(Long id){
        return categRepo.findById(id);
    }

    public Boolean deleteUser(Long id){
        try {
            categRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
}