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

    public ArrayList<FormapModel> getFormaPago(){
        return (ArrayList<FormapModel>) formapRepo.findAll();
        
    }

    public FormapModel saveFormaPago(FormapModel formapago){
        return formapRepo.save(formapago);
    }

    public Optional<FormapModel> getById(Long id){
        return formapRepo.findById(id);
    }

    public FormapModel updateById(FormapModel request, Long id){
        FormapModel formapago = formapRepo.findById(id).get();
        
        formapago.setNombre(request.getNombre());
        formapago.setDescripcion(request.getDescripcion());

        return formapRepo.save(formapago);
    }

    public Boolean deleteFormaPago(Long id){
        try {
            formapRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

}