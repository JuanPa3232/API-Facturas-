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
    public ArrayList<DetallesModel> getClientes(){
        return this.detalleService.getClientes();
    }

    @PostMapping
    public DetallesModel saveClientes(@RequestBody DetallesModel detalle){
        return this.detalleService.saveCliente(detalle);
      }

    @GetMapping(path = "/{id}")
    public Optional<DetallesModel> getUserById(@PathVariable("id") Long id){
        return this.detalleService.getById(id);
    }
}