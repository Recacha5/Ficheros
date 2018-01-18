/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class Menu {
    
    public static int menu(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-------------------Menú Fichero-------------------");
        System.out.println("1- Consultar ficheros.");
        System.out.println("2- Renombrar fichero.");
        System.out.println("3- Consultar info. fichero.");
        System.out.println("4- Convertir los nombres de ficheros a mayúsculas.");
        System.out.println("5- Convertir los nombres de ficheros a minúsculas.");
        System.out.println("6- Salir.");
        System.out.println("--------------------------------------------------");
        
        System.out.println("Selecciona opción");
        return leer.nextInt();
        
    }
    
}
