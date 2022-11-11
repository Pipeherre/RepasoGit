package org.example;

public class Perro implements MostrarDatos {
    private String nombre;
    private String razaPerro;

    public Perro(String nombre, String razaPerro) {
        this.nombre = nombre;
        this.razaPerro = razaPerro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Soy un perro");
    }
}
