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
        Scanner entrada = new Scanner(System.in);
        String reporteFinal = "";
        boolean bandera = true;
        int seguir = 0;
        int tipoPelicula = 0;
       
        String [] peliculas = {"Comedia", "Terror", "Drama", "Familiar"};
        int [] seleccionPelicula = new int [4];
       
        // proceso para llenar los datos al arreglo de respuesta
        while (bandera == true){
            System.out.println("\n---Peliculas---\n1. Comedia\n2. Terror\n3. "
                + "Drama\n4. Familiar ");
            System.out.println("Ingrese el tipo de pelicula que sea de su "
                    + "preferencia:"); 
            tipoPelicula = entrada.nextInt();
            
            System.out.println("Desea seguir el ciclo, ingrese numero 0"); 
            seguir = entrada.nextInt();
            
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
        
        for(int i = 0; i<seleccionPelicula.length; i++){
             reporteFinal = String.format("%s %s: %d\n"
                     , reporteFinal, peliculas[i], seleccionPelicula[i]); 
        }
        
        System.out.printf("%s\n", reporteFinal);
    }
}
