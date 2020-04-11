package com.example.entrenamiento._1_ClassDesign._2_Polimorfismo;

interface Peleador {

    public default  void entrenar (){
        System.out.println("PELEADOR ENTRENA");
    };
    public default void ingresar(){
        System.out.println("INGRESA AL RING");
    }
    void pelear();
    default void salir(){
        System.out.println("SALE DEL RING");
    }
}

 class Boxeador implements Peleador{
    public String attributo = "Valor";

    @Override
    public void pelear() {
        System.out.println("PELEA CON LA MANOS");
    }
}

class Karateka implements Peleador {

    @Override
    public void pelear() {
        System.out.println("PELEA CON LAS MANOS Y LOS PIES");
    }
}

public class main {
    String valor ="value";
    public static void main(String[] args) {
        Boxeador boxeador = new Boxeador();
        Karateka karateka = new Karateka();

        boxeador.entrenar();
        karateka.entrenar();
        karateka.ingresar();
        boxeador.ingresar();
        boxeador.pelear();
        karateka.pelear();

    }
}
