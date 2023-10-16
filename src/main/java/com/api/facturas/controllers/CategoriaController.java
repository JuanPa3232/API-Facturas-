package com.api.facturas.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.facturas.models.CategoriaModel;
import com.api.facturas.services.CategoriaServices;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    
    @Autowired
    private CategoriaServices categoriaService;

    @GetMapping
    public ArrayList<CategoriaModel> getClientes(){
        return this.categoriaService.getClientes();
    }

    @PostMapping
    public CategoriaModel saveClientes(@RequestBody CategoriaModel categoria){
        return this.categoriaService.saveCliente(categoria);
      }

    @GetMapping(path = "/{id}")
    public Optional<CategoriaModel> getUserById(@PathVariable("id") Long id){
        return this.categoriaService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.categoriaService.deleteUser(id);
        
    if (delete) {
        return "The user with the id " + id + " was deleted successfully";
    } else {
        return "Error deleting the user with the id " + id;
    }
    }
}