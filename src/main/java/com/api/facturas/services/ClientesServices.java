package com.api.facturas.services;

import java.util.ArrayList;
import java.util.Optional;

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

    public Optional<ClientesModel> getById(Long id){
        return clientesRepo.findById(id);
    }

    public ClientesModel updateById(ClientesModel request, Long id){
        ClientesModel cliente = clientesRepo.findById(id).get();

        cliente.setNombre(request.getNombre());
        cliente.setApellido(request.getApellido());
        cliente.setTelefono(request.getTelefono());
        cliente.setDomicilio(request.getDomicilio());
        cliente.setCorreo(request.getCorreo());
        cliente.setRfc(request.getRfc());
        cliente.setFecha_nacimiento(request.getFecha_nacimiento());
        cliente.setActividad(request.getActividad());
        
        return clientesRepo.save(cliente);
    }

    public Boolean deleteUser(Long id){
        try {
            clientesRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
}