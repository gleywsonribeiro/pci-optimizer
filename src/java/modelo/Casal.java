/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gleywson
 */
public class Casal {
    private Cromossomo pai;
    private Cromossomo mae;

    public Casal(Cromossomo pai, Cromossomo mae) {
        this.pai = pai;
        this.mae = mae;
    }

    public Cromossomo getPai() {
        return pai;
    }

    public void setPai(Cromossomo pai) {
        this.pai = pai;
    }

    public Cromossomo getMae() {
        return mae;
    }

    public void setMae(Cromossomo mae) {
        this.mae = mae;
    }


    public Cromossomo[] cruza(float taxaDeMutacao) {
        return Cruzamento.cruza(pai, mae, taxaDeMutacao);
    }

    
    public Cromossomo[] getConjuges() {
        Cromossomo[] pais = {pai, mae};
        return pais;
    }
}
