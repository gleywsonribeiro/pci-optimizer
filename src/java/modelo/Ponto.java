/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import static java.lang.Math.*;
import java.util.Random;

/**
 *
 * @author gleyw
 */
public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    public Ponto() {
        Random random = new Random();
        this.x = random.nextDouble() * 10;
        this.y = random.nextDouble() * 10;
    }
    

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public static double distancia(Ponto p1, Ponto p2) {
        return sqrt(pow(p1.x - p2.x,2) + pow(p1.y - p2.y, 2));
    }

    @Override
    public String toString() {
        return "["+x+","+y+"]";
    }
    
    
}
