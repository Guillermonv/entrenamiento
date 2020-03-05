package com.example.entrenamiento._1_ClassDesign._1_3_EqualsAndHashCodeAndToString;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Persona {
    String nombre;
    int dni;
    int pasos;

    public Persona(String nombre, int dni, int pasos) {
        this.nombre = nombre;
        this.dni = dni;
        this.pasos = pasos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", pasos=" + pasos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni &&
                nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni);
    }
}

public class main {
    public static void main(String[] args) {
        Persona persona = new Persona("Pedro" ,333333,2200);
    //    System.out.println(persona.toString());

        Persona persona1 = new Persona("Pedro",333333, 2300);
        System.out.println(persona.equals(persona1));

        Set<Persona> personaSet = new HashSet<>();
        personaSet.add(persona1);
        personaSet.add(persona);
        personaSet.stream().forEach(x->System.out.println(x.toString()));
    }



    }
