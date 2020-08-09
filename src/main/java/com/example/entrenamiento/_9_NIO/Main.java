package com.example.entrenamiento._9_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("entrenamiento","exp.txt");
        Path path2 = Paths.get("C:\\Users\\Admin\\workspace\\entrenamiento");
        Path path4 = Paths.get("C:\\Users\\Admin\\workspace\\entrenamiento2\\target");
        Path path5 = Paths.get("C:\\Users\\..\\workspace\\.\\target");

        System.out.println("File exist : " + Files.exists(path1));
        System.out.println("Is directory : " + Files.isDirectory(path2));
        //Files.createDirectory(Paths.get("C:\\Users\\Admin\\workspace\\entrenamiento\\folder"));
        Files.deleteIfExists(Paths.get("C:\\Users\\Admin\\workspace\\entrenamiento\\folder"));

        System.out.println("Root : " + path4.getRoot());
        System.out.println("Is absolute :" + path1.isAbsolute());
        if(!path1.isAbsolute())
        System.out.println("To absolute path :" + path1.toAbsolutePath());

        System.out.println("Path normalizado : " + path5.normalize());
        System.out.println("Path relativo : "  + path2.relativize(path4));
        System.out.println("Sub path : " + path2.subpath(0,2));

        System.out.println("Iterando todos los elementos :");
        for (int i = 0; i < path4.getNameCount() ; i++) {
            System.out.println(path4.getName(i));

        }
        System.out.println("Resolve " + path1.resolve(path2));

    }

}
