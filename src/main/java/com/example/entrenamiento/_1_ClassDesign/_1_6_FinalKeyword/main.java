package com.example.entrenamiento._1_ClassDesign._1_6_FinalKeyword;

public class main {
    final static int IVA = 10;

    final class Outter {
        String name = "TEst";

        public final void print() {

        }
    }
ngnex
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
