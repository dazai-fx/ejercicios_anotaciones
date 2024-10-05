package org.iesvdm.ejercicio4.model;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Maths {

    private double a;

    private double b;

    public double multiply(){
        return a*b;
    }

}
