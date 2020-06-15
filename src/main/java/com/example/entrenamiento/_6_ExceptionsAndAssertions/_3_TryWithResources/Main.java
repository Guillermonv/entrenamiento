package com.example.entrenamiento._6_ExceptionsAndAssertions._3_TryWithResources;

class Service implements AutoCloseable {
    String resourceName = "layer de servicio";

    void ejecutar() throws Exception {
        throw  new Exception();

    }
    @Override
    public void close() throws Exception {
        System.out.println("cerrando el recurso " +resourceName);
    }
}

class ConexionDB implements AutoCloseable {
    String resourceName = "layer de persistencia";
    void ejecutar(){
        System.out.println("ejecutando el recurso " + resourceName);
    }
    @Override
    public void close() throws Exception {
        System.out.println("cerrando el recurso " +resourceName);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        try(Service service = new Service();ConexionDB conexionDB = new ConexionDB()){
            service.ejecutar();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Final");
        }
    }
}

