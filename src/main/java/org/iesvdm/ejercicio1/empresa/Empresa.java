package org.iesvdm.ejercicio1.empresa;

import org.iesvdm.ejercicio1.anotacion.Empleado;
import org.iesvdm.ejercicio1.anotacion.Empleados;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/*@Empleado(
        nombre = "Jose",
        apellido = "López",
        dni = "7928304",
        direccion = "ctra de ligeron urb los alamos piso 12",
        telefono = "662489329",
        clase = "Tecnico"
)
@Empleado(
        nombre = "Javier",
        apellido = "Bueno",
        dni = "8028304",
        direccion = "ctra de ligeron urb los alamos piso 22",
        telefono = "625589329",
        clase = "Directivo"
)*/
@Empleados({
        @Empleado(nombre = "jose Antonio",  apellido = "Lopez Gomez", dni = "7928304", direccion = "ctra de ligeron urb los alamos piso 12", telefono = "662489329", clase = "Directivo", codigoDespacho=1),
        @Empleado(nombre = "Antonio Jose",  apellido = "Gomez López", dni = "8028304", direccion = "ctra de ligeron urb los alamos piso 22", telefono = "664089329", clase = "Tecnico", perfil = "administrador", codigoTaller=1),
        @Empleado(nombre = "Manuel Javier",  apellido = "Juan Antonio", dni = "2228304", direccion = "calle 12 urb alola casa 12", telefono = "665589329", clase = "Oficial", categoria = "categoria random", codigoTaller=2)
})
public class Empresa {

    private String nombre;
    private ArrayList<org.iesvdm.ejercicio1.empresa.Empleado> empleados = new ArrayList<>();

    public Empresa(String nombre, ArrayList<org.iesvdm.ejercicio1.empresa.Empleado> empleados) {

        this.nombre = nombre;
        this.empleados=empleados;
    }

    public List<org.iesvdm.ejercicio1.empresa.Empleado> getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                "Empleados='"+ empleados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nombre, empresa.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}

