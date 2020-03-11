package com.example.entrenamiento._2_PrincipiosyPatrones._2_2_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

@FunctionalInterface
interface interace1 {
    void metodo1();

    default void metodo2() {

    }
}

@FunctionalInterface
interface interace2 extends interace1 {

}

class Animal {
    String specie;
    boolean puedeNadar;
    boolean puedeSaltar;

    public Animal(String specie, boolean puedeNadar, boolean puedeSaltar) {
        this.specie = specie;
        this.puedeNadar = puedeNadar;
        this.puedeSaltar = puedeSaltar;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "specie='" + specie + '\'' +
                ", puedeNadar=" + puedeNadar +
                ", puedeSaltar=" + puedeSaltar +
                '}';
    }
}

@FunctionalInterface
interface ClasificadorDeAnimales {
    boolean chequear(Animal animal);
}

public class Main {
    static void clasificar(Animal animal, Predicate<Animal> clasificadorDeAnimales) {
        if (clasificadorDeAnimales.test(animal)) {
            System.out.println(animal.toString());
        }
    }

    public static void main(String[] args) {
        clasificar(new Animal("PERRO", false, true),
                (Animal animal) -> {
                    return animal.puedeSaltar;
                });

        clasificar(new Animal("PEZ", true, false), //ANIMAL
                animal -> animal.puedeNadar);//interfaz funcional
        Predicate<Integer> filtrarMenores = x-> x>2;
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8);
        ints.stream().filter(filtrarMenores).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 6;

            }
        }).forEach(x -> System.out.println(x));
        BiPredicate<String , String> validateEqulas = (a , b) -> a.equals(b);
        
        System.out.println(validateEqulas);
    }
}

