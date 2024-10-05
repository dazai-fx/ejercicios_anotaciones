package org.iesvdm.ejercicicio2.empresa;

import java.util.ArrayList;

public class CargadorContexto {

    public static ArrayList<Empleado> cargaContextoEmpresa() {

        org.iesvdm.ejercicicio2.anotacion.Empleado[] empleadosAnotacion = Empresa.class.getAnnotationsByType(org.iesvdm.ejercicicio2.anotacion.Empleado.class);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        for (org.iesvdm.ejercicicio2.anotacion.Empleado empleado: empleadosAnotacion){

            // propiedades comunes a todos los empleados
            String nombre= empleado.nombre();
            String apellido = empleado.apellido();
            String dni = empleado.dni();
            String direccion = empleado.direccion();
            String telefono = empleado.telefono();
            String clase = empleado.clase();// Propiedad para filtrar el tipo de empleado

            if(clase.equalsIgnoreCase("Directivo")){

                int codigoDespacho = empleado.codigoDespacho();

                Directivo empleadoDirectivo = new Directivo(nombre, apellido, dni, direccion, telefono, clase, codigoDespacho);

                listaEmpleados.add(empleadoDirectivo);


            }else if(clase.equalsIgnoreCase("Tecnico")){

                int codigoTaller = empleado.codigoTaller();
                String perfil = empleado.perfil();

                Tecnico empleadoTecnio = new Tecnico(nombre, apellido, dni, direccion, telefono, clase, codigoTaller, perfil);

                listaEmpleados.add(empleadoTecnio);

            }else if(clase.equalsIgnoreCase("Oficial")){

                int codigoTaller = empleado.codigoTaller();
                String categoria = empleado.categoria();

                Oficial empleadoOficial = new Oficial(nombre, apellido, dni, direccion, telefono, clase, codigoTaller, categoria);

                listaEmpleados.add(empleadoOficial);

            }else{
                System.out.println("Error con empleado, solo se pueden crear empleados directivo, tecnico o oficial");
            }

        }

        return listaEmpleados;

    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = CargadorContexto.cargaContextoEmpresa();

        Empresa miEmpresa = new Empresa("Mi empresa", empleados);

        System.out.println(miEmpresa);

    }

}

