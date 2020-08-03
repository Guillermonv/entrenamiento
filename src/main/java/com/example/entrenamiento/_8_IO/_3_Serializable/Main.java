package com.example.entrenamiento._8_IO._3_Serializable;

import java.io.*;

class Persona implements Serializable {
    private String name;
    private transient int edad;

    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }
}
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona persona = new Persona("Jhon",32);
        String fileName ="persona.ser";
        Persona personaDeserializada = null;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(persona);
            System.out.println("Serializacion completa");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fileInputStream);

        personaDeserializada = (Persona) in.readObject();
        System.out.println("Deserializacion completa");
        System.out.println();
        System.out.println("Nombre de la persona " + personaDeserializada.getName());
        System.out.println("Edad de la persona " + personaDeserializada.getEdad());


    }
}
