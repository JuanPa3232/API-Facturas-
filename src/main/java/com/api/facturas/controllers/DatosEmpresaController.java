package com.api.facturas.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.facturas.models.DatosEmpresaModel;
import com.api.facturas.services.DatosEmpresaServices;

@RestController
@RequestMapping("/datos_empresa")
public class DatosEmpresaController {

    @Autowired
    private DatosEmpresaServices datosService;

    @GetMapping
    public ArrayList<DatosEmpresaModel> getEmpresa(){
        return this.datosService.getEmpresa();
    }

    @PostMapping
    public DatosEmpresaModel saveDatosEmpresa(@RequestBody DatosEmpresaModel datos_empresa){
        return this.datosService.saveEmpresa(datos_empresa);
      }

    @GetMapping(path = "/{id}")
    public Optional<DatosEmpresaModel> getUserById(@PathVariable("id") Long id){
        return this.datosService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public DatosEmpresaModel updateById(@RequestBody DatosEmpresaModel request, @PathVariable Long id){
        return this.datosService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.datosService.deleteDatosEmpresa(id);
        
    if (delete) {
        return "Los datos de la empresa con el id " + id + " fueron eliminiados con exito";
    } else {
        return "Hubo un error eliminando a la empresa con el id:  " + id;
    }
    }
}