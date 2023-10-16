package com.api.facturas.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facturas.models.FormapModel;
import com.api.facturas.repositories.FormapRepository;

@Service
public class FormapServices {
    
    @Autowired
    FormapRepository formapRepo;

    public ArrayList<FormapModel> getClientes(){
        return (ArrayList<FormapModel>) formapRepo.findAll();
        
    }

    public FormapModel saveCliente(FormapModel cliente){
        return formapRepo.save(cliente);
    }

    public Optional<FormapModel> getById(Long id){
        return formapRepo.findById(id);
    }

    public Boolean deleteUser(Long id){
        try {
            formapRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

}