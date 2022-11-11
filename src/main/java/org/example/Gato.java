package org.example;

public class Gato implements MostrarDatos {

    // Los datos que se necesitan del gato.

    private String raza;
    private String edad;
    private String color;
    private String numeroVacunas;

    // Añadimos el constructor respectivo.

    public Gato(String raza, String edad, String color, String numeroVacunas) {
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.numeroVacunas = numeroVacunas;
    }

    // Añadimos los respectivos get y set para poder acceder o cambiar los datos agregados en el main.


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroVacunas() {
        return numeroVacunas;
    }

    public void setNumeroVacunas(String numeroVacunas) {
        this.numeroVacunas = numeroVacunas;
    }

    // Implementamos el método de MostrarDatos para realizar la impresión de la información.
    @Override
    public void mostrarInformacion() {
        System.out.println("El gato de raza " + getRaza() + " tiene una edad de " + getEdad() + " años, su color de pelaje es " + getColor() + " y tiene " + getNumeroVacunas() + " vacunas.");
    }
}
