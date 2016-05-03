/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gleywson Ribeiro
 */
public class Populacao {

    private final Ponto[] pontos = {
        new Ponto(6.374781973111854, 1.7077137301159973),
        new Ponto(3.718047055941631, 7.335271094134054),
        new Ponto(6.513150871230218, 2.343947642049591),
        new Ponto(3.7306984148111297, 3.144626386024302),
        new Ponto(3.0006151343067264, 6.511894364603286),
        new Ponto(8.889770404376007, 5.630222118183963),
        new Ponto(3.9572909740571505, 8.412635521236174),
        new Ponto(6.4514925837046135, 4.33744010763725),
        new Ponto(1.8876765757897196, 9.16318130072463),
        new Ponto(8.490213413055498, 9.762449110519636),
        new Ponto(7.704734409109559, 9.41717641629299),
        new Ponto(0.20637782015899941, 2.9629642811321166),
        new Ponto(1.7604980450566343, 2.1253435678157375),
        new Ponto(0.2230820241753395, 7.68432755375022),
        new Ponto(9.67079988430404, 7.018150025446102),
        new Ponto(5.416071133820176, 5.781876730141087),
        new Ponto(0.6421923201723023, 0.8332906260910578),
        new Ponto(0.39579616873911316, 6.921010222256929),
        new Ponto(7.0995791062103155, 1.056505199806722),
        new Ponto(8.212009718910865, 3.6792576756236492)
    };
    private List<Cromossomo> individuos;
    private List<Cromossomo> temp;
    private final int tamanho;
    private boolean elitismo;

    public Populacao(int tamanho) {
        this.tamanho = tamanho;
        individuos = new ArrayList<>();
        inicialize();
    }

    public void geracao(double txCruzamento, double txMutacao) {
        Random r = new Random();
        double chanceDeCruzamento = r.nextDouble();

        if (isElitismo()) {
            temp.add(elitismo());
        }

        while(temp.size() < this.tamanho) {
            xxx
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public Ponto[] getPontos() {
        return pontos;
    }

    public List<Cromossomo> getIndividuos() {
        return individuos;
    }

    public void setElitismo(boolean elitismo) {
        this.elitismo = elitismo;
    }

    public boolean isElitismo() {
        return elitismo;
    }

    private void inicialize() {
        for (int i = 0; i < tamanho; i++) {
            individuos.add(new Cromossomo(pontos));
        }
    }

   
    private Cromossomo elitismo() {
        Cromossomo maisApto = null;
        double valor = Double.MAX_VALUE;

        for (Cromossomo individuo : individuos) {
            if (individuo.getFitness() < valor) {
                valor = individuo.getFitness();
                maisApto = individuo;
            }
        }
        return maisApto;
    }
    
    private Casal casamento() {
        Cromossomo pai = seleciona(selecao);

        Cromossomo mae;
        do {
            mae = seleciona(selecao);
        } while (pai.equals(mae));

        return new Casal(pai, mae, crossover);
    }

    @Override
    public String toString() {
        String saida = "";

        for (Cromossomo next : individuos) {
            saida += next.toString() + "\n";
        }
        return saida;
    }

}
