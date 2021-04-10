package co.unicauca.foodforthehouse.client.domain.service;

import co.unicauca.foodforthehouse.client.access.IClienteAccess;
import co.unicauca.foodforthehouse.commons.domain.Cliente;
import co.unicauca.foodforthehouse.commons.domain.Restaurante;
import co.unicauca.foodforthehouse.commons.infra.JsonError;
import co.unicauca.foodforthehouse.server.access.IClienteRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
/**
 ** Es una fachada para comunicar la presentación con el dominio
* @author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
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
    public ServiciosCliente(IClienteRepository repo) {
        this.repo = repo;
    }

    /**
     * Buscar un cliente
     *
     * @param id cedula
     * @return objeto tipo Customer
     */
    public Cliente findCustomer(String id) {
        return repo.findCustomer(id);
    }

    /**
     * Crea un nuevo customer. Aplica validaciones de negocio
     *
     * @param customer cliente
     * @return devuelve la cedula del customer creado
     */
    public String createCliente(Cliente cliente) {
        List<JsonError> errors = new ArrayList<>();
  
        // Validaciones y reglas de negocio
        return repo.createCustomer(cliente);
    }

    }

