package com.api.facturas.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.api.facturas.models.ClientesModel;
import com.api.facturas.services.ClientesServices;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    
    @Autowired
    private ClientesServices cliService;

    @GetMapping
    public ArrayList<ClientesModel> getClientes(){
        return this.cliService.getClientes();
    }

    @PostMapping
    public ClientesModel saveClientes(@RequestBody ClientesModel cliente){
        return this.cliService.saveCliente(cliente);
      }

    @GetMapping(path = "/{id}")
    public Optional<ClientesModel> getUserById(@PathVariable("id") Long id){
        return this.cliService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ClientesModel updateById(@RequestBody ClientesModel request, @PathVariable Long id){
        return this.cliService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
    boolean delete = this.cliService.deleteUser(id);
        
    if (delete) {
        return "The user with the id " + id + " was deleted successfully";
    } else {
        return "Error deleting the user with the id " + id;
    }
    }

}