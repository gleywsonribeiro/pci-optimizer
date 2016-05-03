/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import modelo.Cromossomo;
import modelo.Ponto;

/**
 *
 * @author Gleywson Ribeiro
 */
public class TesteCromossomo {

    public static void main(String[] args) {
        Ponto[] pontos = {new Ponto(0, 0), new Ponto(3, 0), new Ponto(5, 0)};
        
//        for (int i = 0; i < pontos.length; i++) {
//            pontos[i] = new Ponto();
//        }
        
        

        System.out.println("mostrando os pontos");
        for (Ponto ponto : pontos) {
            System.out.print(ponto + " ");
        }
        System.out.println("");
        
        Cromossomo[] galera = new Cromossomo[10];
        
        
        for (int i = 0; i < galera.length; i++) {
            galera[i] = new Cromossomo(pontos);
        }
       
        for (Cromossomo cromossomo : galera) {
            System.out.println(cromossomo + " Fitness: "+cromossomo.getFitness());
        }
        
        System.out.println("\nVerificando a mutacao");
        
        Cromossomo mutavel = new Cromossomo(pontos);
        float tx = 0.95f;
        
        System.out.println("antes da mutacao: ");
        System.out.println(mutavel);
        
        System.out.println("depois da mutacao:");
        mutavel.mutacao(tx);
        System.out.println(mutavel);
        
        System.out.println("Fitness do mutavel: ");
        System.out.println(mutavel.getFitness());
        
        
        
    }
}
