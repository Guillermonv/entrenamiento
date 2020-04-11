package com.example.entrenamiento._1_ClassDesign._7_Enumeraciones;

//enums
//key sentsitve
//season values tiene name y ordinal
//se puede usear en un switch
//no puede extender otra enum

interface juegos {
    String jugar();
}

enum Temporadas implements juegos {
    VERANO {
        @Override
        public String jugar() {
            return "VOLEY DE PLAYA";
        }

        String getDescripcion() {
            return "HACE CALOR";
        }
    }, INVIERNO {
        @Override
        public String jugar() {
            return "SNOWBOARD";
        }

        String getDescripcion() {
            return "HACE FRIO";
        }
    };

    String getDescripcion() {
        return "";
    }
}

public class main {

    public static void main(String[] args) {

        System.out.println(Temporadas.VERANO.getDescripcion());
        System.out.println(Temporadas.VERANO.jugar());
        System.out.println(Temporadas.INVIERNO.getDescripcion());
        System.out.println(Temporadas.INVIERNO.jugar());
    }
}
