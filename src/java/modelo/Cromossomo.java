/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gleywson Ribeiro
 */
public class Cromossomo {

    private final List<Integer> caminho;

    public Cromossomo(int tamanho) {
        caminho = new ArrayList();
        
        for (int i = 0; i < tamanho; i++) {
            caminho.add(i);
        }
        Collections.shuffle(caminho);
    }

    public int getTamanho() {
        return caminho.size();
    }
    
    public void mutacao(double txMutacao) {
        Random gerador = new Random();
        double probabilidade  = gerador.nextDouble();
        
        if(probabilidade < txMutacao) {
            int posicao1 = gerador.nextInt(getTamanho());
            int posicao2;
            do {
                posicao2 = gerador.nextInt(getTamanho());
            } while(posicao1 == posicao2);
            
            int no1 = caminho.get(posicao1);
            int no2 = caminho.get(posicao2);
            caminho.set(posicao1, no2);
            caminho.set(posicao2, no1);
        }
    } 

    /*
    public void mutacao(double taxa) {
        double probabilidade = new Random().nextDouble();
        
        if(probabilidade < taxa) {
            if(this.alelo == 0) {
                this.setAlelo(1);
            } else {
                this.setAlelo(0);
            }
        }
    }
    */
    
    @Override
    public String toString() {
        String saida = "";
        saida += caminho.get(0);
        
        
        
        for (int i = 1; i < caminho.size(); i++) {
            saida += "-" + caminho.get(i);
        }
        
        return saida;
    }
    
    
}
