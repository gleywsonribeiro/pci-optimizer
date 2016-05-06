/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Gleywson Ribeiro
 */
public class Cromossomo implements Comparable<Cromossomo> {

    private final List<Integer> caminho;
    private final Ponto[] pontos;

    public Cromossomo(Ponto[] points) {
        this.caminho = new ArrayList();
        this.pontos = points;

        for (int i = 0; i < points.length; i++) {
            caminho.add(i);
        }
        Collections.shuffle(caminho);
    }

    public int getTamanho() {
        return caminho.size();
    }

    public Ponto[] getPontos() {
        return pontos;
    }

    public Cromossomo[] cruza(Cromossomo conj, double txMutacao) {
        Cromossomo[] filhos = new Cromossomo[2];
        Random random = new Random();
        //Inicializacao com cromossomos quaisquer, no final eles sao setados com
        //com os filhos resultantes do cruzamento
        for (int k = 0; k < filhos.length; k++) {
            filhos[k] = new Cromossomo(pontos);
            filhos[k].caminho.clear();
        }
        
        //--
        int pontoDeCorte = random.nextInt(getTamanho() - 1);

        for (int i = 0; i < this.getTamanho(); i++) {
            if (i < pontoDeCorte) {
                filhos[0].caminho.add(i, this.caminho.get(i));
                filhos[1].caminho.add(i, conj.caminho.get(i));
            } else {
                filhos[1].caminho.add(i, this.caminho.get(i));
                filhos[0].caminho.add(i, conj.caminho.get(i));
            }
        }
        for (Cromossomo filho : filhos) {
            //filho.caminho = new ArrayList<>(new HashSet<>(filho.caminho));
            HashSet semRepeticao = new HashSet(filho.caminho);
            filho.caminho.clear();
            filho.caminho.addAll(semRepeticao);
            
            if(filho.caminho.size() < getTamanho()) {
                Cromossomo c = new Cromossomo(pontos);
                for (Integer next : c.caminho) {
                    if(!filho.caminho.contains(next)) {
                        filho.caminho.add(next);
                    }
                }
            }
        }
        for (Cromossomo filho : filhos) {
            filho.mutacao(txMutacao);
        }
        return filhos;
    }

    public void mutacao(double txMutacao) {
        Random gerador = new Random();
        double probabilidade = gerador.nextDouble();

        if (probabilidade < txMutacao) {
            int posicao1 = gerador.nextInt(getTamanho());
            int posicao2;
            do {
                posicao2 = gerador.nextInt(getTamanho());
            } while (posicao1 == posicao2);

            int no1 = caminho.get(posicao1);
            int no2 = caminho.get(posicao2);
            caminho.set(posicao1, no2);
            caminho.set(posicao2, no1);
        }
    }

    @Override
    public String toString() {
        String saida = "";
        saida += caminho.get(0);

        for (int i = 1; i < caminho.size(); i++) {
            saida += "-" + caminho.get(i);
        }

        return saida;
    }

    public double getFitness() {
        double fitness = 0;

        for (int i = 0; i < caminho.size() - 2; i++) {
            fitness += Ponto.distancia(pontos[caminho.get(i)], pontos[caminho.get(i + 1)]);
        }

        return fitness;
    }

    @Override
    public int compareTo(Cromossomo ref) {
        if (this.getFitness() < ref.getFitness()) {
            return -1;
        }
        if (this.getFitness() > ref.getFitness()) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Cromossomo)) {
            return false;
        }

        Cromossomo cromossomo = (Cromossomo) object;

        for (int i = 0; i < this.caminho.size(); i++) {
            if(!(Objects.equals(this.caminho.get(i), cromossomo.caminho.get(i)))){
                return false;
            }
        }
        return true;
    }

    
}
