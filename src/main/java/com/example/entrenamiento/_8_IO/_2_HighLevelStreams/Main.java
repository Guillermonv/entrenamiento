package com.example.entrenamiento._8_IO._2_HighLevelStreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


//reader and Writer are for reading/writing text content. InputStream OutputStream are for binary content.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

/*       try (InputStream in = new FileInputStream("C:\\Users\\Admin\\workspace\\entrenamiento\\source.txt");
             OutputStream out = new FileOutputStream(new File("C:\\Users\\Admin\\workspace\\entrenamiento\\dest.txt"))) {
            int b;
            while((b=in.read())!=-1){
                out.write(b);
            }
        }
*/
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Admin\\workspace\\entrenamiento\\source.txt"));
        String caracter;
        List<String> palabras = new ArrayList<>();
        while((caracter =reader.readLine())!=null){
                palabras.add(caracter);
        }
        palabras.stream().forEach(System.out::println);

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\workspace\\entrenamiento\\dest.txt"));
        for (String word : palabras){
            writer.write("\n");
            writer.write(word);
        }
        writer.flush();
        writer.close();
    }
}

