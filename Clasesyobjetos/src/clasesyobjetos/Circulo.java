/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesyobjetos;

/**
 *
 * @author Daniel
 */
public class Circulo {
    private Punto centro = new Punto();
    private int radio=2;
    
    public Circulo(){
        centro =new Punto();
        radio = 5;
    }
     public Circulo(Punto centro, int radio){
        //centro= new Punto();
        this.radio = radio;
        this.centro=centro;
    }
       public Circulo(int x, int y, int radio){
         this.centro= new Punto(x,y);
        this.radio = radio;
    }
       public int getRadio(){
           return radio;
       }
       public Punto getCentro(){
           return centro;
       }
       public int getx(){
           return centro.getx();
       }
       
       public void setRadio(int radio){
           this.radio = radio;
       }
       public void setCentro (Punto nuevoCentro){
           centro= nuevoCentro;
       }
}
