package com.example.entrenamiento._1_ClassDesign._5_AbstractClass;

abstract class Peleador{
    void ingresar(){
        System.out.println("Ingresando al ring");
    }
    abstract void pelear();
    void salir(){
        System.out.println("Saliendo del ring");
    }
}
class Boxeador extends Peleador{

    @Override
    void pelear() {
        System.out.println("Pelando con las manos");
    }
    void pelear(String skills){
        System.out.println("pela con " + skills);
    }
}
class Karateka extends Peleador{

    @Override
    void pelear() {
        System.out.println("pelea con manos y pies");
    }
    void salir() {
        System.out.println("Da una nota sobre el evento y sale");
    }
}
public class main {

    public static void main(String[] args) {
        Karateka karateka = new Karateka();
        Boxeador boxeador = new Boxeador();
        karateka.ingresar();
        boxeador.pelear(" los codos");
        boxeador.ingresar();
        boxeador.pelear();
        karateka.pelear();
        boxeador.salir();
        karateka.salir();
    }
}
