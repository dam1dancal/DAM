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
public class Punto {

    private int x;
    private int y;
    public Punto(){
        x=100;
        y=50;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public void setx(int x){
        this.x=x;
    }
    public void sety(int y){
        this.y=y;
    }
}
