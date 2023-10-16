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
    public ArrayList<MetodopModel> getClientes(){
        return this.metodoServices.getClientes();
    }

    @PostMapping
    public MetodopModel saveClientes(@RequestBody MetodopModel metodop){
        return this.metodoServices.saveCliente(metodop);
      }

    @GetMapping(path = "/{id}")
    public Optional<MetodopModel> getUserById(@PathVariable("id") Long id){
        return this.metodoServices.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.metodoServices.deleteUser(id);
        
    if (delete) {
        return "The user with the id " + id + " was deleted successfully";
    } else {
        return "Error deleting the user with the id " + id;
    }
    }

    
}