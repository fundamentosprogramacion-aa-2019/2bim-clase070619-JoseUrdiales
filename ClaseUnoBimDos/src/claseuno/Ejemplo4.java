/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseuno;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class Ejemplo4 {
    public static void main(String[] args) {
        // Declaro variables.
        Scanner entrada = new Scanner(System.in);
        String reporteFinal = "";
        boolean bandera = true;
        int seguir = 0;
        int tipoPelicula = 0;
        String cadena = "";
        // Declaro las 2 matrices.
        String [] peliculas = {"Comedia", "Terror", "Drama", "Familiar"};
        int [] seleccionPelicula = new int [4];
       
        // Proceso para llenar los datos al arreglo de respuesta. 
        while (bandera == true){
            System.out.println("\n---Peliculas---\n1. Comedia\n2. Terror\n3. "
                + "Drama\n4. Familiar ");
            System.out.println("Ingrese el tipo de pelicula que sea de su "
                    + "preferencia:"); 
            tipoPelicula = entrada.nextInt();
            
            System.out.println("Si desea seguir el ciclo ingrese cualquier "
                    + "numero, caso contrario ingrese el numero 0"); 
            seguir = entrada.nextInt();
            /* los if son para saber la cantidad del tipo de peliculas que 
             * selecciona cada usuario.
}            */
            if(tipoPelicula == 1){
                seleccionPelicula[0] = seleccionPelicula[0] + 1;
           } else {
                if(tipoPelicula == 2){
                    seleccionPelicula[1] = seleccionPelicula[1] + 1;
                } else {
                    if(tipoPelicula == 3){
                        seleccionPelicula[2] = seleccionPelicula[2] + 1;
                    } else {
                        if(tipoPelicula == 4){
                            seleccionPelicula[3] = seleccionPelicula[3] + 1;
                        }
                    }
                }
            }
            
            if (seguir == 0) {
                bandera = false;
            }
        }
        
        reporteFinal = String.format("%s\n---Reporte de Preferencia de "
                + "Peliculas---\n", reporteFinal);
        
        // los for son para poner los asteriscos.
        
        for (int i = 0; i < seleccionPelicula.length; i++){
            int j = seleccionPelicula[i];
            String asterisco = "";
            
            for (int a = 0; a < j; a++) {
                asterisco = String.format("%s*", asterisco);
            }
        
            reporteFinal = String.format("%s %s: %s\n"
                     , reporteFinal, peliculas[i], asterisco);
        }
        
        // Aquí declaro el String.format.
        
        System.out.printf("%s\n", reporteFinal);
    }
}
