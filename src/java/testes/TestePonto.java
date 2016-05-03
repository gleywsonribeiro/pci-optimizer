/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import modelo.Ponto;

/**
 *
 * @author Gleywson Ribeiro
 */
public class TestePonto {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(Ponto.distancia(p1, p2));
        
    }
}
