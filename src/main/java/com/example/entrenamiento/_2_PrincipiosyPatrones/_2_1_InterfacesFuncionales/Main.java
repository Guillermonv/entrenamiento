package com.example.entrenamiento._2_PrincipiosyPatrones._2_1_InterfacesFuncionales;

@FunctionalInterface
interface interace1{
    void metodo1();
    default void metodo2(){

    }
}

@FunctionalInterface
interface interace2 extends interace1{

}

class Animal{
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
interface ClasificadorDeAnimales{
    boolean chequear(Animal animal);
}
public class Main {
    static void clasificar(Animal animal,  ClasificadorDeAnimales clasificadorDeAnimales){
        if(clasificadorDeAnimales.chequear(animal)){
            System.out.println(animal.toString());
        }
    }

    public static void main(String[] args) {
        clasificar(new Animal("PERRO",false,true),
                (Animal animal) ->{ return animal.puedeSaltar;} );

        clasificar(new Animal("PEZ",true,false), //ANIMAL
                animal -> animal.puedeNadar );//interfaz funcional
    }
}

