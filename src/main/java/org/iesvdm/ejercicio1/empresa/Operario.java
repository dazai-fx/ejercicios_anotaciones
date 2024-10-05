package org.iesvdm.ejercicio1.empresa;

public abstract class Operario extends Empleado {
    private int codigoTaller;

    public Operario(String nombre, String apellido, String dni, String direccion, String telefono, String clase, int codigoTaller) {
        super(nombre, apellido, dni, direccion, telefono, clase);
        this.codigoTaller = codigoTaller;
    }

    public int getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(int codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "codigoTaller=" + codigoTaller +
                "} " + super.toString();
    }
}

