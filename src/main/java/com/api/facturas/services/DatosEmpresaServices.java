package com.api.facturas.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facturas.models.DatosEmpresaModel;
import com.api.facturas.repositories.DatosEmpresaRepository;

@Service
public class DatosEmpresaServices {
    
    @Autowired
    DatosEmpresaRepository datosRepo;

    public ArrayList<DatosEmpresaModel> getEmpresa(){
        return (ArrayList<DatosEmpresaModel>) datosRepo.findAll();
        
    }

    public DatosEmpresaModel saveEmpresa(DatosEmpresaModel datos_empresa){
        return datosRepo.save(datos_empresa);
    }

    public Optional<DatosEmpresaModel> getById(Long id){
        return datosRepo.findById(id);
    }

    public DatosEmpresaModel updateById(DatosEmpresaModel request, Long id){
        DatosEmpresaModel empresa = datosRepo.findById(id).get();
        
        empresa.setNombre(request.getNombre());
        empresa.setTelefono(request.getTelefono());
        empresa.setCorreo(request.getCorreo());
        empresa.setDomicilio(request.getDomicilio());
        empresa.setRfc(request.getRfc());

        return datosRepo.save(empresa);
    }

    public Boolean deleteDatosEmpresa(Long id){
        try {
            datosRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
}