package com.api.facturas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facturas.models.ClientesModel;
import com.api.facturas.repositories.ClientesRepository;

@Service
public class ClientesServices {
    
    @Autowired
    ClientesRepository clientesRepo;

    public ArrayList<ClientesModel> getClientes(){
        return (ArrayList<ClientesModel>) clientesRepo.findAll();
        
    }

    public ClientesModel saveCliente(ClientesModel cliente){
        return clientesRepo.save(cliente);
    }

}