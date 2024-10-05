package org.iesvdm.ejercicicio2.empresa;

public final class Tecnico extends Operario {

    private String perfil;

    public Tecnico(String nombre, String apellido, String dni, String direccion, String telefono, String clase, int codigoTaller, String perfil) {
        super(nombre, apellido, dni, direccion, telefono, clase, codigoTaller);
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "perfil='" + perfil + '\'' +
                "} " + super.toString();
    }
}

