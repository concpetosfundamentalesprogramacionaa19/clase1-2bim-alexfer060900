/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean bandera = true;
        double nota;
        int opcion;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);
        int[] datos = new int[6];
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20",
                            "20.1-∞"};
        while (bandera == true){
         System.out.println("Ingrese la nota del estudiante por favor.");
        nota = entrada.nextDouble();
        contador = contador + 1;
        if(nota >= 0 && nota <=8){
            datos[0] = datos[0] + 1;
        }else{
            if(nota >= 8.1 && nota <= 12){
                datos[1] = datos[1] + 1;
            }else{
                if (nota >= 12.1 && nota <= 16){
                  datos[2] = datos[2] + 1;  
                }else{
                    if(nota >= 16.1 && nota <= 19){
                        datos[3] = datos[3] + 1;
                    }else{
                        if (nota >= 19.1 && nota <= 20){
                            datos[4] = datos[4] + 1;
                        }else{
                            datos[5] = datos[5] + 1;
                        }
                    }
                }
                
            }
        }
            System.out.println("Presione 1 si desea ingresar mas notas, o 2 "
                    + "para salir.");
            opcion = entrada.nextInt();
            if (opcion == 1){
                bandera = true;
            }else{
                bandera = false;
            }
        }
        
        
        System.out.printf("Notas ingresadas: %d\nRangos:\n", contador);
        for(int i = 0; i<datos.length; i++){
            System.out.printf("%s = %d\n", rangos[i], datos[i]);
        }
        


    }
}
