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
    public ArrayList<FacturasModel> getFacturas(){
        return this.facturaService.getFacturas();
    }

    @PostMapping
    public FacturasModel saveFactura(@RequestBody FacturasModel factura){
        return this.facturaService.saveFactura(factura);
      }

    @GetMapping(path = "/{id}")
    public Optional<FacturasModel> getFacturaById(@PathVariable("id") Long id){
        return this.facturaService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.facturaService.deleteFactura(id);
        
    if (delete) {
        return "The user with the id " + id + " was deleted successfully";
    } else {
        return "Error deleting the user with the id " + id;
    }
    }
}