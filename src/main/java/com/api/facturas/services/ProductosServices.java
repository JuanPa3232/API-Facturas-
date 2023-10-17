package com.api.facturas.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facturas.models.ProductosModel;
import com.api.facturas.repositories.ProductosRepository;

@Service
public class ProductosServices {
    
    @Autowired 
    ProductosRepository prodRepo;

    public ArrayList<ProductosModel> getClientes(){
        return (ArrayList<ProductosModel>) prodRepo.findAll();
        
    }

    public ProductosModel saveCliente(ProductosModel producto){
        return prodRepo.save(producto);
    }

    public Optional<ProductosModel> getById(Long id){
        return prodRepo.findById(id);
    }

    public Boolean deleteUser(Long id){
        try {
            prodRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

}