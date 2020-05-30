package com.example.entrenamiento._6_ExceptionsAndAssertions._1_tryCatchFinally;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //checked
        //System.out.println(1/0);
        // LocalDate localDate = LocalDate.of(2020,05,50);
System.err.println("Dafuq");
        try {
            int valor = 2; // cambiar valor para acceder a differente flow
            if (valor == 0)
                throw new IOException("ERROR DE DATO");
            else if (valor > 1)
                throw new NoSuchFieldException("NO HAY ARCHIVO");
        } catch (IOException e) {
            System.out.println("ALGO MALO PASO CON EL DATO INGRESO");

        } catch (NoSuchFieldException e) {
            System.out.println("NO SE ENCONTRO EL ARCHIVO");
        }
        finally {
            System.out.println("CERRAMOS CONEXION");
        }

        System.out.println("PROXIMO PASO");
    }
}

