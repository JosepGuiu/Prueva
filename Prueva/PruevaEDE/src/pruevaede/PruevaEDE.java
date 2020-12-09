/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruevaede;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Josep Guiu
 */
public class PruevaEDE {

    final static int NUMRO_ALUMNOS = 35;                                        //El numero de notas viene dado por cada alumno existente.

    public static void main(String[] args) {
        int[] intArray = new int[35];                                           //Aplicamos que la Array es de 35 posiciones.
        int controlAlumnos = 0;                                                 //Es para hacer un control, para ver por que nota vas.
        int notaGrande = 0;                                                     //Para ver que nota es la mas grande.
        int notaIntroducida = 0;                                                //El usuario introducira la nota y se guarda en esta variable.
        int todasLasNotas = 0;                                                  //Suma de todas las notas para calcular la media.
        float media;                                                            //Usada junto a todasLasNotas para calcular la media.        
        Scanner sc = new Scanner(System.in);                                    //Creamos la variable para escanear la nota introducida.

        System.out.println("Vamos a introducir las notas de nuestros 35 alumnos,"
                + " recuerda que los numeros introducidos seràn entre el 0 y el 10");

        for (int i = 0; i < NUMRO_ALUMNOS; i++) {                               //Establecemos el bucle en la posición inicial 0 y final 34 = 35 posiciones.
            controlAlumnos++;                                                   //Cada vez que el bucle se inicializa suma +1 a controlAlumnos, es la nota por la que vamos.
            do {
                System.out.print("Inserta la " + controlAlumnos + "ª nota:");
                notaIntroducida = sc.nextInt();                                 //Escaneo de variables numericas enteras, notas del 0 al 10.
            } while (notaIntroducida < 0 || notaIntroducida > 10);              //Bucle de control de entrada de datos, si los numeros son <10 o >0 vuelve a pedir nota, ya que no es apta.
            intArray[i] = notaIntroducida;                                      //Ponemos que la posicion de la i será la que ocupa en la array con el valor insertado.
            todasLasNotas = todasLasNotas + notaIntroducida;                    //Sumamos las notas
            if (notaIntroducida > notaGrande) {                                 //Verificamos que nota es más grande, si la que introducimos es más grande que notaGrande se sustituye.
                notaGrande = notaIntroducida;
            }
        }
        media = ((float) todasLasNotas / (float) NUMRO_ALUMNOS);                //Calculo de la media con decimales.
        System.out.println("La nota mayor es: " + notaGrande);                  //Vemos que nota es mas grande.
        System.out.println(Arrays.toString(intArray));                          //Vemos la tabla de las notas con Arrays.toString().
        System.out.println("La suma de las notas es de: " + todasLasNotas);     //Vemos que suman todas las notas .
        System.out.print("La nota media de la clase es de: ");                  //Vemos la media con un decimal gracias a System.out.printf("%.1f", media).
        System.out.printf("%.1f", media);
        System.out.println("");
    }
}
//PARA VER LOS CAMBIOS ESTABLECIDOS EN EL DOCUMENTO HAGO ESTA LÍNIA