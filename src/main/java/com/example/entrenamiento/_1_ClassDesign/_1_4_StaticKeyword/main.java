package com.example.entrenamiento._1_ClassDesign._1_4_StaticKeyword;

class OutterClass {
    static int valor = 8;

    public static int print() {
        return valor;
    }

    class inner {
        int valor = 7;
    }

    {
        System.out.println("Invocando clase");
    }

    static {
        System.out.println("Esto se ejecuta antes");
    }

    public OutterClass() {
        System.out.println("Esto va al final");
    }
}

public class main {
    public static void main(String[] args) {
        OutterClass outterClass = new OutterClass();
        //OutterClass.print();
        //System.out.println(outterClass.valor);
        //OutterClass.inner inner = new OutterClass().new inner();

    }

}
