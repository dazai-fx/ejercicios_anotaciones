package org.iesvdm.ejercicicio2.empresa;

import org.iesvdm.ejercicicio2.anotacion.Directivo;
import org.iesvdm.ejercicicio2.anotacion.Oficial;
import org.iesvdm.ejercicicio2.anotacion.Tecnico;
import org.iesvdm.ejercicicio2.anotacion.Empleado;
import org.iesvdm.ejercicicio2.anotacion.Empleados;

import org.iesvdm.ejercicicio2.anotacion.Directivo;

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


@Directivo(
        empleado = @Empleado(
                nombre = "Javier",
                apellido = "Jimenez",
                dni = "79840302",
                direccion = "ctra de los montes casa 2",
                telefono = "669840398",
                clase = "Directivo"
        ),
        codDespacho = 2
)
@Oficial(

        empleado = @Empleado(
                nombre = "Javier",
                apellido = "Jimenez",
                dni = "79840302",
                direccion = "ctra de los montes casa 2",
                telefono = "669840398",
                clase = "Oficial"
        ),
        codTaller = 1,
        categoria = "Adminitrstadores")

@Tecnico(

        empleado = @Empleado(
                nombre = "Javier",
                apellido = "Jimenez",
                dni = "79840302",
                direccion = "ctra de los montes casa 2",
                telefono = "669840398",
                clase = "Tecnico"
        ),
        codTaller = 1,
        perfil = "Tecnico en sistemas"

)

public class Empresa {

    private String nombre;
    private ArrayList<org.iesvdm.ejercicicio2.empresa.Empleado> empleados = new ArrayList<>();

    public Empresa(String nombre, ArrayList<org.iesvdm.ejercicicio2.empresa.Empleado> empleados) {

        this.nombre = nombre;
        this.empleados=empleados;
    }

    public List<org.iesvdm.ejercicicio2.empresa.Empleado> getEmpleados() {
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

