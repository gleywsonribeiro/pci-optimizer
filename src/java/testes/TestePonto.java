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
        Ponto[] pontos = new Ponto[20];
        
        for (int i = 0; i < pontos.length; i++) {
            pontos[i] = new Ponto();
        }
        
        for (Ponto ponto : pontos) {
            System.out.println(ponto);
        }
        
    }
}
