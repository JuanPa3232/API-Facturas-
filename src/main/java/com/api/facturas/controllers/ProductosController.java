package com.api.facturas.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.facturas.models.ProductosModel;
import com.api.facturas.services.ProductosServices;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    private ProductosServices prodService;

    @GetMapping
    public ArrayList<ProductosModel> getProductos() {
        return this.prodService.getProductos();
    }

    @PostMapping
    public ProductosModel saveProducto(@RequestBody ProductosModel producto) {
        return this.prodService.saveProducto(producto);
    }

    @GetMapping(path = "/{id}")
    public Optional<ProductosModel> getUserById(@PathVariable("id") Long id) {
        return this.prodService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ProductosModel updateById(@RequestBody ProductosModel request, @PathVariable Long id) {
        return this.prodService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean delete = this.prodService.deleteProducto(id);

        if (delete) {
            return "La categoria con el id " + id + " fue eliminiado con exito";
        } else {
            return "Hubo un error eliminando la categoria con el id:  " + id;
        }
    }

}