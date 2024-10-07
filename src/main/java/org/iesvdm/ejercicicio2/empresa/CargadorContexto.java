package org.iesvdm.ejercicicio2.empresa;

import java.util.ArrayList;

public class CargadorContexto {

    public static ArrayList<Empleado> cargaContextoEmpresa() {

        org.iesvdm.ejercicicio2.anotacion.Directivo[] empleadosAnotacionDirectivos = Empresa.class.getAnnotationsByType(org.iesvdm.ejercicicio2.anotacion.Directivo.class);

        org.iesvdm.ejercicicio2.anotacion.Tecnico[] empleadosAnotacionTecnico = Empresa.class.getAnnotationsByType(org.iesvdm.ejercicicio2.anotacion.Tecnico.class);

        org.iesvdm.ejercicicio2.anotacion.Oficial[] empleadosAnotacionOficial = Empresa.class.getAnnotationsByType(org.iesvdm.ejercicicio2.anotacion.Oficial.class);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        for (org.iesvdm.ejercicicio2.anotacion.Directivo empleado: empleadosAnotacionDirectivos) {

            // propiedades comunes a todos los empleados
            String nombre= empleado.empleado().nombre();
            String apellido = empleado.empleado().apellido();
            String dni = empleado.empleado().dni();
            String direccion = empleado.empleado().direccion();
            String telefono = empleado.empleado().telefono();
            String clase = empleado.empleado().clase();

            int codigoDespacho = empleado.codDespacho();

            Directivo empleadoDirectivo = new Directivo(nombre, apellido, dni, direccion, telefono, clase, codigoDespacho);

            listaEmpleados.add(empleadoDirectivo);


        }

        /*
        * else if(clase.equalsIgnoreCase("Oficial")){

                int codigoTaller = empleado.codigoTaller();
                String categoria = empleado.categoria();

                Oficial empleadoOficial = new Oficial(nombre, apellido, dni, direccion, telefono, clase, codigoTaller, categoria);

                listaEmpleados.add(empleadoOficial);

            }
        * */

        for (org.iesvdm.ejercicicio2.anotacion.Tecnico empleado: empleadosAnotacionTecnico) {

            // propiedades comunes a todos los empleados
            String nombre= empleado.empleado().nombre();
            String apellido = empleado.empleado().apellido();
            String dni = empleado.empleado().dni();
            String direccion = empleado.empleado().direccion();
            String telefono = empleado.empleado().telefono();
            String clase = empleado.empleado().clase();

            int codigoTaller = empleado.codTaller();
            String perfil = empleado.perfil();
            Tecnico empleadoTecnio = new Tecnico(nombre, apellido, dni, direccion, telefono, clase, codigoTaller, perfil);

            listaEmpleados.add(empleadoTecnio);

        }

        for (org.iesvdm.ejercicicio2.anotacion.Oficial empleado: empleadosAnotacionOficial) {

            // propiedades comunes a todos los empleados
            String nombre= empleado.empleado().nombre();
            String apellido = empleado.empleado().apellido();
            String dni = empleado.empleado().dni();
            String direccion = empleado.empleado().direccion();
            String telefono = empleado.empleado().telefono();
            String clase = empleado.empleado().clase();

            int codigoTaller = empleado.codTaller();
            String categoria = empleado.categoria();

            Oficial empleadoOficial = new Oficial(nombre, apellido, dni, direccion, telefono, clase, codigoTaller, categoria);

            listaEmpleados.add(empleadoOficial);

        }


            return listaEmpleados;

    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = CargadorContexto.cargaContextoEmpresa();

        Empresa miEmpresa = new Empresa("Mi empresa", empleados);

        System.out.println(miEmpresa);

    }

}

