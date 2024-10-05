package org.iesvdm.ejercicio1.empresa;

public final class Directivo extends Empleado {

    private int codigoDespacho;

    public Directivo(String nombre, String apellido, String dni, String direccion, String telefono, String clase, int codigoDespacho) {
        super(nombre, apellido, dni, direccion, telefono, clase);
        this.codigoDespacho = codigoDespacho;
    }

    public int getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(int codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "codigoDespacho=" + codigoDespacho +
                "} " + super.toString();
    }


}
