package org.iesvdm.ejercicio4.model;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Maths {

    /*
    @Value es similar a @Data, pero se usa para crear objetos inmutables. Esta anotación:

    Marca todos los campos como final.
    Genera un constructor para todos los campos.
    Genera getters para cada campo, pero no setters.
    Implementa métodos equals(), hashCode() y toString().
    Marca la clase como final para evitar que sea extendida.
    */

    private double a;

    private double b;

    public double multiply(){
        return a*b;
    }

}
