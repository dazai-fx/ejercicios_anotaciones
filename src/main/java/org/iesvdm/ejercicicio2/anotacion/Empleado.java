package org.iesvdm.ejercicicio2.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados.class)
@Documented
public @interface Empleado {
    String nombre();
    String apellido();
    String dni();
    String direccion() ;
    String telefono() ;
    String clase();
    int codigoDespacho() default 0;
    String categoria() default  "";
    String perfil() default "";

    int codigoTaller() default 0;
}
