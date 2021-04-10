package co.unicauca.foodforthehouse.client.access;

import co.unicauca.foodforthehouse.commons.infra.Utilities;

/**
* @author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
 */
public class Factory {
        private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia ICustomerService
     *
     * @return una clase hija de la abstracción IRepositorioClientes
     */
    public IClienteAccess getClienteService() {

        IClienteAccess result = null;
        String type = Utilities.loadProperty("cliente.service");
        
        switch (type) {
            case "default":
                result = new ClienteAccessImpSockets();
                break;
        }
        return result;
    }
}
