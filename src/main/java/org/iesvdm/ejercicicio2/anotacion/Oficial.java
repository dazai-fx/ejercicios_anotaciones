package org.iesvdm.ejercicicio2.anotacion;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Oficial {

    Empleado empleado();
    int codTaller();
    String categoria();

}
