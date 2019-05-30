/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;

/**
 *
 * @author alexa
 */
public class DemoRandomico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicios con valores randomicos. 
        Random aleatorios = new Random();
        int v = aleatorios.nextInt(4);
        System.out.printf("%d\n", v);
    }
    
}
