/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class Ficheros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String ruta;
        String cargado[];
        System.out.println("Dime la ruta sobre la que quieres trabajar");
        ruta = leer.nextLine().trim();
        
        File fichero = new File(ruta);
        
        
    }
    
}
