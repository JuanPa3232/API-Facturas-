package com.api.facturas.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public ArrayList<CategoriaModel> getCategoria(){
        return this.categoriaService.getCategoria();
    }

    @PostMapping
    public CategoriaModel saveCategoria(@RequestBody CategoriaModel categoria){
        return this.categoriaService.saveCategoria(categoria);
      }

    @GetMapping(path = "/{id}")
    public Optional<CategoriaModel> getUserById(@PathVariable("id") Long id){
        return this.categoriaService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public CategoriaModel updateById(@RequestBody CategoriaModel request, @PathVariable Long id){
        return this.categoriaService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.categoriaService.deleteCategoria(id);
        
    if (delete) {
        return "La categoria con el id " + id + " fue eliminiado con exito";
    } else {
        return "Hubo un error eliminando la categoria con el id:  " + id;
    }
    }
}