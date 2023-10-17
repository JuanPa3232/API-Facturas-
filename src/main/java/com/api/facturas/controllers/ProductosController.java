package com.api.facturas.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.facturas.models.ProductosModel;
import com.api.facturas.services.ProductosServices;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    private ProductosServices prodService;

    @GetMapping
    public ArrayList<ProductosModel> getClientes(){
        return this.prodService.getClientes();
    }

    @PostMapping
    public ProductosModel saveClientes(@RequestBody ProductosModel producto){
        return this.prodService.saveCliente(producto);
      }

    @GetMapping(path = "/{id}")
    public Optional<ProductosModel> getUserById(@PathVariable("id") Long id){
        return this.prodService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.prodService.deleteUser(id);
        
    if (delete) {
        return "The user with the id " + id + " was deleted successfully";
    } else {
        return "Error deleting the user with the id " + id;
    }
    }

    
}