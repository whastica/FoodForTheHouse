/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.foodforthehouse.server.access;
import co.unicauca.foodforthehouse.commons.domain.Cliente;

import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IClienteRepository {
  /**
     * Busca un Customer por su cedula
     * @param id cedula del cliente
     * @return  objeto de tipo Customer
     */
//    public Cliente findCliente(String id);
//    
//    public String createCliente(Cliente customer);    
    public boolean borrar(String email) ;
    public List listarClientes();
    public Cliente encontrarCliente(int id) ;
    public boolean actualizar(Cliente nuevoCliente);
    public void encontrarPorEmail(String email);
    public void crear(Cliente nuevoCliente);   
}
