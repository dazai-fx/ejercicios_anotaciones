package org.iesvdm.ejercicio1.anotacion;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Empleados {

    Empleado[] value();

}
