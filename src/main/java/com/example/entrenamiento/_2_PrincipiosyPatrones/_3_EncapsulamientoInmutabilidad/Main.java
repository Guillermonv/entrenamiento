package com.example.entrenamiento._2_PrincipiosyPatrones._3_EncapsulamientoInmutabilidad;


class Casa {
    int precio;
    static   String barrio;

    public Casa(int precio, String barrio) {
        this.precio = precio;
        this.barrio = barrio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}

final class Persona{
    private String nombre ;
    private String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;

    }

}

public class Main {

    public static void main(String[] args) {
        Casa casa1 = new Casa(10000, "centro");
        Casa casa2 = new Casa(10000, "semi priviado");
        casa1.setBarrio("privado");

        System.out.println("La casa 1 esta en " + casa1.getBarrio() + " la casa 2 se encuentra en " + casa2.getBarrio());

        String saludo = "Hola";
        saludo = saludo.toUpperCase();
        StringBuilder saludar= new StringBuilder("Hello");
        saludar.append(" word");
        System.out.println(saludo);
        System.out.println(saludar);
    }
}
