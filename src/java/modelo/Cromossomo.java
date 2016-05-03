/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author Gleywson Ribeiro
 */
public class Cromossomo {

    private int[] caminho;
    private Ponto[] pontos;

    public Cromossomo(Ponto[] points) {
        caminho = new int[points.length];
        inicializa();
    }

    public int getTamanho() {
        return caminho.length;
    }

    public Ponto[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto[] pontos) {
        this.pontos = pontos;
    }
    
    private void inicializa() {
        for (int i : caminho) {
            i = 0;
        }
        
        Random random = new Random();
        
    }

    @Override
    public String toString() {
        String saida = "";
        saida += caminho[0];
        for (int i = 1; i < caminho.length; i++) {
            saida += "-" + caminho[i];
        }
        
        return saida;
    }
    
    
}
