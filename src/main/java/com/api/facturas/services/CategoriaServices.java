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

    public ArrayList<CategoriaModel> getCategoria(){
        return (ArrayList<CategoriaModel>) categRepo.findAll();
        
    }

    public CategoriaModel saveCategoria(CategoriaModel categoria){
        return categRepo.save(categoria);
    }

    public Optional<CategoriaModel> getById(Long id){
        return categRepo.findById(id);
    }

    public CategoriaModel updateById(CategoriaModel request, Long id){
        CategoriaModel categoria = categRepo.findById(id).get();
        
        categoria.setNombre(request.getNombre());

        return categRepo.save(categoria);
    }

    public Boolean deleteCategoria(Long id){
        try {
            categRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
}