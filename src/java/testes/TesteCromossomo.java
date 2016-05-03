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
        Ponto[] pontos = {new Ponto(), new Ponto(), new Ponto(), new Ponto(5, 4)};

        Cromossomo c = new Cromossomo(pontos);
        System.out.println(c);
    }
}
