package co.unicauca.foodforthehouse.commons.domain;

/**
* @author Whalen Stiven Caicedo <whastica@unicauca.edu.co>
 * @author Yaquelin Alejandra Gomez <yaquelineagp@unicauca.edu.co>
 * @author Juan David Muñoz Pasquel <jdamupasquel@unicauca.edu.co>
 * @author Jose Ricardo Galindez <jrgalindez@unicauca.edu.co>
 * @author Sebastian Sanchez <@unicauca.edu.co>
 */

public class Menu {
    private int idMenu;
    private DiaMenu dia;
    private Plato plato;

    public Menu(){}
    
    public Menu(int id, DiaMenu dia, Plato plato) {
        this.idMenu = id;
        this.dia=dia;
        this.plato = plato;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public DiaMenu getDia() {
        return dia;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public void setDia(DiaMenu dia) {
        this.dia = dia;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }
}
