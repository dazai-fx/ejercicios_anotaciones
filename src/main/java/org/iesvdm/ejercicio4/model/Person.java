package org.iesvdm.ejercicio4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    /*
    @Data es una anotación muy completa que combina las siguientes funcionalidades:

     Genera getters y setters para todos los campos.
     Genera un método toString().
     Genera los métodos equals() y hashCode().
     Genera un constructor para todos los campos que no sean final.
     Marca todos los campos como private.

     */

    /*
     @Builder implementa el patrón de diseño Builder, que permite construir instancias
     de objetos complejos paso a paso, de manera fluida

     Esto es útil para clases con muchos parámetros, ya que puedes crear objetos sin
     necesidad de especificar todos los valores en el constructor.

     */

    private String name;
    private int age;
    private String gender;
    private String address;

}