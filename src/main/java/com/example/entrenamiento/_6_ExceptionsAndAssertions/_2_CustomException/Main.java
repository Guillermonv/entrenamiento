package com.example.entrenamiento._6_ExceptionsAndAssertions._2_CustomException;

class EdadException extends Exception{
    EdadException(){
        super();
    }
    EdadException(String mensaje){
        super(mensaje);
    }
    EdadException(Exception e){
        super(e);
        e.printStackTrace();
    }

}
public class Main {
    public static void main(String[] args) throws EdadException {
        arrojar();
    }

    static void arrojar () throws EdadException {
        throw new EdadException("La persona es menor de edad");
    }
}
