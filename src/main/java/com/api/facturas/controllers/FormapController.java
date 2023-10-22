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
    public ArrayList<FormapModel> getFormaPago(){
        return this.formapService.getFormaPago();
    }

    @PostMapping
    public FormapModel saveFormaPago(@RequestBody FormapModel formap){
        return this.formapService.saveFormaPago(formap);
      }

    @GetMapping(path = "/{id}")
    public Optional<FormapModel> getUserById(@PathVariable("id") Long id){
        return this.formapService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public FormapModel updateById(@RequestBody FormapModel request, @PathVariable Long id){
        return this.formapService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.formapService.deleteFormaPago(id);
        
    if (delete) {
        return "La forma de pago con el id " + id + " fue eliminiado con exito";
    } else {
        return "Hubo un error eliminando la forma de pago con el id:  " + id;
    }
    }

}