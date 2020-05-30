package com.example.entrenamiento._6_ExceptionsAndAssertions._4_Assertions;

public class Main {
    public static void main(String[] args) {
       // assert false:"Mensaje error custom";
     //   semaforo("Azul");
        assert getAnaulSalary(30000)==390000 : "Se esperaban 3900000 y se obtivieron" + getAnaulSalary(30000);

    }
    private static void semaforo(String color){
        switch (color){
            case "Rojo":
                System.out.println("PARE");
                break;
            case "Amarillo":
                System.out.println("PRECAUCION");
                break;
            case "Verde":
                System.out.println("AVANZAR");
            default:
                assert false :"COLOR DE SEMAFORO INVALIDO";
                break;
        }
    }
    public static int getAnaulSalary(int Salario){
        Salario = Salario + 10000;
        return Salario *13;
    }
}
