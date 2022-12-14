package com.company;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class EntradaSalida {

    public static void copiaFichero(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
