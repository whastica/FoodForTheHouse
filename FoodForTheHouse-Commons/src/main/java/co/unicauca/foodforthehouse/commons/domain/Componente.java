package co.unicauca.foodforthehouse.commons.domain;

/**
* @author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
 */

public class Componente {
 private int id;
    private String nombre;
    private TipoComponente tipo;
    
    //constructor vacio
    public Componente(){ }
    //constructor para ingresar plato
    public Componente(int id, String nombre, TipoComponente tipo){
        this.id=id;
        this.nombre=nombre;
        this.tipo=tipo;
    }
    
    public Componente(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoComponente getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(TipoComponente tipo) {
        this.tipo = tipo;
    }
}
