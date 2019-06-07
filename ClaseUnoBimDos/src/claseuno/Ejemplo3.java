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
public class Ejemplo3 {

    /* generar un programa que permita determinar el numero de vocales 
     * utilizadas por usuario en un conjunto de palabras de acuerdo al primer 
     * caracter.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String reporteFinal = "";
        boolean bandera = true;
        int seguir = 0;
        String palabra = "";
       
        String[] vocales = {"a", "e", "i", "o",
            "u"};
        int[] contador = new int[5];

        // proceso para llenar los datos al arreglo de respuesta
        while (bandera == true) {
            System.out.println("Ingrese el texto o palabra que desee:");
            palabra = entrada.nextLine();

            System.out.println("\nDesea seguir el ciclo, ingrese numero 0");
            seguir = entrada.nextInt();
            entrada.nextLine();
            /* Uso char para seleccionar la posición 0 de la palabra 
             * que ingrese el usuario.
             */
            char valor = palabra.charAt(0);
            switch (valor) {
                case 'a':
                case 'A':
                    contador[0] = contador[0] + 1;
                    break;
                case 'e':
                case 'E':
                    contador[1] = contador[1] + 1;
                    break;
                case 'i':
                case 'I':
                    contador[2] = contador[2] + 1;
                    break;
                case 'o':
                case 'O':
                    contador[3] = contador[3] + 1;
                    break;
                case 'u':
                case 'U':
                    contador[4] = contador[4] + 1;
                    break;
                default:
                    System.out.printf("\nLa palabra no contiene ninguna "
                            + "vocal\n\n");
            }
            if (seguir == 0) {
                bandera = false;
            }
        }
        reporteFinal = String.format("%s----Reporte Final----\n\n", 
                reporteFinal);
        for (int i = 0; i < contador.length; i++) {
            reporteFinal = String.format("%sVocal  %s - numero de veces "
                    + "usada: %d\n",reporteFinal, vocales[i], contador[i]);
        }
        // Declaro el String.format
        System.out.printf("%s\n", reporteFinal);
    }
}
