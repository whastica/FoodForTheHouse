package co.unicauca.foodforthehouse.client.access;

import co.unicauca.foodforthehouse.commons.domain.Cliente;
import co.unicauca.foodforthehouse.commons.domain.Restaurante;
import java.util.List;

/**
 * interfaz que me permite acceder a los servicios que necesita e cliente
* @author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
 */
public interface IClienteAccess {
    public void listMenuDia(int idRes,String resource);
    public void elegirRestaurant(Restaurante restaurant);
}