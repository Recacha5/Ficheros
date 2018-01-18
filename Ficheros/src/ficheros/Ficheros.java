/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import menus.Menu;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class Ficheros {

    public static void consultarFicheros(File f) {

        File[] directorio = f.listFiles();
        for (File i : directorio) {
            if (i.isFile()) {
                System.out.println(i.getName());
            }
        }
    }

    public static void renombrarFichero(File f) {
        Scanner leer = new Scanner(System.in);
        String nuevoNombre;
        File[] directorio = f.listFiles();
        System.out.println("Dime el fichero que quieres renombrar(incluida extension)");
        nuevoNombre = leer.nextLine().trim();
        for (File i : directorio) {
            if (i.isFile() && i.getName().equalsIgnoreCase(nuevoNombre)) {
                System.out.println("Cómo lo quieres llamar?");
                File nuevo = new File(i.getParent() + "\\" + leer.nextLine().trim());
                i.renameTo(nuevo);
            }
        }
    }

    public static void mayusculas(File f) {
        File[] directorio = f.listFiles();
        for (File i : directorio) {

            File nuevo = new File(i.getParent(), "\\" + i.getName().toUpperCase());
            i.renameTo(nuevo);
        }
    }

    public static void minusculas(File f) {
        File[] directorio = f.listFiles();
        for (File i : directorio) {

            File nuevo = new File(i.getParent(), "\\" + i.getName().toLowerCase());
            i.renameTo(nuevo);
        }
    }

    public static void mostrarDatos(File f) {
        File[] directorio = f.listFiles();
        System.out.println("Nombre del fichero: " + f.getName() + "\n"
                + "Ruta del directorio: " + f.getPath() + "\n"
                + "Ruta absoluta del fichero: " + f.getAbsolutePath() + "\n"
                + "Tamaño del fichero: " + f.getTotalSpace() + "\n"
                + "Puede ser leido: " + "\n"
                + "Puede ser escrito: ");

    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        String cargado[] = new String[10];

        File f = new File("C:\\Pruebas");

        while (bandera) {
            switch (Menu.menu()) {

                case 1: consultarFicheros(f);
                        System.out.println("Pulsa enter para continuar...");
                        leer.nextLine();
                        break;
                case 2: renombrarFichero(f);
                        break;
                case 3: mostrarDatos(f);
                        System.out.println("Pulsa enter para continuar...");
                        leer.nextLine();
                        break;
                case 4: mayusculas(f);
                        break;
                case 5: minusculas(f);
                        break;
                case 6: bandera = false;
                        break;
            }
        }
    }

}
