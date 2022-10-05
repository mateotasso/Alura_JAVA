package ar.com.java.io.test;

import java.io.Serializable;

public class Cliente implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6084367685489490829L;
    private String nombre;
    private int documento;
    private int edad;

    public Cliente(String nombre, int documento, int edad) {
        super();
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }
}
