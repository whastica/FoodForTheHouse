package co.unicauca.foodforthehouse.server.access;

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
     * Método que crea una instancia concreta de la jerarquia
     * ICustomerRepository
     *
     * @return una clase hija de la abstracción IRepositorioClientes
     */
    public IClienteRepository getRepository() {
        String type = Utilities.loadProperty("cliente.repository");
        if (type.isEmpty()) {
            type = "default";
        }
        IClienteRepository result = null;

        switch (type) {
            case "default":
                result = new ClienteRepositoryImpArrays();
                break;
            case "mysql":
                result = new ClienteRepositoryImpMysql();
                break;
        }

        return result;

    }
}
