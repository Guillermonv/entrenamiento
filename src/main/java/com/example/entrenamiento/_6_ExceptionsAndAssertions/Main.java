package com.example.entrenamiento._6_ExceptionsAndAssertions;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //checked
        //System.out.println(1/0);
        // LocalDate localDate = LocalDate.of(2020,05,50);

        try {
            int valor = 2;
            if (valor == 0)
                throw new IOException("ERROR DE DATO");
            else if (valor > 1)
                throw new NoSuchFieldException("NO HAY ARCHIVO");
        } catch (IOException e) {
            System.out.println("ALGO MALO PASO");

        } catch (NoSuchFieldException e) {
            System.out.println("NO SE ENCONTRO EL ARCHIVO");
        }
        finally {
            System.out.println("CERRAMOS CONEXION");
        }

        System.out.println("PROXIMO PASO");
    }
}

