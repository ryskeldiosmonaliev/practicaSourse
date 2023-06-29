package javaCore.file;

import java.io.File;
import java.io.IOException;

/**
 *   output stream
 * application ------>file
 *
 *
 *    input stream
 * application <-------file
 * */
public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/text.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists()); // сущестуюет ли файл
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());

        File dr = new File("resources/test/dir");
        dr.mkdir();
        dr.list();
    }
}
