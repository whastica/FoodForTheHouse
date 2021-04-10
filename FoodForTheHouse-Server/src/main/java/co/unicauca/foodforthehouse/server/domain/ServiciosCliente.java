/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.unicauca.foodforthehouse.server.domain;

import co.unicauca.foodforthehouse.commons.domain.Cliente;
import co.unicauca.foodforthehouse.commons.infra.JsonError;
import co.unicauca.foodforthehouse.commons.infra.Utilities;
import co.unicauca.foodforthehouse.server.access.IClienteRepository;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ServiciosCliente {

    /**
     * Repositorio de clientes
     */
    IClienteRepository repo;

    /**
     * Constructor parametrizado. Hace inyeccion de dependencias
     *
     * @param repo repositorio de tipo ICustomerRepository
     */
    public ClienteService(IClienteRepository repo) {
        this.repo = repo;
    }

    /**
     * Buscar un cliente
     *
     * @param id cedula
     * @return objeto tipo Customer
     */
    public Cliente findCliente(String id) {
        return repo.findCliente(id);
    }

    /**
     * Crea un nuevo customer. Aplica validaciones de negocio
     *
     * @param cliente cliente
     * @return devuelve la cedula del cliente creado
     */
    public String createCliente(Cliente cliente) {
        List<JsonError> errors = new ArrayList<>();
  
        // Validaciones y reglas de negocio
        if (cliente.getId().isEmpty() || cliente.getFirstName().isEmpty()
                || cliente.getLastName().isEmpty() || cliente.getEmail().isEmpty()
                || cliente.getGender().isEmpty()) {
           errors.add(new JsonError("400", "BAD_REQUEST","id, nombres, apellidos, email y género son obligatorios. "));
        }
        
        if (!cliente.getEmail().contains("@")){
            errors.add(new JsonError("400", "BAD_REQUEST","Email debe tener una @. "));
        }
        
        if(!(cliente.getGender().equalsIgnoreCase("M") || cliente.getGender().equalsIgnoreCase("F"))){
            errors.add(new JsonError("400", "BAD_REQUEST","Sexo debo ser M o F. "));
        }      
        
        if(!Utilities.isNumeric(cliente.getMobile())){
            errors.add(new JsonError("400", "BAD_REQUEST","Teléfono móvil debe contener sólo dígitos "));
            
        }
        // Que no esté repetido
        
        Cliente clienteSearched = this.findCliente(cliente.getId());
        if (clienteSearched != null){
            errors.add(new JsonError("400", "BAD_REQUEST","La cédula ya existe. "));
        }
        
       if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorsJson = gson.toJson(errors);
            return errorsJson;
        }             
        return repo.createCliente(cliente);
    }
}
