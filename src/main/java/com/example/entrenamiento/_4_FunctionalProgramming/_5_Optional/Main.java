package com.example.entrenamiento._4_FunctionalProgramming._5_Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Exception {

        Optional<String> letras =  Optional.of("RANDOM PALABRAS");
      //  letras = Optional.empty();

        System.out.println(letras.orElseThrow(()-> new Exception("CUSTOM EXCPETION")));
        letras.ifPresent((x)-> System.out.println(" LA PALABRA ES " + x));
        if(letras.isPresent())
        System.out.println(esParONo(letras.get()));
        //String letras ;
        /*if(letras !=null)
            System.out.println((letras));*/

    }
    static String esParONo(String letras){
        if(letras.length()%2==0)
            return "ES PAR";
        else
            return "NO ES PAR";
    }

}

