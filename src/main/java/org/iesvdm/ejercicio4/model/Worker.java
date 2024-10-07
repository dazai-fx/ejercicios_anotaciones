package org.iesvdm.ejercicio4.model;

import lombok.NonNull;

public class Worker {

    private String name;

    /*
    * se utiliza para indicar que un parámetro o campo no debe ser nulo.
    * Lombok genera una validación de nulidad en el constructor o el
    * método, lanzando una excepción.
     */
    public void setName(@NonNull Person p){
        this.name=p.getName();
    }

    public String getName(){
        return name;
    }

}

