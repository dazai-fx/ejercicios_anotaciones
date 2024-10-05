package org.iesvdm.ejercicicio2.empresa;


public final class Oficial extends Operario {

    private String categoria;

    public Oficial(String nombre, String apellido, String dni, String direccion, String telefono, String clase, int codigoTaller, String categoria) {
        super(nombre, apellido, dni, direccion, telefono, clase, codigoTaller);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "Oficial{" +
                "categoria='" + categoria + '\'' +
                "} " + super.toString();
    }
}
