/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesyobjetos;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Test {
    private static Object lector;
     public static void main(String[] args) {
         Punto punto1 = new Punto();
         Punto punto2 = new Punto(100,1000);
         Scanner keyboard = new Scanner(System.in);
         Circulo circulo1 = new Circulo (3,3,20);
         Circulo circulo2 = new Circulo (punto2,100);
         circulo1.getCentro().setx(5);
         circulo2.setCentro(punto1);
         System.out.println("Inroduce nuevo radio");
         int aux = lector.nextInt();
         circulo1.setRadio)radio);
         System.out.println(punto1.getx());
     }
}
