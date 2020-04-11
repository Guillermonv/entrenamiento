package com.example.entrenamiento._1_ClassDesign._6_FinalKeyword;

//Las clases finales no se pueden extender
//Los metodos finales no se puede sobreescribir
//Las variables finales no pueden cambiar su valor una vez inicializadas
public class main {
    final static int IVA = 10;

    final class Outter {
        String name = "TEst";

        public final void print() {

        }
    }

    class Inner {
        Outter outter = new Outter();

        public void test() {
            outter.print();
            outter.name = "ad";

        }
    }

    public static void main(String[] args) {


    }
}
