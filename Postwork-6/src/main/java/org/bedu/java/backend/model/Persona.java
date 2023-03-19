package org.bedu.java.backend.model;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private String telefono;


    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Bienvenido "+this.nombre+"\n Tu telefono es "+ this.telefono;
    }

    @Override
    public int compareTo( Persona persona ) {
        return this.nombre.compareTo( persona.nombre );
    }

}
