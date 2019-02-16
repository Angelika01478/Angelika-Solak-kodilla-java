package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile(){
        ClassLoader classLoader= getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
       // File file = new File("C:\\Users\\Michaał\\Documents\\Projects\\kodilla-course\\kodilla-exception\\src\\main\\resources\\file\\names.txt");
        Path path = Paths.get(file.getPath()); //za pomocą klasy Paths modyfikujemy ścieżkę typu String na obiekt Path


        try {

           Stream<String> fileLines= Files.lines(path);
           fileLines.forEach(System.out::println);
        }catch (IOException e){
            System.out.println("ops, something went wrong");
        }

    }
}
