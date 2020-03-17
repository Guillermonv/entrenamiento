package com.example.entrenamiento._2_PrincipiosyPatrones._2_6_Factory;

abstract class Luchador{
    abstract void luchar();
}
class Boxeador extends Luchador{

    @Override
    void luchar() {
        System.out.println("Pelea con las manos");
    }
}
class MMAFighter extends Luchador{

    @Override
    void luchar() {
        System.out.println("Pelea con manos y pies en un octagono");
    }
}
class LuchadorFactory{
    Luchador getLuchador(String type){
        if(type.equalsIgnoreCase("Boxeador")){
            return new Boxeador();
        }
        if(type.equalsIgnoreCase("MMA")){
            return new MMAFighter();
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        LuchadorFactory factory = new LuchadorFactory();
        Luchador boxeador = factory.getLuchador("Boxeador");
        System.out.println("--Atributos del boxeador");
        boxeador.luchar();

        Luchador MMAfighter = factory.getLuchador("MMA");
        System.out.println("--Atributos del MMA fighter");
        MMAfighter.luchar();
    }

}
