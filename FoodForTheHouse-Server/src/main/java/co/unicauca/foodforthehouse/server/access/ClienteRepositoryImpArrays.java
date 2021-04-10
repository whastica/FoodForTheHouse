package co.unicauca.foodforthehouse.server.access;

import co.unicauca.foodforthehouse.commons.domain.Cliente;
import co.unicauca.foodforthehouse.commons.domain.Restaurante;
import co.unicauca.foodforthehouse.commons.domain.Menu;
import java.util.ArrayList;
import java.util.List;

/**
* @author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
 */

public class ClienteRepositoryImpArrays implements IClienteRepository {
    /**
     * Array List de clientes
     */
    private static List<Cliente> clientes;

    public ClienteRepositoryImpArrays() {
        if (clientes == null){
            clientes = new ArrayList();
        }
        
        if (clientes.size() == 0){
            inicializar();
        }
    }

    public void inicializar() {
        clientes.add(new Cliente(98000001, "Andrea Sanchez", 14 , 12 ));
        clientes.add(new Cliente(98000001, "Andres Sanchez", 15 , 12 ));
    }

    /**
     * Busca u Customer en el arreglo
     *
     * @param id cedula del customer
     * @return objeto Customer
     */
    @Override
    public Cliente encontrarCliente(int id) {
        for (Cliente cliente : clientes) {
                if (cliente.getIdCliente() == id) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public int crear(Cliente cliente) {
        clientes.add(cliente);
        return cliente.getIdCliente();
    }
    
    public boolean borrar(String email) {
        return true;
    }
    public List listarClientes(){
        List<Cliente> cliente = new ArrayList<>();
        return cliente;
    }
    public boolean actualizar(Cliente nuevoCliente){
        return true;
    }
    public void encontrarPorEmail(String email){
    }


}
