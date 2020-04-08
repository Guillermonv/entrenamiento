package com.example.entrenamiento._3_CollectionsyGenerics._3_2_Generics;

abstract class envio<T>{
    abstract void envio(T t);
}

class Normal{
    void detail(){
        System.out.println("El envio normal demora de 1 a 4 dias");
    }
}
class Prioritario{
    void detail(){
        System.out.println("el envio se hace en el dia");
    }
}

class Producto<T,V> extends envio<Normal>{
    T tipo;
    V marca;

    public Producto(T tipo, V marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    @Override
    void envio(Normal normal) {
        System.out.println("Se realiza el envio de " + tipo.toString() + " de la marca " + marca.toString());
        normal.detail();
    }
}
class Celular{
    @Override
    public String toString() {
        return "Celular{}";
    }
}

class Medicamento extends envio<Prioritario>{

    @Override
    void envio(Prioritario prioritario) {
        System.out.println("Envio de medicamento");
        prioritario.detail();
    }
}

public class Main {
    static class Helper{
        public static <U extends Exception> void printException(U u){
            System.out.println(u.getMessage());
        }
    }

    public static void main(String[] args) {
            Producto<Celular,String> celularStringProducto = new Producto<>(new Celular(),"Nokia");
            celularStringProducto.envio(new Normal());
            Medicamento medicamento = new Medicamento();
            medicamento.envio(new Prioritario());
            Helper.<NullPointerException>printException(new NullPointerException("Test"));

    }
}
