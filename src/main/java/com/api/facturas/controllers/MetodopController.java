package com.api.facturas.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.facturas.models.MetodopModel;
import com.api.facturas.services.MetodopServices;

@RestController
@RequestMapping("/metodos_pago")
public class MetodopController {

    @Autowired
    private MetodopServices metodoServices;

    @GetMapping
    public ArrayList<MetodopModel> getMetodoPago(){
        return this.metodoServices.getMetodoPago();
    }

    @PostMapping
    public MetodopModel saveMetodoPago(@RequestBody MetodopModel metodop){
        return this.metodoServices.saveMetodoPago(metodop);
      }

    @GetMapping(path = "/{id}")
    public Optional<MetodopModel> getUserById(@PathVariable("id") Long id){
        return this.metodoServices.getById(id);
    }

    @PutMapping(path = "/{id}")
    public MetodopModel updateById(@RequestBody MetodopModel request, @PathVariable Long id){
        return this.metodoServices.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.metodoServices.deleteMetodoPago(id);
        
    if (delete) {
        return "El metodo de pago con el id " + id + " fue eliminiado con exito";
    } else {
        return "Hubo un error eliminando el metodo de pago con el id:  " + id;
    }
    }

    
}