package co.unicauca.foodforthehouse.commons.domain;

/**
* @author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
 */
public class Restaurante {
 /**
     * identificador del restaurante, incremental
     */
    private int id;
    /**
     * identificador del cleinte o dueño asociado
     */
    private int idCliente;
    /**
     * codigo del restaurante, o agrupacion
     */
    private String codigo;
    /**
     * codigo del restaurante
     */
    private String nombre;
    /**
     * direccion
     */
    private int calle;
    /**
     *direccion
     */ 
    private int carrera;
    /**
     * constructor por defecto
     */
    public Restaurante() {}
    /**
    * constructor parametrizado
    * @param id identificador del rataurante
    * @param idcliente usuario asociado
    * @param codigo 
    * @param nombre
    * @param carrera direccion
    * @param calle direccion
    */
    public Restaurante(int id,int idcliente, String codigo, String nombre, int carrera,int calle) {
        this.id = id;
        this.idCliente=idcliente;
        this.codigo = codigo;
        this.nombre = nombre;
        this.calle = calle;
        this.carrera = carrera;
    }
    
    /**
     * Getter y setter
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int getCarrera() {
        return carrera;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }   
}
