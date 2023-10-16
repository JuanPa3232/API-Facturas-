package com.api.facturas.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.api.facturas.models.FormapModel;
import com.api.facturas.services.FormapServices;

@RestController
@RequestMapping("/formas_pago")
public class FormapController {
    
    @Autowired
    private FormapServices formapService;

    @GetMapping
    public ArrayList<FormapModel> getClientes(){
        return this.formapService.getClientes();
    }

    @PostMapping
    public FormapModel saveClientes(@RequestBody FormapModel formap){
        return this.formapService.saveCliente(formap);
      }

    @GetMapping(path = "/{id}")
    public Optional<FormapModel> getUserById(@PathVariable("id") Long id){
        return this.formapService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.formapService.deleteUser(id);
        
    if (delete) {
        return "The user with the id " + id + " was deleted successfully";
    } else {
        return "Error deleting the user with the id " + id;
    }
    }

}