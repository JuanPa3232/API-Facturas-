package com.api.facturas.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.facturas.models.DetallesModel;
import com.api.facturas.services.DetallesServices;

@RestController
@RequestMapping("/detalles")
public class DetallesController {
    
    @Autowired
    private DetallesServices detalleService;

    @GetMapping
    public ArrayList<DetallesModel> getDetalles(){
        return this.detalleService.getDetalles();
    }

    @PostMapping
    public DetallesModel saveDetalles(@RequestBody DetallesModel detalle){
        return this.detalleService.saveDetalles(detalle);
      }

    @GetMapping(path = "/{id}")
    public Optional<DetallesModel> getUserById(@PathVariable("id") Long id){
        return this.detalleService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public DetallesModel updateById(@RequestBody DetallesModel request, @PathVariable Long id){
        return this.detalleService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.detalleService.deleteDetalles(id);
        
    if (delete) {
        return "Los detalles con el id " + id + " fueron eliminiados con exito";
    } else {
        return "Hubo un error eliminando los detalles con el id:  " + id;
    }
    }
}