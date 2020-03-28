package com.example.entrenamiento._3_CollectionsyGenerics._3_5_SetAndTreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Persona implements Comparable<Persona>{
    int DNI;
    String name;

    public Persona(int DNI, String name) {
        this.DNI = DNI;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI=" + DNI +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        return name.compareTo(o.name);
    }
}

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona(232,"Juan");
        Persona persona2 = new Persona(231,"Pedro");
        Persona persona3 = new Persona(239,"Maria");
        Persona persona4 = new Persona(231,"Raquel");

        Set<Persona> personaSet = new HashSet<>();
        personaSet.add(persona1);
        personaSet.add(persona2);
        personaSet.add(persona3);
        personaSet.add(persona4);
        personaSet.add(persona1);
        personaSet.add(persona1);

        System.out.println("SET");
        personaSet.stream().forEach(x-> System.out.println(x.toString()));

        TreeSet<Persona> personaTreeSet = new TreeSet<>();
        personaTreeSet.add(persona1);
        personaTreeSet.add(persona2);
        personaTreeSet.add(persona3);
        personaTreeSet.add(new Persona(231213,"Ana"));
        personaTreeSet.add(persona4);
        personaTreeSet.add(persona1);
        personaTreeSet.add(persona1);

        System.out.println("TREESET");
        personaTreeSet.stream().forEach(x-> System.out.println(x.toString()));



    }
}
