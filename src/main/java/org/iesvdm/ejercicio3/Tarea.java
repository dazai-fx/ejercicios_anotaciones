package org.iesvdm.ejercicio3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Tarea {

    String titulo();
    String descripcion();
    String diaSemana();
    String hora();


}
