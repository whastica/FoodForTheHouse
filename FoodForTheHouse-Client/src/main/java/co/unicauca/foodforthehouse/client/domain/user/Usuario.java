package co.unicauca.foodforthehouse.client.domain.user;

/**
 ** 
* @author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
 */
public class Usuario {
        /**
     *
     */
    private String login;
    /**
     *
     */
    private String password;
    /**
     * Nombres y apellidos completos
     */
    private String username;

    /**
     * Constructor que inicializa un usuario
     *
     * @param login nombre del usuario
     * @param password contraseña secreta
     * @param username nombre del usuario
     */
    public Usuario(String login, String password, String username) {
        this.login = login;
        this.password = password;
        this.username = username;

        //Vuelo vuelo = new Vuelo();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String contrasenia) {
        this.password = contrasenia;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String nombres) {
        this.username = nombres;
    }

}
