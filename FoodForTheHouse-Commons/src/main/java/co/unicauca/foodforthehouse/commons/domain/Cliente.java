package co.unicauca.foodforthehouse.commons.domain;

/**
* @author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
 */
 
public class Cliente {
    /**
     * identificador incremental del cliente
     */
    private int idCliente;
    /**
     * nombre del cliente
     */
    private String nombre;
    /**
     * hace referencia a la direccion
     */
    private int carrera;
    /**
     * hace referenca a la direccion
     */
    private int calle;
    /**
     * para la aplicacion puede ser un comprador o visitante, un administrador o dueño de restaurante
     */
    private TipoCliente tipo;
    /**
     * el pasword del usuario
     */
    private String password;
    /**
     * un id de restaurante si es que esta asociado a uno.
     */
    private int idrestaurante;
    
    private String mail;
    /**
     * constructor por defecto
     */
    public Cliente() {};
    /**
    * constructor parametrizado
    * @param idCliente identificador
    * @param nombre nombre del usuario
    * @param carrera direccion
    * @param calle direccion
    * @param tipo administrador o comprador
    * @param password un password para su cuenta
    */
    public Cliente(int idCliente, String nombre, int carrera, int calle) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.carrera = carrera;
        this.calle = calle;
    }
    /**
     * Constructor Parametrizado
     * @param nombre
     * @param carrera
     * @param calle
     * @param tipo
     * @param password
     */
    public Cliente(String nombre, int carrera, int calle, TipoCliente tipo, String password) {

        this.nombre = nombre;
        this.carrera = carrera;
        this.calle = calle;
        this.tipo = tipo;
        this.password= password;
    }
    /**
     * constructor parametrizado
     * @param nombre nombre se usuario
     * @param password password
     */
    public Cliente(String nombre, String password) {
       this.nombre = nombre;
       this.password= password;
    }

    /**
     * Getter y setter
     * @return 
     */
    
    public int getCarrera() {
        return carrera;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    
    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public int getCalle() {
        return calle;
    }

    public void setCalle(int calle) {
        this.calle = calle;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }
    
    public int getIdrestaurante() {
        return idrestaurante;
    }

    public void setIdrestaurante(int idrestaurante) {
        this.idrestaurante = idrestaurante;
    } 
}
