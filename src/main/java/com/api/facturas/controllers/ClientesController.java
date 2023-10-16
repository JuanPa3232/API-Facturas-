package com.api.facturas.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.facturas.models.ClientesModel;
import com.api.facturas.services.ClientesServices;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    
    @Autowired
    private ClientesServices cliServices;

    @GetMapping
    public ArrayList<ClientesModel> getClientes(){
        return this.cliServices.getClientes();
    }

    @PostMapping
    public ClientesModel saveClientes(@RequestBody ClientesModel cliente){
        return this.cliServices.saveCliente(cliente);
      }

}