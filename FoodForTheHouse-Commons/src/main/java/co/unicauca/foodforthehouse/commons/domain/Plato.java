package co.unicauca.foodforthehouse.commons.domain;

import java.util.List;

/**
* @author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
 */

public class Plato {
    private int id;
    private String nombre;
    private TipoPlato tipo;
    private List<Componente> componentes;
    
    //constructor vacio
    public Plato(){ }
    //constructor para ingresar plato
    public Plato(int id, String nombre, TipoPlato tipo){
        this.id=id;
        this.nombre=nombre;
        this.tipo=tipo;
    }
    
    public Plato(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoPlato getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(TipoPlato tipo) {
        this.tipo = tipo;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }
    
}
