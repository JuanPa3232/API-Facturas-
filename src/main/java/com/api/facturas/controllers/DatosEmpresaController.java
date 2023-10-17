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
    public ArrayList<DatosEmpresaModel> getClientes(){
        return this.datosService.getClientes();
    }

    @PostMapping
    public DatosEmpresaModel saveClientes(@RequestBody DatosEmpresaModel datos_empresa){
        return this.datosService.saveCliente(datos_empresa);
      }

    @GetMapping(path = "/{id}")
    public Optional<DatosEmpresaModel> getUserById(@PathVariable("id") Long id){
        return this.datosService.getById(id);
    }

}