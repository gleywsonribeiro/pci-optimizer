/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gleyw
 */
public class Ag {
    private int tmPopulacao;
    private int numeroGeracoes;
    private double txMutacao;
    private double txCruzamento;
    private boolean elitismo;
    
    private final List<Cromossomo> melhoresIndividuos;
    private final List<Cromossomo> pioresIndividuos;
    private final List<Float> desvioPadrao;
    private final List<Float> media;

    public Ag() {
        this.melhoresIndividuos = new ArrayList<>();
        this.pioresIndividuos = new ArrayList<>();
        this.media = new ArrayList<>();
        this.desvioPadrao = new ArrayList<>();
    }
    
    public void run() {
        Populacao p = new Populacao(tmPopulacao);
        p.setElitismo(elitismo);
        
        for(int i = 0; i <= numeroGeracoes; i++) {
            p.geracao(txCruzamento, txMutacao);
            melhoresIndividuos.add(p.getMelhorIndividuo());
            pioresIndividuos.add(p.getPiorIndividuo());
            media.add(p.getMedia());
            desvioPadrao.add(p.getDesvioPadrao());
            
        }
    }

    public int getTmPopulacao() {
        return tmPopulacao;
    }

    public void setTmPopulacao(int tmPopulacao) {
        this.tmPopulacao = tmPopulacao;
    }

    public int getNumeroGeracoes() {
        return numeroGeracoes;
    }

    public void setNumeroGeracoes(int numeroGeracoes) {
        this.numeroGeracoes = numeroGeracoes;
    }

    public double getTxMutacao() {
        return txMutacao;
    }

    public void setTxMutacao(double txMutacao) {
        this.txMutacao = txMutacao;
    }

    public double getTxCruzamento() {
        return txCruzamento;
    }

    public void setTxCruzamento(double txCruzamento) {
        this.txCruzamento = txCruzamento;
    }

    public boolean isElitismo() {
        return elitismo;
    }

    public void setElitismo(boolean elitismo) {
        this.elitismo = elitismo;
    }

    public List<Float> getMedia() {
        return media;
    }

    public List<Cromossomo> getMelhoresIndividuos() {
        return melhoresIndividuos;
    }

    public List<Cromossomo> getPioresIndividuos() {
        return pioresIndividuos;
    }

    public List<Float> getDesvioPadrao() {
        return desvioPadrao;
    }
    
    
    
}
