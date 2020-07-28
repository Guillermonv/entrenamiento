package com.example.entrenamiento._8_IO;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Admin\\workspace\\entrenamiento\\");
        System.out.println("File exist : " + file.exists());
       // file.mkdir();
        file.createNewFile();
        file.renameTo(new File(file.getParent().concat("\\new_test.jar")));
        if(file.exists()){
            System.out.println("FULL PATH : " + file.getAbsolutePath());
            System.out.println("GET PARENT  : " + file.getParent());
            if(file.isFile()){
                System.out.println("SIZE : " + file.length());
            }
            else{
                for(File subfile : file.listFiles()){
                    System.out.println(subfile.getName());
                }
            }
        }

    }
}
