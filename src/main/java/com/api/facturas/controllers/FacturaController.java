package com.api.facturas.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.facturas.models.FacturasModel;
import com.api.facturas.services.FacturaServices;

@RestController
@RequestMapping("/factura")
public class FacturaController {
    
    @Autowired
    private FacturaServices facturaService;

    @GetMapping
    public ArrayList<FacturasModel> getClientes(){
        return this.facturaService.getClientes();
    }

    @PostMapping
    public FacturasModel saveClientes(@RequestBody FacturasModel factura){
        return this.facturaService.saveCliente(factura);
      }

    @GetMapping(path = "/{id}")
    public Optional<FacturasModel> getUserById(@PathVariable("id") Long id){
        return this.facturaService.getById(id);
    }
}