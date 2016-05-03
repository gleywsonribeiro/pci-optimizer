/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import modelo.Cromossomo;

/**
 *
 * @author Gleywson Ribeiro
 */
public class TesteCromossomo {

    public static void main(String[] args) {
        Cromossomo[] galera = new Cromossomo[10];
        int nPontos = 20;
        
        for (int i = 0; i < galera.length; i++) {
            galera[i] = new Cromossomo(nPontos);
        }
       
        for (Cromossomo cromossomo : galera) {
            System.out.println(cromossomo);
        }
        
        System.out.println("\nVerificando a mutacao");
        
        Cromossomo mutavel = new Cromossomo(10);
        float tx = 0.95f;
        
        System.out.println("antes da mutacao: ");
        System.out.println(mutavel);
        
        System.out.println("depois da mutacao:");
        mutavel.mutacao(tx);
        System.out.println(mutavel);
        
        
        
    }
}
