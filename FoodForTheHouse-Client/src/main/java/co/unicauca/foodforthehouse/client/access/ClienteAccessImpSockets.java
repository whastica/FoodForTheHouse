package co.unicauca.foodforthehouse.client.access;

import co.unicauca.foodforthehouse.commons.infra.Protocol;
import co.unicauca.foodforthehouse.commons.domain.Cliente;
import co.unicauca.foodforthehouse.commons.infra.JsonError;
import co.unicauca.foodforthehouse.client.infra.FoodForTheHouseSocket;
import co.unicauca.foodforthehouse.commons.domain.Restaurante;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*@author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
 */

public class ClienteAccessImpSockets  implements IClienteAccess {
     /**
     * El servicio utiliza un socket para comunicarse con la aplicación server
     */
    private FoodForTheHouseSocket mySocket;

    public ClienteAccessImpSockets() {
        mySocket = new FoodForTheHouseSocket();
    }
    public void listMenuDia(int idRes,String resource){}
    public void elegirRestaurant(Restaurante restaurant){}
}
