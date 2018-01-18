/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Alex Recacha
 */
public class IO {

    public static void escribir(File fichero, String cargado[]) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(fichero);
            pw = new PrintWriter(fw);

            for (String c : cargado) {
                if (c != null) {
                    pw.println(c);
                }
            }

        } catch (IOException ex) {
            System.err.println("Error al escribir");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
                if (pw != null) {
                    pw.close();
                }
            } catch (IOException ex) {
                System.err.println("Error al escribir");
            }
        }
        if (pw != null) {
            pw.close();
        }
    }
public static void cargar(File fichero, String cargado[]){
        
        FileReader fr = null;
        BufferedReader br = null;
        String nombre;
        int contador = 0;

        try {
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            while ((nombre = br.readLine()) != null) {
                cargado[contador] = nombre;
                contador++;
            }
        } catch (IOException ex) {
            System.err.println("Error en cargar fichero");
        } finally {

            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.err.println("Error en cargar fichero");
            }
        }
        
    }
    
}
